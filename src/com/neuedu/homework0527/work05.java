package com.neuedu.homework0527;

public class work05 {
//定义一个学生类 包括 姓名 年龄 分数的特征
//创建五个学生对象 对其中特征进行赋值 赋值后 根据分数从大到小进行排序
     private String name;
     private int ages;
     private int fenshu;

    public String getName() {
        return name;
    }

    public int getAges() {
        return ages;
    }

    public int getFenshu() {
        return fenshu;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setAges(int ages1) {
        ages = ages1;
    }

    public void setFenshu(int fenshu1) {
        fenshu = fenshu1;
    }
    public String toString(){
               return "姓名"+getName()+"年龄"+ages+"成绩"+fenshu;
    }
}
