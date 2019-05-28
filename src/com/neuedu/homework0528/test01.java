package com.neuedu.homework0528;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

          System.out.println("请输入学号");
          int xuehao=scanner.nextInt();
          System.out.println("请输入姓名");
          String name=scanner.next();
          System.out.println("请输入数学");
          int scorn1=scanner.nextInt();
          System.out.println("请输入语文");
          int scorn2=scanner.nextInt();
          System.out.println("请输入英语");
          int scorn3=scanner.nextInt();

          work01 study=new work01();
            study.setName(name);
            study.setXuehao(xuehao);
            study.setScorn1(scorn1);
            study.setScorn2(scorn2);
            study.setScorn3(scorn3);
            System.out.println(study.toString());

        System.out.println("请输入学号");
        int xuehao1=scanner.nextInt();
        System.out.println("请输入姓名");
        String name1=scanner.next();
        System.out.println("请输入数学");
        int scorn11=scanner.nextInt();
        System.out.println("请输入语文");
        int scorn21=scanner.nextInt();
        System.out.println("请输入英语");
        int scorn31=scanner.nextInt();

        work01 study1=new work01();
        study1.setName(name1);
        study1.setXuehao(xuehao1);
        study1.setScorn1(scorn11);
        study1.setScorn2(scorn21);
        study1.setScorn3(scorn31);
        System.out.println(study1.toString());


    }
}
