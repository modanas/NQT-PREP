public class StringFindAsciValue {
 public static String findAsci(String str) {
  int n = str.length();

  for (int i = 0; i < n; i++) {
   int Val = (int) str.charAt(i);
   System.out.println("ASCII value of '" + str.charAt(i) + "' is: " + Val);
  }
  return str;
 } 
 public static void main(String[] args) {
  String str = "Don";
  System.out.println(findAsci(str));
 }
}
