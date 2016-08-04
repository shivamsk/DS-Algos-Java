import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapTes {
  
  public static void main(String [] apples){
    Map<String,String> map = new HashMap<String,String>();
    
    map.put("a", "1");
    map.put("b", "2");
    map.put("c", "3");
    map.put("1", "100");
    map.put("d", "4");
    map.put("e", "5");
    map.put("f", "6");
    
    List<String> list = new ArrayList<String>();
    //list.
    
    for(Map.Entry<String, String> entry : map.entrySet()){
      System.out.println(" Key:" + entry.getKey() + " Value:" + entry.getValue() );
    }
  }

}
