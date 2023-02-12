public class Main {
    public static void main(String[] args) {
        System.out.println(isAllPossiblities(new int[]{1,2,0,3}));
        System.out.println(isAllPossiblities(new int[]{3,2,1,0}));
        System.out.println(isAllPossiblities(new int[]{0, 2, 3}));
        System.out.println(isAllPossiblities(new int[]{0}));
        System.out.println(isAllPossiblities(new int[]{}));



    }
    public static int isAllPossiblities(int[] array){
        if(array.length == 0){
            return 0;
        }
int status = 1;
        int counter;
        for (int i=0; i<array.length; i++){
            counter =0;
            for (int k : array) {
                if (i == k) {
                    counter++;
                }


            }
            if (counter ==0){
                status =0;
                break;
            }

        }
        return status;
    }
}