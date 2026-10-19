package UI;

import bean.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// 自定义登录界面
public class LoginUI extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn == loginButton) {
            login();
        }else{
                System.out.println("注册开始");
            }
        }
        private void login() {
         String loginname = LoginNameField.getText();
         String password = new String(passwordField.getPassword());

         User user = getUserByLoginName(loginname);
         if (user != null && user.getPassword().equals(password)) {
             JOptionPane.showMessageDialog(this, "登录成功！");
             new EmployeeManagerUI(user.getUsername());
             this.dispose();
         } else {
             JOptionPane.showMessageDialog(this, "登录失败,用户不存在！");
         }

        }

        //根据登录名称去查询用户对象返回，查询到用户对象，则登录成功，否则登录失败，使用for循环根据索引遍历
    public User getUserByLoginName(String loginname) {
        for (int i = 0; i < allusers.size(); i++) {
            User user = allusers.get(i);
            if (user.getLoginname().equals(loginname)) {
                return user;
            }
        }
        return null;
    }

    private JTextField LoginNameField; // 用户名输入框
    private JPasswordField passwordField; // 密码输入框
    private JButton loginButton; // 登录按钮
    private JButton registerButton; // 注册按钮

    private static ArrayList<User>allusers=new ArrayList<>();
    static {
        allusers.add(new User("超级管理员","123456","asmin"));
        allusers.add(new User("小王","123456","小王"));
        allusers.add(new User("小张","123456","小张"));
        allusers.add(new User("小李","123456","小李"));
    }

    public LoginUI() {
        super("登录界面");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null); // 居中显示

        createAndShowGUI();

    }

    private void createAndShowGUI() {
        // 创建主窗口
        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 240, 240, 82));

        // 设置字体和颜色
        Font customFont = new Font("楷体", Font.BOLD, 18);
        Color primaryColor = new Color(182, 66, 245);
        Color secondaryColor = new Color(204, 204, 204); // 更浅的颜色用于注册按钮

        // 标题
        JLabel titleLabel = new JLabel("程序员人事管理系统");
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 24));
        panel.add(titleLabel);

        // 用户名标签
        JLabel usernameLabel = new JLabel("用户名: ");
        usernameLabel.setBounds(50, 100, 150, 30);
        usernameLabel.setFont(customFont);
        panel.add(usernameLabel);

        // 用户名输入框
        LoginNameField = new JTextField();
        LoginNameField.setBounds(160, 100, 190, 30);
        LoginNameField.setFont(customFont);
        panel.add(LoginNameField);

        // 密码标签
        JLabel passwordLabel = new JLabel("密    码: ");
        passwordLabel.setBounds(50, 150, 150, 30);
        passwordLabel.setFont(customFont);
        panel.add(passwordLabel);

        // 密码输入框
        passwordField = new JPasswordField();
        passwordField.setBounds(160, 150, 190, 30);
        passwordField.setFont(customFont);
        passwordField.setEchoChar('#');
        panel.add(passwordField);

        // 登录按钮
        loginButton = new JButton("登    录");
        loginButton.setBounds(50, 200, 150, 30);
        loginButton.setFont(customFont);
        loginButton.setBackground(primaryColor);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);
        loginButton.addActionListener(this);

        // 注册按钮
        registerButton = new JButton("注    册");
        registerButton.setBounds(200, 200, 150, 30);
        registerButton.setFont(customFont);
        registerButton.setBackground(secondaryColor);
        registerButton.setForeground(Color.BLACK);
        panel.add(registerButton);
        registerButton.addActionListener(this);

        // 添加面板到窗口
        this.add(panel);
        this.setVisible(true);
    }
}