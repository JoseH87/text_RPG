package com.example;

public class Human extends Character {
    
    //Contructor
    public Human(String name, int age, String sex){
        this.setName(name);
        this.setHealth(100);
        this.setSex(sex);
        this.setStrength(80);

    }

    @Override
    public void talk() {
        System.out.println("Human " + this.getName() + " says: Hello!");
    }

    @Override
    public void walk() {
        System.out.println("Human " + this.getName() + " is walking on two legs.");
    }

    @Override
    public void sleep() {
        System.out.println("Human " + this.getName() + " is sleeping.");
    }

    @Override
    public void eat() {
        System.out.println("Human " + this.getName() + " is eating.");
    }

    @Override
    public void attack() {
        System.out.println("Human " + this.getName() + " attacks with strength " + this.getStrength() + ".");
    }
}
