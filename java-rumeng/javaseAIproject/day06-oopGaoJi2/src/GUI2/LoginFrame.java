package GUI2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame(){
        this.setTitle("登录窗口");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        init();
    }
    private void init(){
        JButton btn = new JButton("登录");

        btn.addActionListener(this);

        JPanel panel = new JPanel();
        this.add(panel);

        panel.add(btn);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "有人点击了登录");
    }
}
