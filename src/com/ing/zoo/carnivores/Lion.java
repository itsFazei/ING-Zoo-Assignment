package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;

public class Lion extends Animal implements Carnivore {

    public Lion() {
        super();
    }

    @Override
    public void eatMeat() {
        eatText = "\u001B[31m nomnomnom thx mate \u001B[0m \n";
        System.out.println(eatText);
    }

    @Override
    public void sayHello() {
        helloText = "\u001B[33m roooaoaaaaar \u001B[0m \n";
        System.out.println(helloText);
    }

}
