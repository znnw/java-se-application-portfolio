package UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServiceDemo{
    public static void main(String[] args) throws  Exception{
        System.out.println("===服务器启动===");
        DatagramSocket socket = new DatagramSocket(8080);
        byte [] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        while (true) {
            socket.receive(packet);

            int len=packet.getLength();
            String data = new String(buffer,0,len);
            System.out.println("服务器收到了"+data);

            String ip=packet.getAddress().getHostAddress();
            int port=packet.getPort();
            System.out.println("服务器收到来自:"+ip+"对方端口："+port);

            System.out.println("---------------------------------");
        }

    }
}
