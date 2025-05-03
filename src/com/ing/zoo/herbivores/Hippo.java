package com.ing.zoo.herbivores;

import com.ing.zoo.Animal;

public class Hippo extends Animal implements Herbivore {

    public Hippo() {
        super();
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
