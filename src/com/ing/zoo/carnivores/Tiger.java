package com.ing.zoo.carnivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;

/**
 * Represents a tiger, a carnivorous animal that can perform tricks.
 * Inherits basic animal behavior from class Animal
 * and defines specific tiger actions and tricks.
 */
public class Tiger extends Animal implements Carnivore, Trick {

    public String trick;

    /**
     * Constructs a new Tiger instance.
     */
    public Tiger() {
        super();
    }

    /**
     * Displays the tiger's greeting sound.
     * Prints a red-colored growling message.
     */
    @Override
    public void sayHello() {
        helloText = "\u001B[31m rraaarww \u001B[0m \n";
        System.out.println(helloText);
    }

    /**
     * Displays the tiger's behavior when eating meat.
     * Prints a red-colored message to simulate eating with a playful tone.
     */
    @Override
    public void eatMeat() {
        eatText = "\u001B[31m nomnomnom oink wubalubadubdub \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Performs a random trick.
     * The tiger either jumps in a tree or scratches its ears.
     * Prints the selected trick in red color.
     */
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
