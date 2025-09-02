package com.example;

public abstract class Enemy {
    //Atributtes
    private String name;
    private int health;
    private int strength;
    private int speed;
    private int magic;

    //Get and Set

    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
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
    public abstract void attack(Character character);

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
        System.out.println(this.name + " recibe " + damage + " puntos de daño. Salud restante: " + this.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
