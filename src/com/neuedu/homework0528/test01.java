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

        System.out.println("请输入学号");
        int xuehao2=scanner.nextInt();
        System.out.println("请输入姓名");
        String name2=scanner.next();
        System.out.println("请输入数学");
        int scorn13=scanner.nextInt();
        System.out.println("请输入语文");
        int scorn=scanner.nextInt();
        System.out.println("请输入英语");
        int scorn23=scanner.nextInt();

        work01 study2=new work01();
        study2.setName(name2);
        study2.setXuehao(xuehao2);
        study2.setScorn1(scorn13);
        study2.setScorn2(scorn);
        study2.setScorn3(scorn23);
        System.out.println(study2.toString());

        System.out.println("请输入学号");
        int xuehao3=scanner.nextInt();
        System.out.println("请输入姓名");
        String name3=scanner.next();
        System.out.println("请输入数学");
        int scorn8=scanner.nextInt();
        System.out.println("请输入语文");
        int scorn7=scanner.nextInt();
        System.out.println("请输入英语");
        int scorn9=scanner.nextInt();

        work01 study3=new work01();
        study3.setName(name3);
        study3.setXuehao(xuehao3);
        study3.setScorn1(scorn8);
        study3.setScorn2(scorn7);
        study3.setScorn3(scorn9);
        System.out.println(study3.toString());

        System.out.println("请输入学号");
        int xuehao5=scanner.nextInt();
        System.out.println("请输入姓名");
        String name7=scanner.next();
        System.out.println("请输入数学");
        int scorn4=scanner.nextInt();
        System.out.println("请输入语文");
        int scorn5=scanner.nextInt();
        System.out.println("请输入英语");
        int scorn6=scanner.nextInt();

        work01 study4=new work01();
        study4.setName(name7);
        study4.setXuehao(xuehao5);
        study4.setScorn1(scorn4);
        study4.setScorn2(scorn5);
        study4.setScorn3(scorn6);
        System.out.println(study4.toString());

    }
}
