public class Main {
    public static void main(String[] args) {
        int[] arrayTemp = new int[]{1,1,1,2,1,1};
        System.out.println(isBean(arrayTemp));
    }
    public static int isBean(int[] array){

        for (int i=0; i<array.length; i++){
            boolean isbean = false;
            for (int j=0; j<array.length; j++){
                if (array[i]+1 == array[j] || array[i]-1== array[j]){
                   isbean = true;
                   break;
                }



            }
            if (isbean ==false)
                return 0;
        }


        return 1;
    }
}