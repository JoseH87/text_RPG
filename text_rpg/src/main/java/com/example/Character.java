package com.example;

public abstract class Character {

    //Atributtes
    private String name;
    private int health = 100;
    private int strength = 0;
    private int speed = 0;
    private int magic = 0;

    //Get and Set

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }

    public void setMagic(int magic){
        this.magic = magic;
    }

    public int  getMagic(){
        return this.magic; 
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return this.strength; 
    }

    public void setSpeed(int speed){
        this.speed= speed;
    }

    public int getSpeed(){
        return speed;
    }


    //Methods
    public abstract void talk();

    public abstract void walk();

    public abstract void sleep();

    public abstract void eat();

    public abstract void attack();

}

