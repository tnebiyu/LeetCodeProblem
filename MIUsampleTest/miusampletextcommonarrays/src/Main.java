public class Main {
    public static void main(String[] args) {
int[] first = {1,2,3,4,5};
int[] second = {3,7,8,4,5};
        System.out.println(findCommonElement(first, second));
    }
    public static int[] findCommonElement(int[] first , int[] second){
        int commonElement[] = {};
        for (int i =0; i<first.length; i++){
            for (int j=0; j<second.length;j++){
                if (first[i] == second[j]){
                    System.out.println(first[i]);

                }
            }

        }
        return commonElement;
    }

}