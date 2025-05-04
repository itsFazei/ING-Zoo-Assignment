package com.ing.zoo.omnivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;
import com.ing.zoo.carnivores.Carnivore;
import com.ing.zoo.herbivores.Herbivore;

public class Pig extends Animal implements Carnivore, Herbivore, Trick {

    private String trick;

    public Pig() {
        super();
    }

    @Override
    public void sayHello() {
        helloText = "\u001B[36m splash \u001B[0m \n";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "\u001B[36m munch munch oink \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "\u001B[36m nomnomnom oink thx \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "\u001B[36m rolls in the mud \u001B[0m \n";
        }
        else
        {
            trick = "\u001B[36m runs in circles \u001B[0m \n";
        }
        System.out.println(trick);
    }
}
