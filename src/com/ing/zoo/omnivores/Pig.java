package com.ing.zoo.omnivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;
import com.ing.zoo.carnivores.Carnivore;
import com.ing.zoo.herbivores.Herbivore;

/**
 * Represents a pig, an omnivorous animal that can eat both meat and plants,
 * and can perform tricks. 
 * Inherits basic animal behavior from class Animal
 * and defines specific pig actions, including eating both plants and meat,
 * and performing tricks.
 */
public class Pig extends Animal implements Carnivore, Herbivore, Trick {

    private String trick;

    /**
     * Constructs a new Pig instance.
     */
    public Pig() {
        super();
    }

    /**
     * Displays the pig's greeting sound.
     * Prints a cyan-colored splash message.
     */
    @Override
    public void sayHello() {
        helloText = "\u001B[36m splash \u001B[0m \n";
        System.out.println(helloText);
    }

    /**
     * Displays the pig's behavior when eating leaves.
     * Prints a cyan-colored message to simulate eating with an oink.
     */
    @Override
    public void eatLeaves() {
        eatText = "\u001B[36m munch munch oink \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Displays the pig's behavior when eating meat.
     * Prints a cyan-colored message to simulate eating with an oink of thanks.
     */
    @Override
    public void eatMeat() {
        eatText = "\u001B[36m nomnomnom oink thx \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Performs a random trick.
     * The pig either rolls in the mud or runs in circles.
     * Prints the selected trick in cyan color.
     */
    @Override
    public void performTrick() {
        
        Random random = new Random();
        int rnd = random.nextInt(2);
        
        if (rnd == 0) {
            trick = "\u001B[36m rolls in the mud \u001B[0m \n";
        } else {
            trick = "\u001B[36m runs in circles \u001B[0m \n";
        }
        
        System.out.println(trick);
    }
}
