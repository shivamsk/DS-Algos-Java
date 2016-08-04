import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromStr {

  public static void main(String args[]) {
    System.out.println("Result is " + removeDuplicates("abababa"));
  }

  private static String removeDuplicates(String str) {

    String result = "";

    Map<Character, Boolean> map = new HashMap<Character, Boolean>();

    for (int i = 0; i < str.length(); i++) {
      if (map.containsKey(str.charAt(i))) {
        if (map.get(str.charAt(i))) {
         //result = result;
        }
      }else {
      map.put(str.charAt(i), true);
      result += str.charAt(i);
      }
      
      

    }

    return result;

  }

}
