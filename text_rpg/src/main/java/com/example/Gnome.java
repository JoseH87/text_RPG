package com.example;

public class Gnome extends Character {

//Contructor
public Gnome(String name){
        this.setName(name);
        this.setSpeed(90);
    }

    @Override
    public void talk() {
        System.out.println( this.getName() + " dice: Cuidado no me pises!");
    }

    @Override
    public void walk() {
        System.out.println( this.getName() + " camina veloz");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " ronca");
        setHealth(100);  
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " come");
        setHealth(getHealth() + 10);
    }

     @Override
    public void attack(Enemy enemy) {
        System.out.println(this.getName() + " ataca con fuerza " + this.getStrength() + " a " + enemy.getName() + ".");
        enemy.takeDamage(this.getStrength());
    }
    
}
