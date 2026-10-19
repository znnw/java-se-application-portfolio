package genericity;

import java.util.ArrayList;

public class Genericitydemo2 {
    public static void main(String[] args) {
        MyArrayList<String> mlist = new MyArrayList<>();

        mlist.add("java");
        mlist.add("php");
        mlist.add( "c");
        System.out.println(mlist.remove("java"));
        System.out.println(mlist);
    }
}
