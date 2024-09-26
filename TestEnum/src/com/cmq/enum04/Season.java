package com.cmq.enum04;

/**
 * @author: cmq
 * @date: 9/24/2024 - 09 - 24 - 3:36 PM
 * @version: 1.0
 */
public enum Season implements TestInterface {
    SPRING{
        @Override
        public void show() {
            System.out.println("this is spring");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("this is summer.");
        }
    },
    AUTUMN {
        @Override
        public void show() {
            System.out.println("this is autumn");
        }
    },
    WINTER {
        @Override
        public void show() {
            System.out.println("this is winter");
        }
    };

//    @Override
//    public void show() {
//        System.out.println("this is class Season");
//    }
}
