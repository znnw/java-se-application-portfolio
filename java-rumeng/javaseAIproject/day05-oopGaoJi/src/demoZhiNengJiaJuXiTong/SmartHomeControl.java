package demoZhiNengJiaJuXiTong;

public class SmartHomeControl {
    public void control(JD jd) {
        System.out.println("开始控制家电");
        System.out.println("控制家电：" + jd.getName()+"目前状态是"+(jd.isStatus()?"开启":"关闭"));
        jd.press();
        System.out.println("家电"+jd.getName()+"已"+(jd.isStatus()?"开启":"关闭"));

    }
    public void printAllStatus(JD [] jds){
        for (int i = 0; i < jds.length; i++) {
            JD jd=jds[i];
            System.out.println("家电"+jds[i].getName()+"目前状态是"+(jds[i].isStatus()?"开启":"关闭"));
        }
    }
}
