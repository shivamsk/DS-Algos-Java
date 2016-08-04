package LinkedList;

public class NthNodeFromLast {

  public static void main(String args[]) {
    Node head = new Node(1);
    head.appendToTail(2);
    head.appendToTail(3);
    head.appendToTail(1);
    head.appendToTail(2);
    head.appendToTail(4);

    head.printLinkedList(head);

    System.out.println("Nth To Last Node " + nthToLast(head, 0).data);
    System.out.println("Nth To Last Node " + nthToLastStandard(head, 0).data);

  }

  private static Node nthToLast(Node head, int n) {

    if (head == null || n < 1) {
      return null;
    }

    Node temp = head;
    Node result = head;
    int length = temp.findLength(temp);

    int resLength = length - n;
  

    while (resLength >= 1 && result != null) {
      result = result.next;
      resLength--;
    }

    return result;
  }
  
  static Node nthToLastStandard(Node head, int n) {
    
    if (head == null || n < 1) {
        
    return null;
      
    }
      
    Node p1 = head;
      
    Node p2 = head;
      
    for (int j = 0; j < n - 1; ++j) { // skip n-1 steps ahead
        
    if (p2 == null) {
          
    return null; // not found since list size < n
        
    }
        
    p2 = p2.next;
      
    }
      
    while (p2.next != null) {
        
    p1 = p1.next;
        
    p2 = p2.next;
       }
       return p1;
    }

}
