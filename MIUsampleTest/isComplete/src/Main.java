public class Main {
    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
        System.out.println(isComplete(new int[]{2, 2}));
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[]{5, 7, 9, 13}));


    }
    public static int isComplete(int[]array) {
        int evenCount=0;
        int minEven = array[0];
        int maxEven = array[0];
        int count =0;
for (int i=1; i< array.length; i++){
    if (minEven <0 && maxEven < 0 ){
        minEven = array[1];
        maxEven =array[1];
    }
    // to check if it even
    if (array[i]%2 ==0){
        evenCount++;
    }
    if (evenCount ==1){
        if (array[i] > maxEven){
            maxEven =array[i];
        }
        if(array[i] <minEven){
            minEven = array[i];
        }

    }
    evenCount =0;
}

if (minEven == maxEven)
    return 0;

int number = maxEven -minEven;
for (int i=0; i< array.length; i++){
    for (int j=minEven; j<maxEven; j++){
        if (j == array[i] ){
          count++;

        }
        if (count ==number)
            return 1;

    }


}
        return 0;
    }

}