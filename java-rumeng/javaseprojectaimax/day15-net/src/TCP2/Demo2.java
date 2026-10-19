package TCP2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo2 {
    //tcp多收
    public static void main(String[] args) throws Exception{
        System.out.println("===服务器启动===");
        ServerSocket ss=new ServerSocket(8080);
        Socket socket=ss.accept();
        InputStream is =socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        while (true) {
            String data = dis.readUTF();
            System.out.println("收到客户端"+socket.getPort()+"发来的数据："+data);
            System.out.println("客户端ip:"+socket.getInetAddress().getHostAddress());
            System.out.println("客户端端口:"+socket.getPort());
            System.out.println("---------------------------------");
        }
    }
}
