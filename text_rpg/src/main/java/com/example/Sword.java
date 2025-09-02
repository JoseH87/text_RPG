package com.example;

public class Sword extends Items {
    private int damage;

    public Sword(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    // getters y setters
    public int getDamage() {
        return damage;
    }



}
