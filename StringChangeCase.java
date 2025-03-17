public class StringChangeCase {
 public static String changeCase(String str) {
  StringBuilder sb = new StringBuilder(str);
  int n = str.length();

  for(int i = 0; i < n; i++) {
   Character ch = sb.charAt(i);

   if(Character.isLowerCase(ch)) {
    sb.setCharAt(i, Character.toUpperCase(ch));
   }
   else {
    sb.setCharAt(i, Character.toLowerCase(ch));
   }
  }
  return sb.toString();
 }
 public static void main(String[] args) {
  String str = "GeeksForGeeks";
  System.out.println(changeCase(str));;
 }
}