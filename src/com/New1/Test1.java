package com.New1;

public class Test1 {
    public static void main(String[] args) {
        int k = 10;
        int l = 20;
        int sum2 = k + l;// sum2 is 30
        k = sum2 - k;// k is now 20
        l = sum2 - l;// l will be 10
        //  after your operation
        System.out.println("k = " + k);// 20
        System.out.println("l = " + l);//
    }
}
