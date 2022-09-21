package com.New2;

public class Test2 {
    public static void main(String[] args) {





    int a = 10;
    int b = 20;

    int sum = ++a + ++b;//32   a is 11 b  is 21
        System.out.println("a = " + a);// 11
        System.out.println("b = " + b);// 21
        System.out.println("sum = " + sum);// sum is 32
    sum = a-- + b--;//   11 + 21 =  32     after that line a is 10 b is 20
        System.out.println("a = " + a);// 10
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);//  32

    sum = a + b;//  30    a is 10 b is 20
    sum = --a + --b;  // a is 9  b is 19
        System.out.println("sum = " + sum);//  sum is 28

    double d = 2.9;
        System.out.println("d = " + d);
    d++;// increase value of the variable just 1 so will be 3.9
        System.out.println("d = " + d);


    }
}

