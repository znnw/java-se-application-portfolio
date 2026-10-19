package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    //定义一个集合容器存储所有登录进来的客户端管道，以便将来群发信息给他们
    //MAp集合
    public static final Map<Socket,String> onLineScokets = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("服务器启动.......");
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            while (true) {

                System.out.println("等待客户端连接.......");
                Socket socket = serverSocket.accept();
                new ServerReaderThread(socket).start();


                System.out.println("一个客户端连接成功.......");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
