package GUI3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

public class LoginUI extends JFrame {

    // 定义配色方案
    private static final Color PRIMARY_COLOR = new Color(66, 133, 244); // 现代蓝
    private static final Color HOVER_COLOR = new Color(56, 113, 224);
    private static final Color BG_COLOR = new Color(240, 242, 245);
    private static final Color TEXT_COLOR = new Color(50, 50, 50);
    private static final Color PLACEHOLDER_COLOR = new Color(180, 180, 180);

    public LoginUI() {
        // 1. 窗口基础设置
        setTitle("系统登录");
        setSize(850, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true); // 去除系统标题栏
        setBackground(new Color(0, 0, 0, 0)); // 支持透明背景

        // 2. 主面板 (带阴影效果)
        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                // 绘制白色背景圆角矩形
                g2.setColor(Color.WHITE);
                g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, 20, 20));
                g2.dispose();
            }
        };
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        setContentPane(contentPane);

        // 3. 左侧装饰区域
        JPanel leftPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                // 左侧渐变背景
                GradientPaint gp = new GradientPaint(0, 0, PRIMARY_COLOR, 0, getHeight(), new Color(88, 101, 242));
                g2.setPaint(gp);
                // 只绘制左边的圆角
                g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

                // 绘制装饰性圆圈
                g2.setColor(new Color(255, 255, 255, 30));
                g2.fillOval(50, 100, 150, 150);
                g2.fillOval(100, 250, 80, 80);
                g2.dispose();
            }
        };
        leftPanel.setPreferredSize(new Dimension(320, 0));
        leftPanel.setLayout(new GridBagLayout());

        JLabel welcomeLabel = new JLabel("<html><div style='text-align:center; font-size:24px; color:white;'><b>欢迎回来</b><br><span style='font-size:14px; opacity:0.8;'>请登录您的管理员账户</span></div></html>");
        leftPanel.add(welcomeLabel, new GridBagConstraints());

        // 4. 右侧表单区域
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBorder(new EmptyBorder(40, 50, 40, 50));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.weightx = 1.0;

        // 标题
        JLabel titleLabel = new JLabel("用户登录");
        titleLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 28));
        titleLabel.setForeground(TEXT_COLOR);
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 30, 0);
        rightPanel.add(titleLabel, gbc);

        // 用户名输入框
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 15, 0);
        PlaceholderTextField userField = new PlaceholderTextField("用户名");
        rightPanel.add(userField, gbc);

        // 密码输入框
        gbc.gridy = 2;
        PlaceholderPasswordField passField = new PlaceholderPasswordField("密码");
        rightPanel.add(passField, gbc);

        // 登录按钮
        gbc.gridy = 3;
        gbc.insets = new Insets(20, 0, 10, 0);
        ModernButton loginBtn = new ModernButton("登 录");

        // 按钮点击事件
        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if(user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "请输入用户名和密码", "提示", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // 模拟登录加载
            loginBtn.setText("登录中...");
            loginBtn.setEnabled(false);

            new Thread(() -> {
                try { Thread.sleep(1000); } catch (Exception ex) {}
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(this, "登录成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
                    loginBtn.setText("登 录");
                    loginBtn.setEnabled(true);
                });
            }).start();
        });
        rightPanel.add(loginBtn, gbc);

        // 底部注册链接
        gbc.gridy = 4;
        gbc.insets = new Insets(10, 0, 0, 0);
        JLabel footerLabel = new JLabel("<html><center>还没有账号? <a href='#' style='color:#4285F4;'>立即注册</a></center></html>");
        footerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        footerLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rightPanel.add(footerLabel, gbc);

        // 5. 组装
        contentPane.add(leftPanel, BorderLayout.WEST);
        contentPane.add(rightPanel, BorderLayout.CENTER);

        // 6. 窗口拖拽功能 (因为去掉了标题栏)
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            }
            public void mouseReleased(MouseEvent e) {
                setCursor(Cursor.getDefaultCursor());
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth() / 2, e.getYOnScreen() - getHeight() / 2);
            }
        });
    }

    // --- 自定义组件类 (核心美化部分) ---

    // 自定义圆角文本框
    class PlaceholderTextField extends JTextField {
        private String placeholder;
        public PlaceholderTextField(String p) {
            this.placeholder = p;
            setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
            setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(220, 220, 220), 1),
                    BorderFactory.createEmptyBorder(10, 15, 10, 15)));
            setBackground(new Color(250, 250, 250));

            // 简单的占位符逻辑
            addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (getText().equals(placeholder)) {
                        setText("");
                        setForeground(TEXT_COLOR);
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (getText().isEmpty()) {
                        setText(placeholder);
                        setForeground(PLACEHOLDER_COLOR);
                    }
                }
            });
            setText(placeholder);
            setForeground(PLACEHOLDER_COLOR);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    // 自定义圆角密码框
    class PlaceholderPasswordField extends JPasswordField {
        private String placeholder;
        public PlaceholderPasswordField(String p) {
            this.placeholder = p;
            setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
            setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(220, 220, 220), 1),
                    BorderFactory.createEmptyBorder(10, 15, 10, 15)));
            setBackground(new Color(250, 250, 250));

            addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (getPassword().length == 0 && (getText().equals(placeholder) || getText().isEmpty())) {
                        setText("");
                        setForeground(TEXT_COLOR);
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (getPassword().length == 0) {
                        setText(placeholder);
                        setForeground(PLACEHOLDER_COLOR);
                    }
                }
            });
            setText(placeholder);
            setForeground(PLACEHOLDER_COLOR);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    // 自定义圆角按钮
    class ModernButton extends JButton {
        public ModernButton(String text) {
            setText(text);
            setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
            setForeground(Color.WHITE);
            setContentAreaFilled(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    // 主函数
    public static void main(String[] args) {
        // 设置系统外观，保证字体渲染正常
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            LoginUI login = new LoginUI();
            login.setVisible(true);
        });
    }
}