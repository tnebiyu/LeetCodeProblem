import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{1,3,2,4,1}, 7));
    }
    public static int maxIceCream(int[] costs, int coins){
        Arrays.sort(costs);
        int n = costs.length;
        int answer = 0;
        while (answer < costs.length && costs[answer] <= coins){
            coins -=costs[answer];
            answer++;
        }

return answer;
    }
}