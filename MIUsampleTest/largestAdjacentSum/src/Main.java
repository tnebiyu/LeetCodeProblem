public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,2,1,1,1};

        System.out.println(largestAdjacentSum(array));
    }
public static  int largestAdjacentSum(int[] array){
       //int leftSum = 0;
       // int rightSum = 0;
        int max = Integer.MIN_VALUE;
        if (array.length == 2){
            return  array[0] + array[1];
        }
        for (int i=0; i<array.length-1; i++){
            if ((array[i] + array[i+1]) > max){
                max = array[i] +array[i+1];
            }
//            for (int j =array.length-1; j>1; j--){
//                leftSum += array[i] + array[i+1];
//                rightSum += array[j] + array[j-1];
//                if (leftSum >rightSum){
//                    return  leftSum;
//                }
//                else
//                    return rightSum;
//            }

        }
//        return (leftSum >rightSum ? leftSum : rightSum);
    return max;
}
}