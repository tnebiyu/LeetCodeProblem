public class Main {
    public static void main(String[] args) {
        int [] intArray = {12,2,1,53,23,22};
        for (int lastUnsortedArray = intArray.length-1; lastUnsortedArray>0; lastUnsortedArray--){
            int largest =0;
            for (int i=1; i<=lastUnsortedArray; i++ ){
                if (intArray[i] > intArray[largest]){
                  largest = i;
                }

            }
            swap(intArray, largest, lastUnsortedArray);

        }
        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
    public static void swap(int[] arrays, int i, int j){
        if (i== j)
            return;
        if (arrays[i] > arrays[j]){
            int temp;
            temp = arrays[i];
            arrays[i] =arrays[j];
            arrays[j] = temp;

        }
    }
}