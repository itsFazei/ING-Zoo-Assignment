package com.ing.zoo;

/**
 * Represents a contract for animals that can perform tricks.
 * Classes implementing this interface should define the behavior of performing a trick.
 */
public interface Trick {

    /**
     * Defines how an animal performs a trick.
     * This method should be implemented by any class that represents an animal capable of performing tricks.
     */
    void performTrick();
}
