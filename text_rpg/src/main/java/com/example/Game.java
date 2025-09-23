package com.example;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Character player = null;
        System.out.println("Elige tu personaje");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Gnomo");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        System.out.println("Elige un nombre:");
        String name = scanner.nextLine();

        switch (choice) {
            case 1:
                player = new Warrior("Guerrero");
                break;
            case 2:
                player = new Wizard("Mago");
                break;
            case 3:
                player = new Gnome("Gnomo");
                break;
            default:
                System.out.println("Opción no válida. Tienes que elegir un número.");
                return;
        }

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println( name +" nunca creyó en la mala suerte.  Pero aquella noche, la taberna estaba más bulliciosa de lo normal, y un encargo fácil —o eso parecía— lo llevó a seguir a un comerciante sospechoso por los pasadizos de una antigua ciudad en ruinas.\n" + //
                        "\n" + //
                        "La persecución terminó abruptamente cuando el suelo cedió bajo sus pies. Un crujido metálico, un mecanismo olvidado hacía siglos, y " + name + " cayó en la oscuridad. El golpe lo dejó aturdido, pero no inconsciente. Al abrir los ojos, la penumbra de antorchas mortecinas reveló un pasillo de piedra húmeda. El aire olía a hierro oxidado y moho. Una mazmorra.");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Bienvenido a la mazmorra " + name + ". Consigue escapar!");
        
        // Start the dungeon
        Dungeon dungeon = new Dungeon(player);
        dungeon.start();
        //Items
        /* 
        Items sword = new Sword("Espada de caballero", "Espada polvorienta que perteneció a un antiguo caballero. Aumenta el ataque a 15", 15);
        Items healthPotion = new Health_Potion("Poción de salud", "Restaura 20 puntos de salud.", 20);
        Items magicStaff = new Magic_Staff("Bastón de mago", "Bastón que aumenta el poder mágico en 15.", 15);
        */
    }
}