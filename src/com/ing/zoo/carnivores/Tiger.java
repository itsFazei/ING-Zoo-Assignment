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
        helloText = "\u001B[31m rraaarww \u001B[0m \n";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "\u001B[31m nomnomnom oink wubalubadubdub \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        
        Random random = new Random();
        int rnd = random.nextInt(2);

        if(rnd == 0) {
            trick = "\u001B[31m jumps in tree \u001B[0m \n";
        } else {
            trick = "\u001B[31m scratches ears \u001B[0m \n";
        }

        System.out.println(trick);
    }
}
