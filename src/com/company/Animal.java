package com.company;

public class Animal {
        private int topSpeed;
        private boolean isEndangered;
        private String name;

        public Animal(int topSpeed, boolean isEndangered, String name) {
            this.topSpeed = topSpeed;
            this.isEndangered = isEndangered;
            this.name = name;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }

        public boolean isEndangered() {
            return isEndangered;
        }

        public void setEndangered(boolean endangered) {
            isEndangered = endangered;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
