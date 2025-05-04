package com.ing.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.ing.zoo.carnivores.Carnivore;
import com.ing.zoo.carnivores.Lion;
import com.ing.zoo.carnivores.Tiger;
import com.ing.zoo.herbivores.Herbivore;
import com.ing.zoo.herbivores.Hippo;
import com.ing.zoo.herbivores.Monkey;
import com.ing.zoo.herbivores.Zebra;
import com.ing.zoo.omnivores.Bear;
import com.ing.zoo.omnivores.Pig;

/**
 * Represents a zoo where various animals can be interacted with.
 * Provides a command interface to interact with the animals, 
 * including making them say hello, feeding them leaves or meat, and performing tricks.
 */
public class Zoo {

    /**
     * Main method to run the zoo's command interface.
     * It processes commands such as "hello", "give leaves", "give meat", and "perform trick".
     * Each command interacts with the list of animals in the zoo.
     */
    public static void main(String[] args) {

        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // Create animal instances
        Lion henk = new Lion();
        henk.name = "henk";

        Hippo elsa = new Hippo();
        elsa.name = "elsa";

        Pig dora = new Pig();
        dora.name = "dora";

        Tiger wally = new Tiger();
        wally.name = "wally";
        
        Zebra marty = new Zebra();
        marty.name = "marty";

        Monkey pieter = new Monkey();
        pieter.name = "pieter";

        Bear ivan = new Bear();
        ivan.name = "ivan";

        // Add all animals to a list
        List<Animal> animalList = new ArrayList<>();
        Collections.addAll(animalList, henk, elsa, dora, wally, marty, pieter, ivan);

        // Scanner for input
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine();

            // Handle the "hello" command
            if (input.contains(commands[0])) {
                
                if (input.length() <= commands[0].length()) {
                    for (Animal animal : animalList) {
                        animal.sayHello();
                    }
                    return;
                }

                if (input.length() > commands[0].length() + 1) {

                    String animalInput = input.replace(commands[0], "").replace(" ", "");

                    for (Animal animal : animalList) {

                        if (animal.name.equals(animalInput)) {
                            animal.sayHello();
                            return;
                        }
                    }

                    System.err.println("The animal that you have been looking for doesn't exist! Animal: \n" + animalInput);
                    return;
                }

                System.err.println("Hello command not found! Animal: \n " + input);

            }

            // Handle the "give leaves" command
            if (input.contains(commands[1])) {
                
                System.out.println("Feeding herbivores... \n");
                
                for (Animal animal : animalList)  {
                    
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    } 
                }

                System.out.println("Successfully fed the herbivores!");
                return;
            }

            // Handle the "give meat" command
            if (input.contains(commands[2])) {
                                
                System.out.println("Feeding carnivores... \n ");
                
                for (Animal animal : animalList)  {
                    
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }

                System.out.println("Successfully fed the carnivores!");
                return;
            }

            // Handle the "perform trick" command
            if (input.contains(commands[3])) {

                System.out.println("Performing circus tricks... \n ");
                
                for (Animal animal : animalList)  {
                    
                    if (animal instanceof Trick) {   
                        ((Trick) animal).performTrick();
                    }
                }

                System.out.println("Successfully performed circus tricks!");
                return;
            }

            System.out.println("Unknown command: " + input);
        }
    }
}
