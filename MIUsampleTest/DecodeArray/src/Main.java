public class Main {
    public static void main(String[] args) {
        System.out.println( decodeArray(new int[]{2,-3,-2,6,9,18}));
        System.out.println( decodeArray(new int[]{0,-3,0,-4,0}));
        System.out.println( decodeArray(new int[]{-1,5,8,17,15}));
        System.out.println( decodeArray(new int[]{1,5,8,17,15}));
        System.out.println( decodeArray(new int[]{111,115,118,127,125}));

    }
    public static int  decodeArray(int[] array){
        int encodeNumber = 0;
        if (array.length < 2) return 0;
        for (int i=0; i<array.length-1; i++){
           int digit = Math.abs(array[i] -array[i+1]);
encodeNumber = encodeNumber*10 + digit;





        }
        if (array[0] < 0) return encodeNumber *-1;
        return encodeNumber;

    }

}