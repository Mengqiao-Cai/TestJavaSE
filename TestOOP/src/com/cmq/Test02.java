package com.cmq;

import javax.xml.bind.Element;
import java.sql.SQLOutput;
import java.util.*;

/**
 * @author: cmq
 * @date: 7/22/2024 - 07 - 22 - 4:19 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        int n = 12345;
        int digit = -1;
        int count = 0;
        while (n>0) {
            digit = n%10;
            n/=10;
            count += 1;
        }
        System.out.println(digit+","+n+","+count);
        String a = "abc";
        System.out.println(a.length());


        //hashset of an array
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {3,2,1};
        Set<int[]> hash1 = new HashSet<int[]>();
        hash1.add(array1);
        hash1.add(array2);
        hash1.add(array3);
        for (int[] element: hash1) {
            System.out.println(Arrays.toString(element));
        }
        System.out.println("=========================");
        Set<List<Integer>> hash2 = new HashSet<>();
//        hash2.add(new ArrayList<>(List.of(1,2,3)));
//        for (List<Integer> element: hash2) {
//            System.out.println(Arrays.toString(element));
//        }

        List<String> list = new ArrayList<>();
        HashSet<int[]> hash3 = new HashSet<>();
        ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> a3 = new ArrayList<Integer>(Arrays.asList(2,4,6));
        hash2.add(a1);
        hash2.add(a2);
        hash2.add(a3);
        for (List<Integer> element: hash2) {
            System.out.println(element);
        }
        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);
        System.out.println(array1.equals(array2));

        System.out.println("===================");
        System.out.println(Math.abs(-29));
        Integer i1 = 100;
        System.out.println((int) i1);
        int[] array = {5, 3, 8, 1, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String s1 = "abc";
        System.out.println(s1.substring(0,2));
        System.out.println(s1);

        String s2 = "abcd";
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(2147483647+2147483647);
        System.out.println(Integer.MIN_VALUE+Integer.MIN_VALUE);

        int[] a10 = new int[9];
        System.out.println(1/3);

        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        for (int i=0;i<5;i++) {
            ArrayList<Integer> tempArray = new ArrayList<>();
            for (int j=0;j<4;j++) {
                tempArray.add(j+i);
            }
            map.add(tempArray);
        }
        System.out.println(map.get(2).get(3));
    }
}
