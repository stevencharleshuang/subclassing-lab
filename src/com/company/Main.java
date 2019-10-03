package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Reptile gila = new Reptile(10, false, "Gila Monster", true);

        System.out.println(gila.getName());
        System.out.println(gila.isVenomous());
    }
}
