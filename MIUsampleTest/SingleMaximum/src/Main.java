public class Main {
    public static void main(String[] args) {
        System.out.println(hasSingleMaximum(new int[] {1,2,3}));
        System.out.println(hasSingleMaximum(new int[] {18}));
        System.out.println(hasSingleMaximum(new int[] {1,2,3,0,1,2,3}));
        System.out.println(hasSingleMaximum(new int[] {-6,-6,-6,-6,-6,-6}));
        System.out.println(hasSingleMaximum(new int[] {13,1,13,2,13,0,1,13}));
        System.out.println(hasSingleMaximum(new int[] {}));

        System.out.println(hasSingleMaximum2(new int[] {1,2,3}));
        System.out.println(hasSingleMaximum2(new int[] {18}));
        System.out.println(hasSingleMaximum2(new int[] {1,2,3,0,1,2,3}));
        System.out.println(hasSingleMaximum2(new int[] {-6,-6,-6,-6,-6,-6}));
        System.out.println(hasSingleMaximum2(new int[] {13,1,13,2,13,0,1,13}));
        System.out.println(hasSingleMaximum2(new int[] {}));



    }
    public static int hasSingleMaximum(int[] array){
        int Max = Integer.MIN_VALUE;
        int count = 0;
        int i = 0;
        while (i<array.length){
            if (array[i] > Max){
                Max = array[i];
            }
            i++;

        }
        for (int k : array) {

            if (Max == k) {
                count++;
            }

        }
        if (count ==1){
            return  1;
        } else {
            return 0;

        }

    }
    //optimized solution
    public static int hasSingleMaximum2(int[] array){
        if (array.length == 0) return  0;
        int max = array[0];
        boolean duplicated = false;
        for (int i =1; i<array.length; i++){
            if (array[i] >max){
                max = array[i];
                duplicated = false;
            } else if (array[i] == max) {
                duplicated  = true;

            }

        }
        if (duplicated) return 0;
        return 1;
    }
}