package Stringdemo;

import java.util.Random;

public class Stringtest {
    public static void main(String[] args) {
        System.out.println("=== 随机验证码生成器 ===");

        String code1 = generateCode(4);
        System.out.println("4位验证码: " + code1);

        String code2 = generateCode(6);
        System.out.println("6位验证码: " + code2);

        String code3 = generateCode(8);
        System.out.println("8位验证码: " + code3);

        String onlyNumber = generateOnlyNumberCode(6);
        System.out.println("6位纯数字验证码: " + onlyNumber);

        String onlyLetter = generateOnlyLetterCode(6);
        System.out.println("6位纯字母验证码: " + onlyLetter);
    }

    public static String generateCode(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            code.append(chars.charAt(index));
        }

        return code.toString();
    }

    public static String generateOnlyNumberCode(int length) {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            code.append(random.nextInt(10));
        }

        return code.toString();
    }

    public static String generateOnlyLetterCode(int length) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(letters.length());
            code.append(letters.charAt(index));
        }

        return code.toString();
    }
}

