import java.util.Arrays;

public class StringCharSort {
 public static String SortString(String str) {
  char c1[] = str.toCharArray();
  Arrays.sort(c1);

  return new String(c1); //convert arrays back to strings
 }
 public static void main(String[] args) {
  String str = "edcab";
  SortString(str);
 }
}
