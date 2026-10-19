package GUI;
import javax.swing.*;
import java.awt.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("登录窗口");

        JPanel panel1 = new JPanel();
        jf1.add(panel1);

        jf1.setSize(400,300);
        jf1.setLocationRelativeTo(null);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb= new JButton("登录");
        jf1.add(jb);

        jf1.setVisible(true);



        //布局管理器


    }
}
