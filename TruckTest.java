package com.neuedu.homework0531;

public class TruckTest {

    public static void main(String[] args) {

        Truck truck=new Truck(6,20,3,40);
        truck.loader();
        truck.wheels();
        truck.weight();
        truck.payload();
    }
}
