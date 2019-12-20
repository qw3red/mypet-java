package com.mypet;

import com.mypet.fish.Fish;

public class FishMaster {

    public static void main(String[] args) {
        Fish myFish = new Fish();
        myFish.dive(2);
        myFish.dive(3);
        myFish.sleep();
        String myfish = myFish.say("pidor");
        System.out.println(myfish);
    }
} 