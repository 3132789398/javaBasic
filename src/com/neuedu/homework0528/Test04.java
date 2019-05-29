package com.neuedu.homework0528;

public class Test04 {
    public static void main(String[] args) {
        PersonCreat p1 = new PersonCreat();
        p1.setName("zhangsan");
        p1.setAge(33);
        p1.setHeight(173);
        p1.sayHello();
        PersonCreat p2 = new PersonCreat();
        p2.setName("lisi");
        p2.setAge(44);
        p2.setHeight(174);
        p2.sayHello();
    }
}
