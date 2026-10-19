package inetaaddress;

import java.net.InetAddress;

public class inetaaddressdemo {
    public static void main(String[] args) {
        //认识inetaddress获取本机IP对象和对方IP对象
        try {
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getHostAddress());

            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            System.out.println(ip2.isReachable(5000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
