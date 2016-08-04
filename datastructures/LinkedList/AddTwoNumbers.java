package LinkedList;

public class AddTwoNumbers {

  public static void main(String apples[]) {
    Node a = new Node(7);
    a.appendToTail(5);
    a.appendToTail(9);
    a.appendToTail(4);
    a.appendToTail(6);
    
    Node b = new Node(8);
    b.appendToTail(4);
    
    Node result = addTwoLists(a, b);
    
    result.printLinkedList(result);
  }

  private static Node addTwoLists(Node a, Node b) {
    if (null == a && null == b) {
      return null;
    }
    if (null == a) {
      return b;
    }
    if (null == b) {
      return a;
    }

    int carry = 0;

    Node result = null;

    while (null != a || null != b) {

      int numa = (a != null) ? a.data : 0;
      int numb = (b != null) ? b.data : 0;

      int sum = numa + numb + carry;

      carry = (sum >= 10) ? 1 : 0;
      if (null == result) {
        result = new Node(sum % 10);
      } else {
        result.appendToTail(sum % 10);
      }
      
      if( null != a ){
        a= a.next;
      }
      
      if(null != b){
        b = b.next;
      }

    }
    
    if( carry > 0){
      result.appendToTail(1);
    }
    
    return result;

  }

}
