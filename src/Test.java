
public class Test {
  
  public static void main(String apples[]){
    System.out.println(getItemStatusFromItemData("kjasfk"));
  }
  
  private static String getItemStatusFromItemData(String str) {
    String status = "";
    switch (str) {
    case "r":
        status = "Red";
        break;
    case "g":
        status = "Green";
        break;
    case "a":
        status = "Yellow";
        break;
    default:
      status = "Grey";
      break;
    

    }

    return status;

}

}
