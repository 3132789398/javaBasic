package com.neuedu.homework0523;

public class work01 {
    public static void main(String[] args) {
        int a=815;
        int b=a%10;
        int c=(a%100-b)/10;
        int d=(a%1000-b-c*10)/100;
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
    }
}
