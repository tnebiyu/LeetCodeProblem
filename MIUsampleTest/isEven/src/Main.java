public class Main {
    public static void main(String[] args) {
        System.out.println(isEven(24));

    }
  public static int isEven(int num){

    while (num>0){
        int digit = num %10;
        if (digit %2 !=0){
            return 0;
        }

        num /=10;
    }

    return 1;


    }
}