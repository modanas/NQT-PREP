public class StringRemoveSpaces {
 public static String removeSpaces(String str) {
  String remove = str.replaceAll("\\s", "a");
  return remove;
 }
 public static void main(String[] args) {
  String str = " k e b a b ";
  System.out.println(removeSpaces(str));
 }
}
