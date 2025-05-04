package com.ing.zoo.omnivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;
import com.ing.zoo.carnivores.Carnivore;
import com.ing.zoo.herbivores.Herbivore;

public class Bear extends Animal implements Carnivore, Herbivore, Trick {

    private String trick;

    public Bear() {
        super();
    }

    @Override
    public void sayHello() {
        helloText = "\u001B[35m grr...hello! \u001B[0m \n";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "\u001B[35m munches on berries \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "\u001B[35m rips into a fish \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        
        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {

            trick = "\u001B[35m stands on hind legs \u001B[0m \n";
        } else {

            trick = "\u001B[35m claps paws \u001B[0m \n";
        }

        System.out.println(trick);
    }
}
