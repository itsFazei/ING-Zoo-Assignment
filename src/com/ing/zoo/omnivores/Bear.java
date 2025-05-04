package com.ing.zoo.omnivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;
import com.ing.zoo.carnivores.Carnivore;
import com.ing.zoo.herbivores.Herbivore;

/**
 * Represents a bear, an omnivorous animal that can eat both meat and plants,
 * and can perform tricks. 
 * Inherits basic animal behavior from class Animal
 * and defines specific bear actions, including eating both plants and meat,
 * and performing tricks.
 */
public class Bear extends Animal implements Carnivore, Herbivore, Trick {

    private String trick;

    /**
     * Constructs a new Bear instance.
     */
    public Bear() {
        super();
    }

    /**
     * Displays the bear's greeting sound.
     * Prints a magenta-colored growl and hello message.
     */
    @Override
    public void sayHello() {
        helloText = "\u001B[35m grr...hello! \u001B[0m \n";
        System.out.println(helloText);
    }

    /**
     * Displays the bear's behavior when eating leaves.
     * Prints a magenta-colored message to simulate eating berries.
     */
    @Override
    public void eatLeaves() {
        eatText = "\u001B[35m munches on berries \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Displays the bear's behavior when eating meat.
     * Prints a magenta-colored message to simulate eating fish.
     */
    @Override
    public void eatMeat() {
        eatText = "\u001B[35m rips into a fish \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Performs a random trick.
     * The bear either stands on its hind legs or claps its paws.
     * Prints the selected trick in magenta color.
     */
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
