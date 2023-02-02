public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(6));

    }
    public static int isPerfectSquare(int num){
    while (num >=0){
        for (int i= 0; i<num; i++){
            if (i*i ==num){
                return num;
            }

        }
        num++;
    }
    return 0;
    }
  }