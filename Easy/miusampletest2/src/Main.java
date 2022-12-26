public class Main {
    public static void main(String[] args) {
        int[] arrays = {1,2,3};
        System.out.println(divide(arrays));
    }
    public static int divide(int[] numbers){
        int sumOdd = 0;
        int sumEven = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]% 2 == 0) {
                sumEven += numbers[i];

            } else if (numbers[i] %2 != 0) {
                sumOdd += numbers[i];
            }



        }
        return sumOdd -sumEven;

    }
}