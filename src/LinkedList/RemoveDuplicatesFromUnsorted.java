package LinkedList;

import java.util.Hashtable;

public class RemoveDuplicatesFromUnsorted {

  public static void main(String apples[]) {
    Node head = new Node(1);
    head.appendToTail(2);
     head.appendToTail(3);
     head.appendToTail(1);
     head.appendToTail(2);
     head.appendToTail(4);

    System.out.println("Before Removing Duplicates : ");
    head.printLinkedList(head);

    //removeDuplicates(head);
    removeDuplicatesStandard(head);
    //emoveDuplicatesWithoutBuffer(head);

    System.out.println("After Removing Duplicates : ");
    head.printLinkedList(head);

  }

  // My Solution
  private static Node removeDuplicates(Node head) {
    int a[] = new int[1000];

    Node temp = head;

    while (null != temp) {
      a[temp.data]++;
      if (null != temp.next) {
        if (a[temp.next.data] >= 1) {
          temp.next = temp.next.next;
        }
      }

      temp = temp.next;

    }

    head = temp;
    return head;
  }

  // Standard Solution
  private static void removeDuplicatesStandard(Node head) {
    Hashtable<Integer, Boolean> hash = new Hashtable<Integer, Boolean>();

    Node prev = null;

    while (null != head) {
      if (hash.containsKey(head.data)) {
        prev.next = head.next;
      } else {

        hash.put(head.data, true);
        prev = head;
      }
      head = head.next;
    }

  }
  
  // Without Using buffer 
  private static void removeDuplicatesWithoutBuffer(Node head){
    
    int i =0;
    
    while( null != head){
      Node prev = head;
      Node b = head.next;
      
      while( null != b){
        i++;
        if(i>=10){
          break;
        }
        if( b.data == head.data){
          prev.next = head.next;
          System.out.println("If " +"head: " + head.data + " b :"+ b.data);
        }else{
          System.out.println("Else " +"head: " + head.data + " b :"+ b.data);
          prev = b;
        }
        System.out.println("Outside " +"head: " + head.data + " b :"+ b.data);
        
        b = b.next;
      }
      
      head = head.next;
    }
  }

 

}
