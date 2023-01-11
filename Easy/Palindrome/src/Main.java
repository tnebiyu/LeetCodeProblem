import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static  boolean isPalindrome(int x){
        int orginal =x;
        int reverse = 0;
        while (x !=0){
            reverse *=10;
            reverse  += x %10;



            x/=10;
        }
        if (orginal <0)
           return Integer.toString(reverse) == Integer.toString(orginal) ? true : false;


        return reverse == orginal ? true: false;
    }
    public boolean isPalindrome1(int x) {
        if(x<0) return false;
        ArrayList<Integer> list
                = new ArrayList<Integer>();
        int n=x;

        while(n>0){
            list.add(n%10);
            n=n/10;
        }

        n=x;
        for(int i=list.size()-1;i>=list.size()/2;i--){
            if((n%10)!=list.get(i)){
                return false;
            }
            n=n/10;
            // System.out.println(list.get(i));
        }
        return true;
    }
}