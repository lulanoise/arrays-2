package it.develhope.arraysandlists;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        String[] aliceToDos = {"Coding", "Reading", "Learning"};
        String[] bobToDos = {"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos = {"Reading", "Learning", "Coding"};

        // here we compare if the arrays (the objects) are equal
        System.out.println("Is Alice's array equal to Bob array? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice's array equal to Tim array? " + Arrays.equals(aliceToDos, timToDos));

        // here we compare the length
        System.out.println("Is Alice's array having the same length of Bob's array? " + (aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == timToDos.length));

        // first we sort the arrays, so that we can compare them later and understand if the arrays have the same tasks
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);

        // now we can compare the sorted arrays
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.compare(aliceToDos, bobToDos));
        System.out.println("Is Alice having the same tasks of Tim? " + Arrays.compare(aliceToDos, timToDos));
        System.out.println("Is Alice having the same tasks of Bob? " + (Arrays.compare(aliceToDos,bobToDos)==0?"yes, she is" : "no, she isn't"));
        System.out.println("Is Alice having the same tasks of Tim? " + (Arrays.compare(aliceToDos,timToDos)==0?"yes, she is" : "no, she isn't"));
    }
}




      
