package com.sunxin.ch1;

import java.util.Scanner;

public class study2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入行数");
        int hang=sc.nextInt();
        System.out.println("请输入列数");
        int lie=sc.nextInt();
        show(hang,lie);
    }
    public static void show(int hang,int lie){
        for(int i=1;i<=hang;i++){
            for (int j=1;j<=lie;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
