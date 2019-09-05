package com.sunxin.ch2;

import java.util.Scanner;
/* 输出三者中最大的*/
public class test4 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据");
        int b=sc.nextInt();
        System.out.println("请输入第三个数据");
        int c=sc.nextInt();
        System.out.println(max(max(a,b),c));
    }
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
    public static int max(int a,int b, int c ){
        return max(max(a,b),c);
    }
}
