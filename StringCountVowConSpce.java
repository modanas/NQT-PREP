public class StringCountVowConSpce {

 public static String count(String str) {
  int n = str.length();
  int vCount = 0, cCount = 0, sCount = 0;
  for (int i = 0; i < n; i++) {
   if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
    vCount++;
   } else if (str.charAt(i) == ' ') {
    sCount++;
   } else {
    cCount++;
   }
  }
  System.out.println("Vowels : " + vCount);
  System.out.println("Consonants : " + cCount);
  System.out.println("Spaces : " + sCount);
  return str;
 }
 public static void main(String[] args) {
  String str = "mai hoon don";
  count(str);
 }
}
