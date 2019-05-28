package com.neuedu.homework0527;

public class test05 {
    public static void main(String[] args) {
           work05[] stus =new work05[5];
           for(int i=0;i<stus.length;i++){
               work05 work=new work05();
               work.setName("abc");
               work.setAges(16);
               work.setFenshu(60+i);
               stus[i] =work;

           }
        for(work05 s:stus){
            System.out.println(s);
        }


    }
}
