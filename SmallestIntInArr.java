import java.util.Arrays;

public class SmallestIntegerFinder {
  public static int findSmallestInt(int[] args) {
    int min = 99999999;
    int length = args.length;
    int i;
    for(i = 0; i < length; i++) {
      if(args[i] < min) {
        min = args[i];
      }
    }
    return min;
  }
}