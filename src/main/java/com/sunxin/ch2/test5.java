package com.sunxin.ch2;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        System.out.println("请输入选项~");


        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int a = sum / 1000;

        int b = (sum - a * 1000) / 100;
        int c = (sum - a * 1000 - b * 100) / 10;
        int d = sum % 10;
        a = (a + 5) % 10;
        b = (b + 5) % 10;
        c = (c + 5) % 10;
        d = (d + 5) % 10;
        int ans = d * 1000 + c * 100 + b * 10 + a;
        System.out.println(ans);
    }
}
