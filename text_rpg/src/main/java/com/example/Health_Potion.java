package com.example;

public class Health_Potion extends Items {
    private int healingAmount;

    public Health_Potion(String name, String description, int healingAmount) {
        super(name, description);
        this.healingAmount = healingAmount;
    }

    // getters y setters
    public int getHealingAmount() {
        return healingAmount;
    }

}
