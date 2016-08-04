package Trees;

import java.util.Comparator;

public class BST<T> {

  protected Node<T> root;
  private Comparator<T> comparator;

  public BST() {
    root = null;
    comparator = null;
  }

  public BST(Comparator<T> comp) {
    root = null;
    comparator = comp;
  }

  private int compare(T x, T y) {
    if (comparator == null)
      return 0;

    else
      return comparator.compare(x, y);
  }

  /**
   * To Insert Data into BST
   * 
   * @param data
   */

  public void insert(T data) {
    root = insert(root, data);
  }

  /**
   * Utility method to Insert Data
   * 
   * @param p
   * @param toInsert
   * @return
   */

  private Node<T> insert(Node<T> p, T toInsert) {

    if (null == p) {
      return new Node<T>(toInsert);
    }
    if (compare(toInsert, p.data) == 0) {
      return p;
    }

    if (compare(toInsert, p.data) > 0) {
      p.left = insert(p.left, toInsert);
    } else if (compare(toInsert, p.data) < 0) {
      p.right = insert(p.right, toInsert);
    }

    return p;

  }

  public void preOrderTraversal() {
    preOrderHelper(root);
  }

  private void preOrderHelper(Node<T> p) {

    if (null != p) {
      System.out.println(p.data);
      preOrderHelper(p.left);
      preOrderHelper(p.right);
    }

  }

  public void inOrderTraversal() {
    inOrderHelper(root);
  }

  private void inOrderHelper(Node<T> p) {
    if (null != p) {
      inOrderHelper(p.left);
      System.out.println(p.data);
      inOrderHelper(p.right);
    }
  }

  public void postOrderTraversal() {
    postOrderHelper(root);
  }

  /**
   * Remember it as LRPost
   */
  private void postOrderHelper(Node<T> p) {
    if (null != p) {
      inOrderHelper(p.left);
      inOrderHelper(p.right);
      System.out.println(p.data);
    }
  }

  public int height() {
    return heightHelper(root);
  }

  /**
   * Helper method to Calculate Height of the Tree.
   * 
   * If the tree has only one element (Only Root), then the height of the tree is 0. If it has zero
   * elements , then its height is -1
   * 
   * @param p
   * @return
   */
  private int heightHelper(Node<T> p) {
    if (null == p) {
      return -1;
    }

    return (Math.max(heightHelper(p.left), heightHelper(p.right)) + 1);
  }

  public int countLeaves() {
    return countLeavesHelper(root);
  }

  private int countLeavesHelper(Node<T> p) {

    if (null == p) {
      return 0;
    } else if (null == p.left && null == p.right) {
      return 1;
    }
    return countLeavesHelper(p.left) + countLeavesHelper(p.right);
  }
  
  public int sizeOfTree(){
    return sizeHelper(root);
  }
  
  private int sizeHelper(Node<T> p){
    if(p == null) return 0;
    return 1 + sizeHelper(p.right) + sizeHelper(p.left);
  }
  
  public Boolean isIdentical(Node<T> a,Node<T> b){
    if(a == null && b == null){
      return true;
    }else if (a != null && b != null){
      return ( (a.data == b.data) && isIdentical(a.left,b.left) && isIdentical(a.right,b.right));
    }else    
    return false;
  }
  
  public T minValue(){
    return minValue(root);
  }
  
  private T minValue(Node<T> p ){
    Node<T> temp = p;
    
    while(p.left != null){
      p = p.left;
    }
    
    return p.data;
  }
  
  
  
  

  /*  public void delete(T toDelete) {
    delete(root, toDelete);
  }

 private Node delete(Node<T> p, T toDelete) {
   if(p == null) return p;
   
   if(compare(toDelete,p.data) > 0){
     return delete(p.left,toDelete);
   }else if(compare(toDelete,p.data) < 0){
     return delete(p.right,toDelete);
   }else{
     if(p.right == null){
       r
     }
   }
   
   return null;
  }*/


}
