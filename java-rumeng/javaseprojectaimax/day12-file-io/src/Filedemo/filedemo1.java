package Filedemo;

import java.io.File;

public class filedemo1 {
    public static void main(String args[]) {
        File f1 = new File("src/delei01txt");

        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());

    }

}
