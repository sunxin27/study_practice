package com.sunxin.ch3;

import java.util.Scanner;

public class complare {
    public static void main(String[] argss)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        compareTwoNum(a, b);
    }
    public static void compareTwoNum(int a,int b)
    {
        if(a < b)
        {
            System.out.println("a < b ");
        }else
        {
            System.out.println("a >= b");
        }
    }
}
