public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(6));

    }
    public static int isPerfectSquare(int num){
int nextInt = (int) Math.floor(Math.sqrt(num))+1;
        System.out.println(nextInt);
return nextInt  * nextInt;
    }

  }