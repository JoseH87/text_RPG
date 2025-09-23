package com.example;

public class Goblin extends Enemy {

    //Contructor
    public Goblin(String name){
        this.setName(name);
        this.setStrength(40);
        this.setHealth(50);
        this.setSpeed(60);
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.getName() + " ataca con garrote.");
        character.takeDamage(this.getStrength());
    }
    
}
