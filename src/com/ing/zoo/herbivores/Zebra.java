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
        helloText = "\u001B[36m zebra zebra \u001B[0m \n";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "\u001B[36m munch munch zank yee bra \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {

        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {
            trick = "\u001B[36m jump through the rings of fire \u001B[0m \n";
        } else {
            trick = "\u001B[36m perform a salto \u001B[0m \n";
        }
        
        System.out.println(trick);
    }
}
