public class StringReverse {
 public static String reverse(String str) {
  int n = str.length();

  for (int i = n - 1; i >= 0; i--) {
   // reverse a string
   String rev = "";
   rev += str.charAt(i);
   System.out.print(rev);
  }
  return str;
 }

 public static void main(String[] args) {
  String str = "anas";
  reverse(str);
 }
}
