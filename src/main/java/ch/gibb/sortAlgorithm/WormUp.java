package ch.gibb.sortAlgorithm;

public class WormUp {

    private static int [] numbers = new int[] {1,2,3,4,7,10};

    public static void main(String[] args) {

        System.out.println(checkOdd(numbers));

    }
    public static boolean checkOdd(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                for (int j = i+1; j < numbers.length; j++) {
                   if(numbers[j] % 2 != 0 && numbers[i]*numbers[j]%2 != 0){
                       return true;
                   }
                }
            }
        }
        return false;
    }

}
