package ch.gibb.sortAlgorithm;

import ch.gibb.sortAlgorithm.ChatGPTEdition.bubbleSort;
import ch.gibb.sortAlgorithm.ChatGPTEdition.insertionSort;
import ch.gibb.sortAlgorithm.ChatGPTEdition.selectionSort;

import java.util.Random;

public class Sorters {



    public static void main(String[] args) {


        int[] arr = createArray(100000);

        long start = start();
        new InsertionSort(arr.clone()).sort();
        System.out.println("time InsertionSort: \t\t" + time(start));

        start = start();
        new BubbleSort(arr.clone()).sort();
        System.out.println("time BubbleSort:   \t\t\t" + time(start));

        start = start();
        new SelectionSort(arr.clone()).sort();
        System.out.println("time SelectionSort1: \t\t" + time(start));

        start = start();
        new SelectionSort(arr.clone()).sort2();
        System.out.println("time SelectionSort2: \t\t" + time(start));

        System.out.println("------------ ChatGPT--------------");
        start = start();
        insertionSort.insertionSort(arr.clone());
        System.out.println("GPT time InsertionSort: \t" + time(start));

        start = start();
        bubbleSort.bubbleSort(arr.clone());
        System.out.println("GPT time BubbleSort: \t\t" + time(start));

        start = start();
        selectionSort.selectionSort(arr.clone());
        System.out.println("GPT time SelectionSort: \t" + time(start));




    }

    public static int[] createArray(int size){

        Random random = new Random();

        int [] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }


        return numbers;

    }

    public static void   print(int[]numbers){
        for (int i :
                numbers) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public static long start(){
        return System.nanoTime();
    }
    public static long time(long start){
        long stop = System.nanoTime();

        return (stop - start )/1000000;
    }
}

