package ch.gibb.sortAlgorithm;

public class BubbleSort implements Sortable{

    private int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }
@Override
    public int[] sort() {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
        return numbers;
    }
}
