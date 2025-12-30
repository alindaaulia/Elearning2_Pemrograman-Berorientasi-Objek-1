package com.example.elearning2_pbo;

public class Latihan2_Enum {
    public static void main(String[] args){

        Level level = Level.INTERMEDIATE;

        System.out.println("Level        : " + level);
        System.out.println("Poin minimum : " + level.getPoinMinimum());
    }
}

enum Level{
    BEGINNER(0),
    INTERMEDIATE(100),
    EXPERT(500);

    private int poinMinimum;

    Level(int poinMinimum){
        this.poinMinimum = poinMinimum;
    }

    public int getPoinMinimum(){
        return poinMinimum;
    }

}