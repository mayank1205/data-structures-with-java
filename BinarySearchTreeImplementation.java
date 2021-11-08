import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTree {
  private TreeNode root;

  private class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(int data) {
      this.data = data;
    }
  }

  public TreeNode getRoot() {
    return root;
  }

  public void levelOrderIterativeTraversal() {
    System.out.println(root == null);
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode temp = queue.poll();
      System.out.println(temp.data + " ");
      if (temp.left != null) {
        queue.offer(temp.left);
      }
      if (temp.right != null) {
        queue.offer(temp.right);
      }
    }
  }

  public void inOrderRecursiveTraversal() {
    inOrderRecursiveTraversal(root);
  }

  public void inOrderRecursiveTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderRecursiveTraversal(root.left);
    System.out.println(root.data + " ");
    inOrderRecursiveTraversal(root.right);
  }

  public void insert(int value) {
    root = insert(root, value);
  }

  public TreeNode insert(TreeNode root, int value) {
    if (root == null) {
      root = new TreeNode(value);
      return root;
    }
    if (value < root.data) {
      root.left = insert(root.left, value);
    } else {
      root.right = insert(root.right, value);
    }
    return root;
  }

  public TreeNode search(TreeNode root, int key) {
    if (root == null || root.data == key) {
      if (root != null) {
        System.out.println("tree contains " + root.data);
      } else {
        System.out.println("tree doesn't contain " + key);
      }
      return root;
    }
    if (key < root.data) {
      return search(root.left, key);
    } else {
      return search(root.right, key);
    }
  }
}

public class BinarySearchTreeImplementation {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(1);
    tree.insert(5);
    tree.insert(10);
    tree.insert(3);
    tree.insert(40);
    tree.insert(33);
    tree.insert(20);
    tree.insert(14);
    // tree.levelOrderIterativeTraversal();
    // tree.inOrderRecursiveTraversal();
    tree.search(tree.getRoot(), 20);
  }
}
