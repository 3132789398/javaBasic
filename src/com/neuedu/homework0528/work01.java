package com.neuedu.homework0528;

public class work01 {
// 有五个学生，每个学生有3门课的成绩
// 从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩
    String name;
    int xuehao;
    int scorn1;
    int scorn2;
    int scorn3;

    public String getName() {
        return name;
    }

    public int getXuehao() {
        return xuehao;
    }

    public int getScorn1() {
        return scorn1;
    }

    public int getScorn2() {
        return scorn2;
    }

    public int getScorn3() {
        return scorn3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public void setScorn1(int scorn1) {
        this.scorn1 = scorn1;
    }

    public void setScorn2(int scorn2) {
        this.scorn2 = scorn2;
    }

    public void setScorn3(int scorn3) {
        this.scorn3 = scorn3;
    }

    @Override
    public String toString() {
        return "姓名："+getName()+"学号："+getXuehao()+"数学："+getScorn1()+"语文："
                +getScorn2()+"英语："+getScorn3()+"平均成绩："+(getScorn1()+getScorn2()+getScorn3())/3;
    }
}
