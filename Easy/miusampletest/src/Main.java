public class Main {
    public static void main(String[] args) {

int[] numbers = {1};
        System.out.println(findTheMiddle(numbers));
    }
    public static int findTheMiddle(int[] arrays) {
        if (arrays.length %2 == 0){
           return 0;
        }
        int middleNumberIndex = arrays.length /2;
        int middleNumber = arrays[middleNumberIndex];

        for (int i =0; i<arrays.length; i++){
            if (arrays[i] < middleNumber && i != middleNumberIndex)
             return 0;


        }
        return 1;
    }

}