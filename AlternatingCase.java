public class StringUtils {
  
  public static String toAlternativeString(String string) {
    // Algorithm: 
    // Create var to store array of chars, create var for answer string 
    // split string into array
    // iterate through string to check each char if caps or small case
    // flip the case and concatenate to the answer string
    // return the string
    String[] charsSplit = string.split("");
    System.out.println(charsSplit);
  }
}