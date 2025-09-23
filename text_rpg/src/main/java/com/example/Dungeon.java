package com.example;

import java.util.Random;
import java.util.Scanner;
import.java.util.Scanner;

public class Dungeon {
    private final int size = 5;
    private Room[][] rooms;
    private int playerX= 0, playerY = 0;
    private Character player;
    private Random random = new Random();

    //Constructor
    public Dungeon(Character player){
        this.player = player;
        rooms = new Room[size][size];
        generateDungeon();
    }

    private void generateDungeon(){
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                rooms[i][j]= new Room();
            }
        }
    }

    //Colocar la salida en una posición aleatoria
    int exitX, exitY;
    do{
        exitX = random.nextInt(size);
        exitY = random.nextInt(size);
    }while (exitX == 0 && exitY == 0); 
    room[exitX][exitY].setExit(true);

    }

    publioc void start(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\nEstás en la sala (" + playerX + ", " + playerY + ")");
            Room currentRoom = rooms[playerX][playerY];
            currentRoom.enter(player)

        }
    }
}
