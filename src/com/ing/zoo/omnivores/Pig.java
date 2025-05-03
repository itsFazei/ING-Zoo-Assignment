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
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
