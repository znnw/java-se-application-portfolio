package proxy;

public class Test {
    public static void main(String[] args) {

        Star star= new Star("章若楠");
        StarService proxy= proxyUtil.createProxy(star);
        proxy.sing("<红昭愿>");
        System.out.println(proxy.dance());
    }
}
