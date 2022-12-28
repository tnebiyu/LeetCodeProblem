public class Main {
    public static void main(String[] args) {
        System.out.println(findReverse(12345));
    }
    public static int findReverse(int number){

        int reverse = 0;
        if (number <0) {
            return -1;
        }
        while (number !=0){
            reverse *=10;
            reverse += number % 10;
            number /=10;
        }
        return reverse;

}}