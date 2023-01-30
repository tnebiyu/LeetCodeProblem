public class Main {
    public static void main(String[] args) {

        System.out.println(isComplete(new int[]{5,3,3,4,5}));
        System.out.println(isComplete(new int[]{3,2,1,4,5}));
   System.out.println(isComplete(new int[]{3,2,1,6,5}));


    }
    public static int isComplete(int[] array){
       int midElement = array[array.length/2];

       int count =0;
       if (array.length %2 !=0){
           for (int j : array) {
               if (j > midElement) {
                   count++;
               }


           }

           if (count == array.length-1)
               return 1;
       }
       else return 0;





return 0;
    }

}