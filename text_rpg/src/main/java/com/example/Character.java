package com.example;

public abstract class Character {

    //Atributtes
    private String name;
    private int health;
    private String sex;

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
    public String getHealth(){
        return this.name;
    }


    //Methods
    public abstract void talk();

    public abstract void walk();

    public abstract void sleep();

    public abstract void eat();

}

