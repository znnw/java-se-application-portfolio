package GUI;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("登录窗口 - 布局管理器演示");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JLabel titleLabel = new JLabel("用户登录系统");
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 18));
        topPanel.add(titleLabel);
        panel.add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 2, 10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel userLabel = new JLabel("用户名:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("密码:");
        JPasswordField passField = new JPasswordField(15);
        JLabel codeLabel = new JLabel("验证码:");
        JTextField codeField = new JTextField(10);

        centerPanel.add(userLabel);
        centerPanel.add(userField);
        centerPanel.add(passLabel);
        centerPanel.add(passField);
        centerPanel.add(codeLabel);
        centerPanel.add(codeField);

        panel.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton loginButton = new JButton("登录");
        JButton registerButton = new JButton("注册");
        JButton cancelButton = new JButton("取消");

        loginButton.setPreferredSize(new Dimension(80, 30));
        registerButton.setPreferredSize(new Dimension(80, 30));
        cancelButton.setPreferredSize(new Dimension(80, 30));

        bottomPanel.add(loginButton);
        bottomPanel.add(registerButton);
        bottomPanel.add(cancelButton);

        panel.add(bottomPanel, BorderLayout.SOUTH);

        jf.add(panel);
        jf.setSize(450, 350);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);

        jf.setVisible(true);

    }
    }
