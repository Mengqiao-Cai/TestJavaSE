package com.cmq.test02;

/**
 * @author: cmq
 * @date: 8/5/2024 - 08 - 05 - 5:34 PM
 * @version: 1.0
 */

//E must be a referenced type, not primitive type
public class GenericTest<E> {
    int age;
    String name;
    E sex;

    public void a(E n) {

    }

    public void b(E[] m) {

    }
}

class SubGenericTest extends GenericTest<Integer> {

}

class SubGenericTest2<E> extends GenericTest<E> {

}
class Demo2{
    public static void main(String[] args) {
        SubGenericTest2<String> s = new SubGenericTest2<>();
        s.a("111");
        s.sex = "female";
    }
}
class Demo{
    public static void main(String[] args) {
        //when you specify the generic when extends from father's class
        //you no longer need to specify it again when declare this object
        SubGenericTest sgt = new SubGenericTest();
        sgt.a(19);
    }
}
class Test{
    public static void main(String[] args) {
        //when not specify the generic: default -> object
        GenericTest gt1 = new GenericTest();
        gt1.a("abc");
        gt1.a(17);
        gt1.a(9.8);
        gt1.b(new String[]{"a","b","c"});

        //when specify the generic:
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.sex = "male";
        gt2.a("abc");
        gt2.b(new String[]{"a","b","c"});
    }
}
