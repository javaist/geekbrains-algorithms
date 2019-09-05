package ru.xsd.javaist.algorithms;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyArray<Integer> myArray = new MyArray<Integer>();
        MyArray<Integer> secondArray = new MyArray<>();
        MyArray<Integer> thirdArray = new MyArray<>();
        Random r = new Random();
        for ( int value : r.ints(20, 0, 100).toArray()
             ) {
            myArray.add(value);
            secondArray.add(value);
            thirdArray.add(value);
        }
//        myArray.add(5);
//        myArray.add(3);
        System.out.println(myArray.toString());
        myArray.remove(Integer.valueOf("3"));
        myArray.remove(10);
//        myArray.sortSelect();
        myArray.sortInsert();
        System.out.println(myArray.toString());
        System.out.println(secondArray.toString());
    }
}
