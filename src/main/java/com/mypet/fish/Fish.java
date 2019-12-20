package com.mypet.fish;

import com.mypet.pet.Pet;

public class Fish extends Pet {

    private int currentDepth=0;
    public int dive(int howDeep){
        currentDepth=currentDepth + howDeep;
        System.out.println("Ныряю на глубину " + howDeep + " метров");
        System.out.println("Я на глубине " + currentDepth + " метров ниже уровня моря");
        return currentDepth;
    }

    public String say(String word) {
        return "ты че пес, рыбы не говорят слово " +word;
    }
}