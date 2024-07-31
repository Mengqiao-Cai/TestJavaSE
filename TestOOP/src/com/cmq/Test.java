package com.cmq;

/**
 * @author: cmq
 * @date: 7/19/2024 - 07 - 19 - 3:03 PM
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //create implementation
        //person: reference data type
        //will load class only for first time <- ClassLoader
        Person zs = new Person();
        zs.name = "zhang san";
        zs.age = 19;
        zs.height = 180.4;
        zs.weight = 170.4;

        Person ls = new Person();
        ls.name = "li si";
        ls.age = 18;
        ls.height = 149.3;
        ls.weight = 200.5;

        System.out.println(zs.name);
        System.out.println(ls.age);

        zs.eat();
        ls.eat();
        zs.sleep("classroom");
        String zsIntro = zs.introduce();
        System.out.println(zsIntro);

        System.out.println(Integer.MAX_VALUE);
        System.out.println("------");
        if (true) {
            System.out.println("1");
        }
        if (true) {
            System.out.println("2");
        }
        int[] l1 = new int[5];
        System.out.println(l1.length);
        
    }
}
