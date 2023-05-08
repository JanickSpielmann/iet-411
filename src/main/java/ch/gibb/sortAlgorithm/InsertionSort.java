package ch.gibb.sortAlgorithm;



public class InsertionSort implements Sortable {

    private int[] numbers;

    public InsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

@Override
    public int[] sort() {

        int temp;
        for (int i = 1; i < numbers.length; i++) {
            temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > temp) {

                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;

        }

        return numbers;
    }
}
