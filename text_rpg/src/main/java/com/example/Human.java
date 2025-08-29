package com.example;

import javax.print.DocFlavor;

public class Human extends Character {
    
    public Human(String name, int age, String sex){
        this.setName(name);
        this.setHealth(100);
        this.setSex(sex);
    }
}
