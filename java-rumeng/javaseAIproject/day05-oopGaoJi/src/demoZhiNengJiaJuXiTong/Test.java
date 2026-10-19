package demoZhiNengJiaJuXiTong;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        JD [] jds = new JD[4];
        jds[0] = new TV("电视",true);
        jds[1] = new WashMachine("洗衣机",true);
        jds[2] = new Lamp("灯泡",true);
        jds[3] = new Air("空调",true);

        while (true) {
            SmartHomeControl smartHomeControl = new SmartHomeControl();
            //smartHomeControl.control(jds[0]);
            smartHomeControl.printAllStatus(jds);
            System.out.println("请选择你要控制的设备");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("app已退出");
                    return;
                default:
                    System.out.println("输入错误");
            }
        }
    }
}
