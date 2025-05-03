package com.ing.zoo.carnivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;

public class Tiger extends Animal implements Carnivore, Trick {

    public String trick;

    public Tiger() {
        super();
    }

    @Override
    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        
        Random random = new Random();
        int rnd = random.nextInt(2);

        if(rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }

        System.out.println(trick);
    }
}
