package com.example;

public abstract class Enemy {
    //Atributtes
    private String name;
    private int health = 100;
    private int strength;
    private int speed;

    

    //Get and Set

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }


    public boolean isAlive(){
        return this.health > 0;
    }

    //Methods

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " recibe " + damage + " puntos de daño. Salud restante: " + health);
    }

    public void attack(Character player) {
        System.out.println(name + " ataca a " + player.getName() + " con fuerza " + strength);
        player.takeDamage(strength);
    }
}

