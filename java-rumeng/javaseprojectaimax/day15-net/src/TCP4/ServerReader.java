package TCP4;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReader extends  Thread{
    //BS架构原理
    private Socket socket;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);

            // 写响应的网页数据出去
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println(); // 必须换一行
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset='utf-8'>");
            ps.println("<title>");
            ps.println("黑马Java磊哥的视频");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1 style='color:red;font-size=20px'>听黑马Java磊哥的视频</h1>");
            ps.println("</body>");
            ps.println("</html>");

            ps.close();
            socket.close();
        }catch(Exception e){
            System.out.println("客户端下线"+socket.getInetAddress().getHostAddress());

        }

            // 读取管道的消息
            // 3、获取输入流，读取客户端发送的数据

    }
}
