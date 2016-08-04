package Trees;

public class Node<T> {
  protected T data;
  protected Node<T> left, right;

  public Node(T data, Node<T> left, Node<T> right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public Node(T data) {
    this(data, null, null);
  }

}
