package com.ing.zoo;

public abstract class Animal {
    protected String name;
    protected String helloText;
    protected  String eatText;

    public Animal() {

    }

    protected abstract void sayHello();
}
