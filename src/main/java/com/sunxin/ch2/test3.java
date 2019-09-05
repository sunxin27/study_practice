package com.sunxin.ch2;

import java.util.Scanner;
/*输出两者中大的*/
public class test3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据");
        int b=sc.nextInt();
        System.out.println(max(a,b));
    }
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
}
