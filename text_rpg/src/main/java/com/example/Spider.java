package com.example;

public class Spider extends Enemy {
    // Contructor
    public Spider(String name) {
        this.setName(name);
        this.setHealth(50);
        this.setStrength(20);
        this.setSpeed(80);
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.getName() + " ataca con sus quelíceros.");
        character.takeDamage(this.getStrength());
    }
    
}
