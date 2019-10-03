package com.company;

public class Mammal extends Animal {
    private boolean isCarnivore;
    private String animalCall;

    public Mammal(int topSpeed, boolean isEndangered, String name, boolean isCarnivore, String animalCall) {
        super(topSpeed, isEndangered, name);

        this.isCarnivore = isCarnivore;
        this.animalCall = animalCall;
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

    public String call() {
        return "The " + super.getName() + " says: " + animalCall + "!";
    }
}
