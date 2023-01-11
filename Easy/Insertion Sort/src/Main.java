import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {2,12,3,4,5,1,82,23};
        for (int unsorted = 1; unsorted < intArray.length; unsorted++){
            int newElement = intArray[unsorted];
            int i;
            for (i = unsorted; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];

            }
            intArray[i] = newElement;

        }
            System.out.println("sorted array become " + Arrays.toString(intArray));
    }
}