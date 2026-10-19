package HongBaoYuDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        List<Integer> redPacket = getRedPacket();
        for (int i = 1; i <= 10; i++) {

            new GetRedPacket(redPacket, "人"+i).start();
        }
    }

    public static List<Integer> getRedPacket() {
        Random r = new Random();
        List<Integer> redPacket = new ArrayList<>();
        for (int i = 1; i <= 160; i++) {
            redPacket.add(r.nextInt(30) + 1);
        }
        for (int i = 1; i <= 40; i++) {
            redPacket.add(r.nextInt(70) + 31);
        }
        return redPacket;
    }
}
