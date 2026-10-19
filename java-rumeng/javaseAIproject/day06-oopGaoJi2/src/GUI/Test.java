package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf, "有人点击了登录");
            }
        });
        jb.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                if(keyCode == KeyEvent.VK_UP){
                    System.out.println("向上");
                }else if(keyCode == KeyEvent.VK_DOWN){
                    System.out.println("向下");
                }else if(keyCode == KeyEvent.VK_LEFT){
                    System.out.println("向左");
                } else if(keyCode == KeyEvent.VK_RIGHT){
                    System.out.println("向右");
                }
            }
        });
        jf.setVisible(true);
        jf.requestFocus();
    }
}
