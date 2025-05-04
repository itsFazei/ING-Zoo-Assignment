package com.ing.zoo;

/**
 * Represents an abstract animal with basic attributes and behavior.
 * Subclasses should implement specific behaviors such as greeting and eating.
 */
public abstract class Animal {
    
    protected String name;
    protected String helloText;
    protected String eatText;

    /**
     * Constructs a new Animal instance.
     */
    public Animal() {

    }

    /**
     * Abstract method for animals to say hello.
     * Subclasses should define their specific greeting behavior.
     */
    protected abstract void sayHello();
}
