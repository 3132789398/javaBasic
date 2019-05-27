package com.neuedu.homework0527;

import java.util.Scanner;

public class work02 {
//     定义圆类，它有一个变量radius(半径)。从键盘输入数据，将半径传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。
//并对其进行测试

    public void yuan(){
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        System.out.println("圆的周长"+radius*2*3.14);
        System.out.println("圆的面积"+radius*radius*3.14);
    }

}
