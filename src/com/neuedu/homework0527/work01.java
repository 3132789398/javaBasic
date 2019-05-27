package com.neuedu.homework0527;
public class work01 {
//    定义长方形类，含：
//  特征：宽、高（整型）；
//  方法：求周长、面积；
//  方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
//并对其进行测试
    int width=1;
    int height=1;
    public void chang(){
        System.out.println("周长："+(width+height)*2);
        System.out.println("面积："+width*height);
    }

    public void fang(int a) {
        width=a;
        height=a;
        System.out.println("周长："+(width+height)*2);
        System.out.println("面积："+width*height);
    }
    public void xing(int a,int b) {
        width=a;
        height=b;
        System.out.println("周长："+(width+height)*2);
        System.out.println("面积："+width*height);
    }
}



