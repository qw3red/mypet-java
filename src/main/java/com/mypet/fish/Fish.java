package com.mypet.fish;

import com.mypet.pet.Pet;

public class Fish extends Pet {

    private int currentDepth=0;
    public int dive(int howDeep){
        currentDepth=currentDepth + howDeep;
        System.out.println("����� �� ������� " + howDeep + " ������");
        System.out.println("� �� ������� " + currentDepth + " ������ ���� ������ ����");
        return currentDepth;
    }

    public String say(String word) {
        return "�� �� ���, ���� �� ������� ����� " +word;
    }
}