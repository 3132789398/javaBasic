package com.neuedu.homework0528;

public class Worker {
//假设要为某个公司编写雇员工资支付程序。
//一般工人（Worker）按每月工作的天数计算工资；
//销售人员（Salesman）在基本工资基础上每月还有销售提成；
//经理（Manager）每月按固定工资支付，
// 临时工（Floater）按小时支付。
//要求描述所有雇员的共同特性（如姓名，性别，出生日期，员工类别）
// 含有计算工资的方法computeSalay（）， 所有员工用该方法计薪。
    private String name;
    private String sex;
    private String date;
    private int num;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void computeSalary(){
        System.out.println(num*salary);
    }
}
