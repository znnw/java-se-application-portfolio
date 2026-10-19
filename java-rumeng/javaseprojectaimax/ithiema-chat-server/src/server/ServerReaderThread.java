package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class ServerReaderThread extends  Thread {
    private Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true) {
                int type = dis.readInt();
                switch (type) {
                        case 1:
                            String nickname = dis.readUTF();
                            Server.onLineScokets.put( socket, nickname);
                            updateClientOnlineUserList();
                        break;
                        case 2:
                            String msg = dis.readUTF();
                            sendMsgToAll(msg);
                        break;
                        case 3:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("客户端退出了..."+socket.getInetAddress().getHostAddress());

            Server.onLineScokets.remove(socket);

            updateClientOnlineUserList();

        }
    }
// 发送消息给所有在线用户
    private void sendMsgToAll(String msg) {
        StringBuilder sb = new StringBuilder();
        String name=Server.onLineScokets.get(socket);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowstr=dtf.format( now);

        String msgResult=sb.append(name).append(":").append(nowstr).append(":").append("\r\n").append(msg).append("\r\n").toString();

        for (Socket socket : Server.onLineScokets.keySet()) {
            try {
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeInt(2);
                dos.writeUTF(msgResult);
                dos.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
// 更新在线用户列表给所有在线用户
    private void updateClientOnlineUserList() {
        Collection<String> onLineUsers=Server.onLineScokets.values();
        for (Socket socket : Server.onLineScokets.keySet()) {
            try {
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeInt(1);
                dos.writeInt(onLineUsers.size());

                for (String onLineUser :onLineUsers) {

                    dos.writeUTF(onLineUser);

                }
                dos.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

