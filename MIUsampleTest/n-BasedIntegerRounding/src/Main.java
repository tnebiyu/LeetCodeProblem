public class Main {
    public static void main(String[] args) {
      doIntegerBasedRounding(new int[]{1,2,3,4,5}, 2);
        doIntegerBasedRounding(new int[]{1,2,3,4,5}, 3);
      doIntegerBasedRounding(new int[]{1,2,3,4,5}, -3);
      doIntegerBasedRounding(new int[]{-1,-2,-3,-4,-5},3 );
       doIntegerBasedRounding(new int[]{-18,1,2,3,4,5}, 4);
       doIntegerBasedRounding(new int[]{1,2,3,4,5}, 5);
       doIntegerBasedRounding(new int[]{1,2,3,4,5}, 100);



    }
    public  static void doIntegerBasedRounding(int[] a, int n){


        if (n<=0) return;


for (int i=0; i<a.length; i++) {
    if (a[i] >= 0) {
        int lowerBound = (a[i] / n) * n;
        int upperBound = lowerBound + n;
        int middleElement = n % 2 == 0 ? lowerBound + n / 2 : lowerBound + n / 2 + 1;

        if (a[i] > middleElement) a[i] = upperBound;
        else a[i] = lowerBound;


    }


}
}}