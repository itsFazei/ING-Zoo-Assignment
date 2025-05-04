package com.ing.zoo.herbivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;

public class Monkey extends Animal implements Herbivore, Trick {

    private String trick;

    public Monkey() {
        super();
    }

    @Override
    public void sayHello() {
        helloText = "\u001B[33m ooh ooh aah aah! \u001B[0m \n";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "\u001B[33m munches on bananas \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {

        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {
            trick = "\u001B[33m swings from tree to tree \u001B[0m \n";
        } else {
            trick = "\u001B[33m does a somersault \u001B[0m \n";
        }
        
        System.out.println(trick);
    }
}
