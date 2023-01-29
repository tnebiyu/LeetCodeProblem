public class Main {
    public static void main(String[] args) {
        System.out.println(isMagic(new int[]{21,3,7,9,11,22}));
        System.out.println(isMagic(new int[]{13,4,4,4,4}));
        System.out.println(isMagic(new int[]{0}));
        System.out.println(isMagic(new int[]{}));
        System.out.println(isMagic(new int[]{10,5,5}));


    }
    public static int isMagic(int[] array){
        if (array.length ==0)
            return 0;
        if(array[0] ==0)
            return 1;
        int count =0;
        int firstElemnt = array[0];
        int primeSum = 0;
        for (int i=1; i<array.length; i++){
            for (int j =1; j <= array[i]; j++){
                if(array[i]%j ==0){
                    count++;
                }
            }
            if (count ==2){
                primeSum+= array[i];

            }

            count =0;
        }
        return primeSum == firstElemnt ? 1 : 0;
    }
}