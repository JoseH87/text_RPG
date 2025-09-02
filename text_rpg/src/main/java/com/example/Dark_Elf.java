package com.example;

public class Dark_Elf extends Character {
    //Contructor
    public Dark_Elf(String name, int age, String sex){
        this.setName(name);
        this.setSex(sex);
        this.setStrength(70);

    }

    @Override
    public void talk() {
        System.out.println( this.getName() + " dice: Hola!");
    }

    @Override
    public void walk() {
        System.out.println( this.getName() + " camina");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " duerme");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " come");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " ataca con fuerza " + this.getStrength() + ".");
    }
}
