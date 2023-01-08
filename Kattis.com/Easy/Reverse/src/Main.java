public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
    public static long reverse(long number){
        int revNumb = 0;
        if (number<0)
            return 0;
        while (number >0){
            revNumb *= 10;
            revNumb += number %10;
            number /=10;
        }

        return  revNumb;

    }
    // TODO: 08/01/2023 wrong solution
    /*Little Jóna needs a program. The program should read integers and print them in reverse order. Jóna asks for your help.

Input

The first line of input contains the integer
n
. Then comes a list of
n
 integers, each on its own line.

Output

The list should be printed in reverse order of input.

Points

Group
Points
Input size
1
25
n
=
1
2
25
1
≤
n
≤
5
3
25
1
≤
n
≤
10
3
4
25
1
≤
n
≤
10
5
Sample Input 1	Sample Output 1
5
1
2
3
4
5
5
4
3
2
1
Sample Input 2	Sample Output 2
3
10
12
9
9
12
10*/
}