public class StringNextLexicographic {
 public static String lexicographic(String str) {
  char ch;
  String result = "";
  int n = str.length();
 
  for (int i = 0; i < n; i++) {
   //if character is z
   if (str.charAt(i) == 'z') {
    ch = str.charAt(i);
    result += (char) (((int) ch) - 25);
   }
   ch = str.charAt(i);
   result += (char) (((int) ch) + 1); //type casting to get ascii value then adding +1 to it to get nxt char
  }
 
  return result;
 }
 public static void main(String[] args) {
  String str = "HiiGuyz";
  System.out.println(lexicographic(str));
 }
}
