package com.example;

public class Warrior extends Character {

    
    //Contructor
    public Warrior(String name){
        this.setName(name);
        this.setStrength(90);
    }

    @Override
    public void talk() {
        System.out.println(this.getName() + " dice: Arrgh!");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " camina.");
    }

    @Override
    public void sleep() {
        System.out.println( this.getName() + " duerme.");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " come.");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " ataca con fuerza " + this.getStrength() + ".");
    }
}
