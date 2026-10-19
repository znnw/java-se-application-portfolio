package ui;

import server.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ClientReaderThread extends  Thread{
    private Socket socket;
    private DataInputStream dis;
    private ClientChatFrame win;
    public ClientReaderThread(ClientChatFrame win,Socket socket) {
        this.socket = socket;
        this.win = win;
    }
    @Override
    public void run() {
        try {
           dis = new DataInputStream(socket.getInputStream());
            while (true) {
                int type = dis.readInt();
                switch (type) {
                    case 1:
                        updateOnlineUsersList();
                        break;
                    case 2:

                        getMsgTowin();
                        break;
                    case 3:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private void getMsgTowin() throws Exception {
        String msg = dis.readUTF();
        win.setMsgToWin(msg);
    }
    // 发送消息给所有在线用户

    // 更新在线用户列表给所有在线用户
    private void updateOnlineUsersList() throws Exception{

        int count= dis.readInt();
        String names[]=new String[count];
        for (int i = 0; i < count; i++){
            String nickname= dis.readUTF();
            names[i]=nickname;
        }
        win.updateOnlineUsers(names);
    }
}
