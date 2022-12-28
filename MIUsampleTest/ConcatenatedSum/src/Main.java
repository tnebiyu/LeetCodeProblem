public class Main {
    public static void main(String[] args) {
        System.out.println(concatenatedSum(2997,3));
    }
    public static int concatenatedSum(int number, int catlen){
        int orginalNumber = number;
        int totalSum = 0;
        while (number !=0){
            int digit = number%10;
            int cocaSum =0;
            for (int i=0; i< catlen; i++){
                cocaSum =( cocaSum *10) +digit;
            }
            number /=10;
            totalSum += cocaSum;


        }
        return (orginalNumber == totalSum) ? 1: 0;
    }

}