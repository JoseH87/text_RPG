package com.example;

public class Wizard extends Character {


    //Contructor
    public Wizard(String name){
        this.setName(name);
        this.setMagic(90);
    }

    @Override
    public void talk() {
        System.out.println( this.getName() + " dice: Aguarda el poder de la mágia");
    }

    @Override
    public void walk() {
        System.out.println( this.getName() + " camina");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " medita");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " come");
    }

    @Override
    public void attack(Enemy enemy) {
        System.out.println(this.getName() + " lanza un rayo magico de nivel " + this.getMagic() + " a " + enemy.getName() + ".");
        enemy.takeDamage(this.getMagic());
    }
}
