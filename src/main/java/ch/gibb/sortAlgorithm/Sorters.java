package ch.gibb.sortAlgorithm;

import java.util.Random;

public class Sorters {



    public static void main(String[] args) {


        int[] arr = createArray(100000);

        long start = start();
        new InsertionSort(arr.clone()).sort();
        System.out.println("time InsertionSort: \t" + time(start));


        start = start();
        new BubbleSort(arr.clone()).sort();
        System.out.println("time BubbleSort:   \t\t" + time(start));
        start = start();
        new SelectionSort(arr.clone()).sort();
        System.out.println("time SelectionSort: \t" + time(start));

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

