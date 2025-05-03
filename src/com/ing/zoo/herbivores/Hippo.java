package com.ing.zoo.herbivores;

import com.ing.zoo.Animal;

public class Hippo extends Animal implements Herbivore {

    public Hippo() {
        super();
    }

    @Override
    public void sayHello() {
        helloText = "\u001B[34m splash \u001B[0m \n";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "\u001B[31m munch munch lovely \u001B[0m \n";
        System.out.println(eatText);
    }
}
