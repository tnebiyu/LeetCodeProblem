public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,6,7,11};
        System.out.println(is235Array(array));
    }
    public static int is235Array(int[] arrays){
        int total =0;


        int length = arrays.length;
        for (int array : arrays) {
            if (array %2 ==0) total++;
            if (array %3 ==0) total++;
            if (array %5 ==0) total++;
            if (array %2 !=0 &&array %3 !=0&&array %5 !=0 ) total++;

        }
        return total == length ? 1: 0;
    }
}