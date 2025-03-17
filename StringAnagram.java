import java.util.Arrays;

public class StringAnagram {
 public static boolean Anagram(String s1, String s2) {
  char c1[] = s1.toCharArray();
  char c2[] = s2.toCharArray();

 //if length are equal or not
  if(c1.length != c2.length) {
    return false;
  }
  //sorting of character
  Arrays.sort(c1);
  Arrays.sort(c2);

  //iterating if c1 equals c2 or not
  for(int i = 0; i < c1.length; i++) {
   if(c1[i] != c2[i]) {
    return false;
   }
  }
  return true;
  }
 public static void main(String[] args) {
  String s1 = "LISTEN";
  String s2 = "SILENT";
  System.out.println(Anagram(s1, s2));
 }
}
