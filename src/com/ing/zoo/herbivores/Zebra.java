package com.ing.zoo.herbivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;

public class Zebra extends Animal implements Herbivore, Trick {
    public String trick;

    public Zebra() {
        super();
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {

        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {
            trick = "jump through the rings of fire";
        } else {
            trick = "perform a salto";
        }
        
        System.out.println(trick);
    }
}
