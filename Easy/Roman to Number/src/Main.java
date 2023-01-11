import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
         }
    public static final Map<Character, Integer> ROMAN_NUMBERS = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int sum = 0, i;

        for (i = 0; i < s.length() - 1; i++) {
            sum += checkNextChar(s.charAt(i), s.charAt(i + 1));
        }
        sum += ROMAN_NUMBERS.get(s.charAt(i));
        return sum ;
    }

    private int checkNextChar(Character currentRomanLetter, Character nextRomanLetter) {
        if (currentRomanLetter == 'I' && (nextRomanLetter == 'V' || nextRomanLetter == 'X')) {
            return -1;
        } else if (currentRomanLetter == 'X' && (nextRomanLetter == 'L' || nextRomanLetter == 'C')) {
            return -10;
        } else if (currentRomanLetter == 'C' && (nextRomanLetter == 'D' || nextRomanLetter == 'M')) {
            return -100;
        } else {
            return ROMAN_NUMBERS.get(currentRomanLetter);
        }
    }
//    public static int romanToNumber(String s){
//        int num =0;
//        int ans =0;
//        for (int i = s.length() -1; i>=0; i++){
//            switch(s.charAt(i)){
//            case 'I': num = 1; break;
//            case 'V': num = 5; break;
//            case 'X': num = 10; break;
//            case 'L': num = 50; break;
//            case 'C': num = 100; break;
//            case 'D': num = 500; break;
//            case 'M': num = 1000; break;
//        }
//
//            if (4 * num < ans) ans -= num;
//            else ans += num;
//
//        }
//        return ans;
//    }
}