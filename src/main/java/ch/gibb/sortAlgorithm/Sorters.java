package ch.gibb.sortAlgorithm;

public class Sorters {

    private static int[] numbers = new int[]{7,2,0, 9, 1, 4, 3,8};


    public static void main(String[] args) {

        print(numbers);
        print(new InsertionSort(numbers.clone()).sort());

        print(numbers);
        print(new BubbleSort(numbers.clone()).sort());

        print(numbers);
        print(new SelectionSort(numbers.clone()).sort());

    }

    public static void  print(int[]numbers){
        for (int i :
                numbers) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}

