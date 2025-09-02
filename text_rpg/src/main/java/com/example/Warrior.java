package com.example;

public class Warrior extends Character {
    
    //Contructor
    public Warrior(String name, int age, String sex){
        this.setName(name);
        this.setSex(sex);
        this.setStrength(80);

    }


    @Override
    public void talk() {
        System.out.println(this.getName() + " dice: Hola!");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " camina.");
    }

    @Override
    public void sleep() {
        System.out.println( this.getName() + " está durmiendo.");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " está comiendo.");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " ataca con fuerza " + this.getStrength() + ".");
    }
}
