package Trees;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeExample {
  
  public static void main(String args[]){
    
    TreeSet<Integer> tree = new TreeSet<Integer>();
    tree.add(12);
    tree.add(63);
    tree.add(34);
    tree.add(45); 
    
    Iterator<Integer> iterator = tree.iterator();
    while(iterator.hasNext()){
      System.out.println( iterator.next() + " ");
    }
    
  } 

}
