package UI;

import bean.Employee;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class AddEmployeeUI extends JFrame{

        private JTextField txtId,txtName,txtSex,txtage,txtphone,txtPosition,txtSalary,txtDepartment;
        private JFormattedTextField txtHireDate;
        private JButton btnSave,btnCancel;
        private EmployeeManagerUI employeeManagerUI;


        public AddEmployeeUI(EmployeeManagerUI employeeManagerUI) {
            super("添加员工信息");
            this.employeeManagerUI = employeeManagerUI;
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.insets = new Insets(5, 5, 5, 5); // 内边距

            // 设置字体大小
            Font labelFont = new Font("楷体", Font.PLAIN, 14);

            // 标签和文本框 - ID
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.EAST;
            JLabel jLabel = new JLabel("ID:");
            jLabel.setFont(labelFont);
            add(jLabel, gbc);

            gbc.gridx = 1;
            gbc.anchor = GridBagConstraints.WEST;
            txtId = new JTextField(10);
            add(txtId, gbc);

            // 姓名
            gbc.gridx = 0;
            gbc.gridy = 1;
            JLabel jLabel1 = new JLabel("姓名:");
            jLabel1.setFont(labelFont);
            add(jLabel1, gbc);

            gbc.gridx = 1;
            txtName = new JTextField(10);
            add(txtName, gbc);

            // 性别（示例，原代码片段）
            gbc.gridx = 0;
            gbc.gridy = 2;
            JLabel jLabel2 = new JLabel("性别:");
            jLabel2.setFont(labelFont);
            add(jLabel2, gbc);

            gbc.gridx = 1;
            txtSex = new JTextField(10);
            add(txtSex, gbc);

            // 年龄
            gbc.gridx = 0;
            gbc.gridy = 3;
            JLabel jLabel6 = new JLabel("年龄:");
            jLabel6.setFont(labelFont);
            add(jLabel6, gbc);

            gbc.gridx = 1;
            txtage = new JTextField(10);
            add(txtage, gbc);

            // 电话
            gbc.gridx = 0;
            gbc.gridy = 4;
            JLabel jLabel7 = new JLabel("电话:");
            jLabel7.setFont(labelFont);
            add(jLabel7, gbc);

            gbc.gridx = 1;
            txtphone = new JTextField(10);
            add(txtphone, gbc);

            // 职位
            gbc.gridx = 0;
            gbc.gridy = 5;
            JLabel jLabel8 = new JLabel("职位:");
            jLabel8.setFont(labelFont);
            add(jLabel8, gbc);

            gbc.gridx = 1;
            txtPosition = new JTextField(10);
            add(txtPosition, gbc);
            // 入职日期
            gbc.gridx = 0;
            gbc.gridy = 7;
            JLabel jLabel3 = new JLabel("入职日期:");
            jLabel3.setFont(labelFont);
            add(jLabel3, gbc);

            gbc.gridx = 1;
            txtHireDate = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
            add(txtHireDate, gbc);

            // 薪水
            gbc.gridx = 0;
            gbc.gridy = 8;
            JLabel jLabel4 = new JLabel("薪水:");
            jLabel4.setFont(labelFont);
            add(jLabel4, gbc);

            gbc.gridx = 1;
            txtSalary = new JTextField(10);
            add(txtSalary, gbc);

            // 部门
            gbc.gridx = 0;
            gbc.gridy = 9;
            JLabel jLabel5 = new JLabel("部门:");
            jLabel5.setFont(labelFont);
            add(jLabel5, gbc);

            gbc.gridx = 1;
            txtDepartment = new JTextField(10);
            add(txtDepartment, gbc);

            // 添加和取消按钮
            gbc.gridx = 0;
            gbc.gridy = 10;
            gbc.gridwidth = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.fill = GridBagConstraints.NONE;

            btnSave = new JButton("添加");
            btnCancel = new JButton("取消");
            btnSave.setPreferredSize(new Dimension(100, 30));
            btnCancel.setPreferredSize(new Dimension(100, 30));

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(btnSave);
            buttonPanel.add(btnCancel);
            add(buttonPanel, gbc);

            //txtId,txtName,txtSex,txtage,tatphone,txtPosition,txtSalary,txtDepartment;
            btnSave.addActionListener(e->{
                Employee employee = new Employee();
                employee.setId(Integer.parseInt(txtId.getText()));
                employee.setName(txtName.getText());
                employee.setSex(txtSex.getText());
                employee.setAge(Integer.parseInt(txtage.getText()));
                employee.setPhone(txtphone.getText());
                employee.setPosition(txtPosition.getText());
                employee.setEntryDate(txtHireDate.getText());
                employee.setSalary(Double.parseDouble(txtSalary.getText()));
                employee.setDepartment(txtDepartment.getText());
                employeeManagerUI.addEmployee(employee);

                JOptionPane.showMessageDialog(this, "添加成功！");
                dispose();
            });
            // 设置窗口属性
            pack(); // 自动调整窗口大小以适应组件
            setSize(300, 400);
            setLocationRelativeTo(null); // 居中显示窗口
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
        }


    }

