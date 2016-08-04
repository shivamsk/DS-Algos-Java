package LinkedList;

public class Node {

  Node next = null;
  int data;

  public Node(int d) {
    data = d;
  }

  void appendToTail(int d) {
    Node end = new Node(d);
    Node n = this;
    while (null != n.next) {
      n = n.next;
    }
    n.next = end;
  }

  Node deleteNode(Node head, int d) {

    if (null == head){
      return head;
    }
    Node temp = head;
    if (temp.data == d) {
      return temp.next;
    }

    while (null != temp.next) {
      if (temp.next.data == d) {
        temp.next = temp.next.next;
        return head;
      }
      temp = temp.next;
    }
    return null;
  }
  
  public void printLinkedList(Node head) {
    Node temp = head;

    while (null != temp) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  
  public int findLength(Node head){
    Node temp = head;
    int length = 0;
    
    while ( null != temp){
      length++;
      temp = temp.next;
    }
    
    return length;
    
  }

}
