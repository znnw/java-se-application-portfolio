package Gamedemo;

import java.util.*;

public class Room {
    private List<Card> cards=new ArrayList<>();
    {
        String[] colors = {"♥","♠","♣","♦"};
        String[] sizes = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int num = 0;
        for (String size : sizes){
            num++;
            for (String color : colors){
                Card card =new Card(color,size,num);
                cards.add(card);

            }
        }
        //cards.add(new Card("","SmallJOKER"));
        //cards.add(new Card("","BigJOKER"));
        Collections.addAll(cards, new Card("","SmallJOKER",++num),new Card("","BigJOKER",++num));
        System.out.println("新牌是"+cards);
    }
    public void start(){
        System.out.println("开始游戏");
        Collections.shuffle(cards);
        System.out.println("洗牌后："+cards);

        Map<String,List< Card>> players=new HashMap<>();
        List< Card> lhc =new ArrayList<>();
        players.put("令狐冲",lhc);

        List< Card> zhangsan =new ArrayList<>();
        players.put("张三",zhangsan);

        List< Card> lisi =new ArrayList<>();
        players.put("李四",lisi);

        for (int i=0;i<cards.size()-3;i++){
            Card card = cards.get(i);
            if(i%3==0){
                lhc.add(card);
            }else if(i%3==1){
                zhangsan.add(card);
            }else{
                lisi.add(card);
            }
        }
        
        sortCards(lhc);
        sortCards(zhangsan);
        sortCards(lisi);
        //看牌

        List< Card>lastcards = cards.subList(cards.size()-3,cards.size());
        System.out.println("底牌是："+lastcards);
        for (Map.Entry<String,List< Card>> entry : players.entrySet()) {
            String name = entry.getKey();
            List<Card> cards = entry.getValue();
            System.out.println(name + "的牌是：" +cards);
        }

    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getNum()-o1.getNum();
            }
        });
        
    }
}
