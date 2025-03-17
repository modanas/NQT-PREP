public class StringConcate {
 public static String concate(String s1, String s2) {
   String cncat = s1 + " " + s2;
   return cncat;
 }
 public static void main(String[] args) {
  String s1 = "Pyaare";
  String s2 = "Kebab";
  System.out.println(concate(s1, s2));
 }
}
