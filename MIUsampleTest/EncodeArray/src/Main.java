import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));

    }
    public static int[] encodeNumber(int num){
        List<Integer> primeFactor = new ArrayList<>();
        if (num <=1)
            return null;
        for (int i=2; i<=num; i++){
            if (num%i == 0){
               primeFactor.add(i);
               num /= i;
            }
        }
        if (num > 1)
            primeFactor.add(num);
        int[] arrayToReturn = new  int[primeFactor.size()];
        for (int i=0; i<arrayToReturn.length; i++){
            arrayToReturn[i] = primeFactor.get(i);
        }
return arrayToReturn;
    }
}