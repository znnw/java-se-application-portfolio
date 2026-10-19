package com.itheima;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;

public class MainFrame extends JFrame {
    //设置图片位置
    private static final String imagePath = "stone-maze/src/image/";
    //用于存储图片
    private int[][] imageData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private int[][] winData =new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
//锁定空白行列
    private int row;
    private int col;
    private int count;//步数
    private int mincount;

    public MainFrame() {
        mincount = readFileScore();
        initFrame();
        initRandomArray();
        // 初始化界面
        initImage();
        initMenu();
        initKeyPressEvent();

        this.setVisible(true);

    }

    private void initKeyPressEvent() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        switchmove(Direction.UP);
                        //System.out.println("上");
                        break;
                    case KeyEvent.VK_DOWN:
                        switchmove(Direction.DOWN);
                        //System.out.println("下");
                        break;
                    case KeyEvent.VK_LEFT:
                        switchmove(Direction.LEFT);
                        //System.out.println("左");
                        break;
                    case KeyEvent.VK_RIGHT:
                        switchmove(Direction.RIGHT);
                        //System.out.println("右");
                        break;
                }
            }
        });
    }

    private void switchmove(Direction r) {
        switch (r) {
            case UP:
                if (row<imageData.length-1){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row+1][col];
                    imageData[row+1][col] = temp;
                    row++;
                    count++;
                }
                break;
            case DOWN:
                if (row>0){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row-1][col];
                    imageData[row-1][col] = temp;
                    row--;
                    count++;
                }
                break;
            case LEFT:
                if (col<imageData.length-1){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col+1];
                    imageData[row][col+1] = temp;
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                if (col>0){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col-1];
                    imageData[row][col-1] = temp;
                    col--;
                    count++;
                }
                break;
        }
        initImage();

    }

    private void initRandomArray() {
        for (int i = 0; i < imageData.length; i++){
            for (int j = 0; j < imageData[i].length; j++) {
                //随机两个行列位置，让两个位置交换位置
                int i1 = (int) (Math.random() * imageData.length);
                int j1 = (int) (Math.random() * imageData.length);

                int i2 = (int) (Math.random() * imageData.length);
                int j2 = (int) (Math.random() * imageData.length);

                int temp = imageData[i1][j1];
                imageData[i1][j1] = imageData[i2][j2];
                imageData[i2][j2] = temp;


            }
            }
        OUT:
        for (int i = 0; i < imageData.length; i++){

            for (int j = 0; j < imageData[i].length; j++) {
                if(imageData[i][j]==0){
                    row = i;
                    col = j;
                    break OUT;
                }
            }
        }
    }



    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("系统");
        JMenuItem exitJi =new JMenuItem("退出");
        menu.add(exitJi);
        exitJi.addActionListener(e->{
            dispose();
    });
        JMenuItem restartJi =new JMenuItem("重新开始");
        menu.add(restartJi);
        restartJi.addActionListener(e->{
            count = 0;
            initRandomArray();
            initImage();

        });
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    private void initImage() {

        this.getContentPane().removeAll();

        JLabel context1 = new JLabel("移动"+count+"步");
        context1.setBounds(20, 20, 100, 20);
        context1.setForeground(Color.RED);
        context1.setFont(new Font("楷体", Font.BOLD, 15));
        this.add(context1);


        if (mincount!=0){
            JLabel context2 = new JLabel("历史最少步"+mincount+"步");
            context2.setBounds(300, 20, 130, 20);
            context2.setForeground(Color.WHITE);
            context2.setFont(new Font("楷体", Font.BOLD, 15));
            this.add(context2);
        }else{
            JLabel context2 = new JLabel("新游戏");
            context2.setBounds(300, 20, 130, 20);
            context2.setForeground(Color.WHITE);
            context2.setFont(new Font("楷体", Font.BOLD, 15));
            this.add(context2);
        }
        //JLabel countLabel = new JLabel("步数："+count);
        if (isWin()){
           JLabel label = new JLabel(new ImageIcon(imagePath+"win.png"));
           label.setBounds(124,230,266,88);
           this.add(label);

           int filemincount = readFileScore();
           if (filemincount==0||filemincount>count){
               writeFileScore(count);
               mincount = count;
           }

        }

        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                String imageName = imageData[i][j]+".png";
                ImageIcon imageIcon = new ImageIcon(imagePath+imageName);
                JLabel jlabel = new JLabel(imageIcon);

                jlabel.setBounds(22+j * 100, 60+i * 100, 100, 100);

               this.add(jlabel);
            }
        }
        JLabel background = new JLabel(new ImageIcon(imagePath+"background.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);
        this.repaint();
    }

    private void writeFileScore(int count) {

        try(FileWriter fw = new FileWriter("D:\\JAVA\\java_daima\\java-rumeng\\javaseAIproject\\stone-maze\\src\\score.txt");
            BufferedWriter bw = new BufferedWriter(fw);){
            bw.write(count+"");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private int readFileScore(){
       try(FileReader  fr= new FileReader("D:\\JAVA\\java_daima\\java-rumeng\\javaseAIproject\\stone-maze\\src\\score.txt");
           BufferedReader br = new BufferedReader(fr);){
           String line = br.readLine();
           return Integer.parseInt(line);

       } catch (IOException  e) {
           e.printStackTrace();
           return 0;
       }
    }

    private boolean isWin() {
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j]!=winData[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private void initFrame() {
        setTitle("石头迷宫 V1.0 郑重出品");
        setSize(465, 575);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);


    }

}
