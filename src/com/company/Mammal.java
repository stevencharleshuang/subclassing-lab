package com.company;

public class Mammal extends Animal {
    private boolean isCarnivore;
    private String animalCall;
    private String color;

    public Mammal(int topSpeed, boolean isEndangered, String name, boolean isCarnivore, String animalCall, String color) {
        super(topSpeed, isEndangered, name);

        this.isCarnivore = isCarnivore;
        this.animalCall = animalCall;
        this.color = color;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }

    public String getAnimalCall() {
        return animalCall;
    }

    public void setAnimalCall(String animalCall) {
        this.animalCall = animalCall;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String call() {
        return "The " + super.getName() + " says: " + animalCall + "!";
    }
}
