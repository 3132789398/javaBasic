package com.neuedu.homework0527;

public class work04 {
//    编写一个Java程序，并满足如下要求：
// 1）编写一个Car类，具有：   特征：品牌(mark)——String类型   价格（price）、速度（speed）——int型
// 2）功能：驾驶（void drive( )）    功能：变速（void speedChange(int newSpeed)），把新速度赋给speed
// 3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对 象并测试其对象的特性。
    String mark;
    int speed;
    public void drive( ){
        System.out.println("品牌"+mark);
        System.out.println("自动驾驶");
    }
    public void speedChange(int newSpeed){
        speed = newSpeed;
        System.out.println("时速为"+speed+"km/h");
        System.out.println();
    }
}
