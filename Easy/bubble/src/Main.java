import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {1,2,8,3,54,45,3};
        for (int lastIndex= arrays.length-1; lastIndex>0; lastIndex--){
            for (int i=0; i<lastIndex; i++){
                if (arrays[i] > arrays[i+1]){
                    swap(arrays,i, i+1);
                }
            }

        }
        for (int i=0; i<arrays.length; i++){
            System.out.println("swapped array are " + Arrays.toString(arrays));
        }
    }
    public static  void swap(int[] array, int i, int j){
        if (i == j)
            return;
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}