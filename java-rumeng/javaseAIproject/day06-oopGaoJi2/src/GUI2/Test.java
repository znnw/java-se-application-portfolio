package GUI2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();
        jf.add( panel);

        jf.setSize(400,300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb= new JButton("登录");
        jf.add(jb);
        jb.addActionListener(new MyactionListener(jf));
        jf.setVisible( true);
    }
}


class MyactionListener implements ActionListener {
    private JFrame jf;
    public MyactionListener(JFrame jf){
        this.jf=jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf, "有人点击了登录");
    }
}