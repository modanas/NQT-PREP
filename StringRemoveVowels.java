public class StringRemoveVowels {
 public static String removeVowels(String str) {
  int n = str.length();
  StringBuilder res = new StringBuilder();
  for (int i = 0; i < n; i++) {
   char ch = str.charAt(i);
   if (!(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'o' || ch == 'O' || ch == 'i' || ch == 'I'
     || ch == 'u' || ch == 'U')) {
    res.append(ch);
   }
  }
  return res.toString();
 }

 public static void main(String[] args) {
  String str = "mai hoOn spiderMan";
  System.out.println(removeVowels(str));
 }
}
