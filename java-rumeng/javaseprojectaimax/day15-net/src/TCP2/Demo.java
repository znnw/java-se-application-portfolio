package TCP2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Demo {
    //tcp多发
    public static void main(String[] args) throws Exception{
        System.out.println("===客户端启动===");
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream os = socket.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容：");
            String data = sc.nextLine();
            if ("exit".equals(data)){
                System.out.println("===客户端退出===");
                socket.close();
                break;
            }

            dos.writeUTF(data);
            dos.flush();
        }

    }

}
