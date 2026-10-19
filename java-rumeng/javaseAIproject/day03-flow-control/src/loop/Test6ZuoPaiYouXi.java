package loop;

public class Test6ZuoPaiYouXi {
    static String[] poker;
    public static void main(String[] args) {
        //目标完成斗地主游戏的做牌和洗牌
        start();
        wash();
    }

     public static void start() {
        //做牌：创建一个动态初始化数组保存54张牌
        poker = new String[54];
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //遍历点数再遍历花色
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[index++] = colors[j] + numbers[i];
            }
        }
        poker[index++] = "king";
        poker[index++] = "King";
        //打印牌
        System.out.println("新牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
    }
    public static void wash() {
        //洗牌：使用随机
        for (int i = 0; i < poker.length; i++) {
            int j = (int) (Math.random() * poker.length);
            String temp = poker[i];
            poker[i] = poker[j];
            poker[j] = temp;
        }
        System.out.println("\n洗牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
    }
}