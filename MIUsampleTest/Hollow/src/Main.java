public class Main {
    public static void main(String[] args) {
        System.out.println(isHollow(new int[] {1,2,4,0,0,0,3,4,5}));
        System.out.println(isHollow(new int[]{1,2,4,9,0,0,0,3,4,5}));
        System.out.println(isHollow(new int[]{1,2,0,0,3,4,5}));
        System.out.println(isHollow(new int[]{1,2,4,9,0,0,0,3,4,5}));

    }
    public static int isHollow(int[] array){
        int countLeftZeros = 0;
        int countLeft =0;
        int countRightZeros =0;


        int countRight =0;
        int midIndex = array.length/2;


            for (int i=0; i<=midIndex; i++){

                if (array[i] != 0 ){
                    countLeft++;
                }
                if (array[i] ==0){
                    countLeftZeros++;
                }

            }
            for (int j =midIndex+1; j< array.length; j++){
                if (array[j] !=0){
                    countRight++;
                }
                if (array[j] ==0){
                    countRightZeros++;
                }
            }
            if ((countLeft == countLeftZeros +countRightZeros) && (countRight == countLeftZeros +countRightZeros)){
                return 1;
            }



return 0;
    }
}