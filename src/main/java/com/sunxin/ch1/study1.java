package com.sunxin.ch1;

public class study1 {
    public static void main(String[] args)
    {
        String result ="";
        for (int i = 0 ;i<6;i++)
        {
            int intVal = (int)(Math.random() *26 + 97);
            result = result + (char)intVal;
        }
        System.out.println(result);

    }
}
