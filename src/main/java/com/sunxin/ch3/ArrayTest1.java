package com.sunxin.ch3;

public class ArrayTest1 {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");

    }
}