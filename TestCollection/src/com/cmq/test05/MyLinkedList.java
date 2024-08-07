package com.cmq.test05;

/**
 * @author: cmq
 * @date: 8/7/2024 - 08 - 07 - 3:24 PM
 * @version: 1.0
 */
public class MyLinkedList {
    Node first;
    Node last;
    int count;
    public MyLinkedList() {

    }

    public void add(Object o) {
        if (first==null) {
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            first = n;
            last = n;
        } else {
            Node n = new Node();
            n.setObj(o);
            n.setPre(last);
            last.setNext(n);
            n.setNext(null);
            last = n;
        }
        count++;
    }

    public int getSize() {
        return count;
    }

    public Object get(int index) {
        Node n = first;
        for (int i=0;i<index;i++) {
            n = n.getNext();
        }
        return n.getObj();
    }
}

class Test {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
        System.out.println(ml.getSize());
        System.out.println(ml.get(2));
    }
}
