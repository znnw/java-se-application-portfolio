package TCP1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        System.out.println("===服务器启动===");
        ServerSocket ss=new ServerSocket(8080);
        Socket socket=ss.accept();
        InputStream is =socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        int id= dis.readInt();
        String data = dis.readUTF();
        System.out.println("id:"+id+" data:"+data);
        System.out.println("客户端ip:"+socket.getInetAddress().getHostAddress());
        System.out.println("客户端端口:"+socket.getPort());
    }
}
