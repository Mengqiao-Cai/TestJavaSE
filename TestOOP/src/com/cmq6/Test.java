package com.cmq6;

/**
 * @author: cmq
 * @date: 7/20/2024 - 07 - 20 - 4:21 PM
 * @version: 1.0
 */
public class Test {
    int a;
    static int sa;
    public void a() {
        System.out.println("----a");
        {
            //limit var's scope
            System.out.println("----000000");
            int num = 10;
            System.out.println(num);
        }
        //System.out.println(num);
        //if(){}
        //while(){}
    }
    public static void b() {
        System.out.println("----b");
    }

    {
        System.out.println("----out of method---this is a constructor block");
    }

    static {
        System.out.println("this is a static block");
        System.out.println(sa);
        //System.out.println(a);
        b();
        //a();
    }
    public Test() {
        System.out.println("this is empty constructor");
    }
    public Test(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.a();

        Test t2 = new Test();
        t2.a();
    }


}



