package TCP1;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo {
    public static void main(String[] args) throws Exception{
        System.out.println("===客户端启动===");
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream os = socket.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF("hello world");

        socket.close();
    }

}
