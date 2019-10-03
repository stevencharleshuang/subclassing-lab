package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Reptile gila = new Reptile(10, false, "Gila Monster", true);
        Reptile lizard = new Reptile(8, false, "Lizard", false);

        System.out.println(gila.getName());
        System.out.println(gila.isVenomous());

        Mammal rat = new Mammal(15, false, "Rat", true, "Squeak, Squeak", "brown");
        Mammal cow = new Mammal(10, false, "Cow", false, "Moooooo", "black and white");

        System.out.println(rat.getName());
        System.out.println(rat.isCarnivore());
        System.out.println(rat.call());
        System.out.println(cow.getName());
        System.out.println(cow.isCarnivore());
        System.out.println(cow.call());
    }
}
