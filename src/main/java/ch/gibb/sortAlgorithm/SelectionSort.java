package ch.gibb.sortAlgorithm;

public class SelectionSort implements Sortable{

    private int[] numbers;

    public SelectionSort(int[] numbers) {
        this.numbers = numbers;
    }
    @Override
    public int[] sort(){

        int temp;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                if(numbers[i]> numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }



        return numbers;

    }
}
