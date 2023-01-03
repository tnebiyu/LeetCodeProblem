public class Main {
    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }
//a number n > 0 is called cube-pwerful if it is equal to the sum of the cubes of its digits
    public static int isCubePowerful(int number){
        int totalSum =0;
        int originalNum = number;

        int digit;

        if (number<=0)
            return 0;
        while (number!=0){
           digit= number %10;
            number/=10;
            totalSum+= digit * digit * digit;
        }

       return totalSum == originalNum ? 1: 0;
    }
}