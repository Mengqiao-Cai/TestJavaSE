package com.cmq.test01;

/**
 * @author: cmq
 * @date: 7/25/2024 - 07 - 25 - 2:52 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Girl girl = new Girl();
        Dog dog = new Dog();
        girl.play(cat);
        girl.play(dog);
        //Animal an = new Animal();
        //girl.play(an);
        Animal an2 = new Cat();
        girl.play(an2);
        cat.scratch();
        //an2.scratch();
        Cat cat2 = (Cat) an2;
        System.out.println("--------");
        cat2.scratch();
        //an2.scratch();
        //System.out.println(an.getClass().getName());
        System.out.println(an2.getClass().getName());

        Animal an3 = PetStore.getAnimal("dog");
        girl.play(an3);
    }
}
