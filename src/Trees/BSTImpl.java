package Trees;

public class BSTImpl {
  
  public static void main(String apples []){
    //Integer [] a = {1,5,2,7,4};
    Integer [] a = {50,40,51,30,45,25,31,41,46,25,15,26};
    BST<Integer> bst = new BST<Integer>();
    bst = new BST<Integer>(new MyCompl());
    
    for(Integer n : a){
      bst.insert(n);
    }
    
    bst.preOrderTraversal();
    System.out.println("Height of the Tree "+ bst.height());
    System.out.println("Leaves in the Tree "+ bst.countLeaves());
    System.out.println("Size of the Tree "+ bst.sizeOfTree());
    System.out.println("Min Value in the Tree "+ bst.minValue());
    
    
 
    /**
     * Check if Two trees are identical. Code works fine
     */
  /*  BST<Integer> bst2 = new BST<Integer>();
    bst2 = new BST<Integer>(new MyCompl());
    
    Integer [] b = {52,40,51,30,45,25,31,41,46,25,15,26};
    
    for(Integer n : b){
      bst2.insert(n);
    }
    
    if(bst.isIdentical(bst.root, bst2.root)){
      System.out.println("Trees are Identical ");
    }else{
      System.out.println("Trees are Non-Identical ");
    }
    */
   
    
  }

}
