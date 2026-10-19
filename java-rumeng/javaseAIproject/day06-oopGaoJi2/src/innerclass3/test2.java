package innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test2 {
    public static void main(String[] args) {
        JFrame win=new JFrame("登录窗口");


        win.setSize(300,200);
        win.setLocationRelativeTo( null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        win.add(panel);

        JButton btn=new JButton("登录");
        win.add(btn);

        btn.addActionListener (new clickListener());
        win.setVisible(true);
    }
}
class clickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("用户点击了登录按钮");
    }
}
