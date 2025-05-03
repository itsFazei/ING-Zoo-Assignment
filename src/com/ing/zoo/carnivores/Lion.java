package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;

public class Lion extends Animal implements Carnivore {

    public Lion() {
        super();
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

}
