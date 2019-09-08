package com.sunxin.ch3;

public class ArayTest3 {
    public static void main(String args[]) {
        int i ,j=0 , min;
        int A[] = { 30, 48, 74, 17, 62 };
        for (i = 0; i < A.length; i++) { // 执行冒泡排序法
            for (j = i; j < A.length; j++) {
                if (A[j] < A[i]) {
                    min = A[i];
                    A[i] = A[j];
                    A[j] = min;
                }
            }
        }
        for(i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
        System.out.println("最大值为"+A[A.length-1]);
        System.out.println("最大值为"+A[0]);
    }
}
