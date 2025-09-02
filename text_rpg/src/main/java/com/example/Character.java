package com.example;

public abstract class Character {

    //Atributtes
    private String name;
    private int health = 100;
    private int age;
    private String sex;
    private int strength;

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

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return this.sex; 
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return this.strength; 
    }


    //Methods
    public abstract void talk();

    public abstract void walk();

    public abstract void sleep();

    public abstract void eat();

    public abstract void attack();

}

