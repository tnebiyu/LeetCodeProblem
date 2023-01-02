public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4};
        System.out.println(hasSingleMaximum(array));
    }
    public static int hasSingleMaximum(int[] array){
        int Max = Integer.MIN_VALUE;
        int count = 0;
        int i = 0;
        while (i<array.length){
            if (array[i] > Max){
                Max = array[i];


            }
            i++;

        }
        for (int j=0; j<array.length; j++){

            if (Max== array[j]){
                count++;
            }

        }
        if (count ==1){
            return  1;
        } else if (count <1 || count >1) {
            return 0;

        }

        return count;
    }
}