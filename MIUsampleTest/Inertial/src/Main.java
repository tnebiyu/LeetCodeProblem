public class Main {
    public static void main(String[] args) {
//a. it contains at least one odd value
//b. the maximum value in the array is even
//c. every odd value is greater than every even value that is not the maximum value.
        System.out.println(isInertia(new int[]{11, 4, 20, 9, 2, 8}));

    }
    public static int isInertia(int[] array) {
        if (array.length == 0)
            return 0;

        boolean oddStatus = false;
        int[] OddArray = new int[array.length];
        int[] EvenArray = new int[array.length];
        int oddIndex =0;
        int isInertia = 0;
        int evenIndex =0;
        int max = Integer.MIN_VALUE;
        for (int k : array) {
            if (k % 2 != 0) {
                oddStatus = true;
                OddArray[oddIndex] = k;
                oddIndex++;
            } else {
                EvenArray[evenIndex] = k;
                evenIndex++;
            }

            if (k > max) {
                max = k;
            }
        }
        if (oddStatus && max %2 ==0){
            for (int i =0; i<oddIndex; i++){
                for (int j =0; j<evenIndex; j++){
                    if (EvenArray[i] != max){
                        if (OddArray[i] >EvenArray[j]){
                            isInertia =1;
                        }
                        else{
                            isInertia =0;
                            break;
                        }
                    }
                    else {
                        isInertia =1;
                    }

                }
                if (isInertia ==0)
                    break;
            }

        }
        return  isInertia;


    }
}
/*public class Main {

    public static void main(String[] args) {


        System.out.println(isInertial(new int[]{1}));


        System.out.println(isInertial(new int[]{2}));


        System.out.println(isInertial(new int[]{1, 2, 3, 4}));


        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));


        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));


        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));


        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));


        System.out.println(isInertial(new int[]{2, 3, 5, 7}));


        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));

    }

    static int isInertial(int[] a){
        int isInertial = 0;
        boolean containsOddValue = false;
        int maxValue = Integer.MIN_VALUE;
        int[] oddValues = new int[a.length];
        int[] evenValues = new int[a.length];
        int oddValuesIndex = 0;
        int evenValuesIndex = 0;
        for(int index = 0; index < a.length; index++){
            if((a[index] % 2) != 0){
                containsOddValue = true;
                oddValues[oddValuesIndex] = a[index];
                oddValuesIndex++;
            }else{
                evenValues[evenValuesIndex] = a[index];
                evenValuesIndex++;
            }
            if(a[index] > maxValue){
                maxValue = a[index];
            }
        }
        if(containsOddValue){
            if(maxValue % 2 == 0){
                for(int oddIndex = 0; oddIndex < oddValuesIndex; oddIndex++){
                    for(int evenIndex = 0; evenIndex < evenValuesIndex; evenIndex++){
                        if(evenValues[evenIndex] != maxValue){
                            if(oddValues[oddIndex] > evenValues[evenIndex]){
                                isInertial = 1;
                            }else{
                                isInertial = 0;
                                break;
                            }
                        }else{
                            isInertial = 1;
                        }
                    }
                    if(isInertial == 0){
                        break;
                    }
                }
            }
        }
        return isInertial;
    }

}*/