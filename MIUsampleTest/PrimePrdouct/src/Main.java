public class Main {
    public static void main(String[] args) {
        System.out.println(isPrimeProduct(26));

    }
public static int isPrimeProduct(int num){
        if (num <=0)
            return 0;
        for (int i=2; i< num; i++){
            for (int j=2; j< num; j++){
                if (isPrime(i) && isPrime(j ) && (i*j) == num){
                    return 1;

                }

            }
        }
        return 0;

}
public static boolean isPrime (int num){
        if(num <2)
            return false;
        int count =0;
        for (int i=1; i<=num; i++){
            if (num %i ==0){
                count++;
            }



        }
    return count == 2;
}
}