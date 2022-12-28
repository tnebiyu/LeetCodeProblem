public class Main {
    public static void main(String[] args) {
        char[] b = {'a','b','c'};
        System.out.println( findChar(b,0,3));
    }
    public static char[] findChar(char[] character, int start , int charLength){
       char[] result = {};
        if (start >character.length || start < 0 || charLength <0 || start +charLength -1 >= character.length){

            return null;
        }

        char[] sub = new char[charLength];
        for (int i = start;i<sub.length; i++){
            int j = 0;

                sub[j] = character[i];
                j++;



        }
        return sub;

    }
}