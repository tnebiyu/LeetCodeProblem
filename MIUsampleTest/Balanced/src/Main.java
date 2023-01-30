public class Main {
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{2,3,6,7}));
        System.out.println(isBalanced(new int[]{6,7,2,3,12}));
        System.out.println(isBalanced(new int[]{7,15,2,3}));
        System.out.println(isBalanced(new int[]{16,6,2,3}));



    }
    public static int isBalanced(int[] array){
        int count =0;
for (int i=0; i< array.length; i++){
    if ((isEven(i) && array[i]%2 ==0) || (isOdd(i) && array[i]%2 !=0)){
        count++;

    }
    if (count == array.length){
        return 1;
    }

}
return 0;
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static  boolean isOdd(int num){
        return  num %2 !=0;
    }
}