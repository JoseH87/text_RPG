package com.example;

public class Magic_Staff extends Items {

    private int magicPower;

    public Magic_Staff(String name, String description, int magicPower) {
        super(name, description);
        this.magicPower = magicPower;
    }

    // getters y setters
    public int getMagicPower() {
        return magicPower;
    }

}
