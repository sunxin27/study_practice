package com.sunxin.ch1;

import java.util.Scanner;

public class study3 {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score=sc.nextInt();
        if (score>=90&&score<=100){
            System.out.println("优秀");
        }
        else if (score>=80&&score<90){
            System.out.println("好");
        }
        else if (score>=70&&score<80){
            System.out.println("良");
        }else if (score>=60&&score<70){
            System.out.println("及格");
        }else if (score<60){
            System.out.println("不及格");
        }
    }
}
