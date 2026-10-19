package UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("===客户端启动===");
        DatagramSocket socket =new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容：");
            String data = sc.nextLine();
            if ("exit".equals(data)){
                System.out.println("===客户端退出===");
                socket.close();
                break;
            }
            byte[] bytes =data.getBytes();

            DatagramPacket packet =new DatagramPacket(bytes,bytes.length,
                    InetAddress.getLocalHost(),8080);
            socket.send(packet);
        }
    }
}
