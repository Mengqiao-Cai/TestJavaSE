package com.cmq.test01;

/**
 * @author: cmq
 * @date: 7/25/2024 - 07 - 25 - 11:00 PM
 * @version: 1.0
 */
public class PetStore {
    public static Animal getAnimal(String petName) {
        Animal an = null;
        //petName.equals() -> might cause null pointer exception
        if ("cat".equals(petName)) {
            an = new Cat();
        }
        if ("dog".equals(petName)) {
            an = new Dog();
        }
        if ("pig".equals(petName)) {
            an = new Pig();
        }
        return an;
    }
}
