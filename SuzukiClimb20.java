public class Kata
{
    public static long stairsIn20(int[][] stairs)
    {
       int sum = 0; 
       int i;
       for( i = 0; i < stairs[0].length; i++ ) {
         sum += stairs[0][i] + stairs[1][i] + stairs[2][i] + stairs[3][i] + stairs[4][i] + stairs[5][i] + stairs[6][i];
       }
       System.out.println(sum * 20);
       return sum * 20;
    }
}