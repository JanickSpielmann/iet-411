package ch.gibb.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Füllen der Listen mit Zufallszahlen
        for (int i = 0; i < 100000000; i++) {
            int randomNumber = (int) (Math.random() * 1000000);
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }
        long startTime = System.currentTimeMillis();
        int smallestArrayList = findSmallestElementArrayList(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("Kleinste Zahl in ArrayList: " + smallestArrayList);
        System.out.println("Verstrichene Zeit für ArrayList: " + (endTime - startTime) + " Millisekunden");
        startTime = System.currentTimeMillis();
        int smallestLinkedList = findSmallestElementLinkedList(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Kleinste Zahl in LinkedList: " + smallestLinkedList);
        System.out.println("Verstrichene Zeit für LinkedList: " + (endTime - startTime) + " Millisekunden");
    }

    public static int findSmallestElementArrayList(List<Integer> list) {
        int smallest = list.get(0);

        for (Integer i :
                list) {
            if(i< smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public static int findSmallestElementLinkedList(List<Integer> list) {
        int smallest= list.get(0);
        for (Integer i :
                list) {
            if(i< smallest){
                smallest = i;
            }
        }
        return smallest;
    }

}
