import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTree {
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

  public void preOrderRecursiveTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.println(root.data + " ");
    preOrderRecursiveTraversal(root.left);
    preOrderRecursiveTraversal(root.right);
  }

  public void preOrderIterativeTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode temp = stack.pop();
      System.out.println(temp.data + " ");
      if (temp.right != null) {
        stack.push(temp.right);
      }
      if (temp.left != null) {
        stack.push(temp.left);
      }
    }
  }

  public void levelOrderIterativeTraversal(TreeNode root) {
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

  public void postOrderRecursiveTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    postOrderRecursiveTraversal(root.left);
    postOrderRecursiveTraversal(root.right);
    System.out.println(root.data + " ");
  }

  public void postOrderIterativeTraversal(TreeNode root) {
    TreeNode current = root;
    Stack<TreeNode> stack = new Stack<>();
    while (current != null || !stack.isEmpty()) {
      if (current != null) {
        stack.push(current);
        current = current.left;
      } else {
        TreeNode temp = stack.peek().right;
        if (temp == null) {
          temp = stack.pop();
          System.out.println(temp.data + " ");
          while (!stack.isEmpty() && temp == stack.peek().right) {
            temp = stack.pop();
            System.out.println(temp.data + " ");
          }
        } else {
          current = temp;
        }
      }
    }
  }

  public void inOrderRecursiveTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderRecursiveTraversal(root.left);
    System.out.println(root.data + " ");
    inOrderRecursiveTraversal(root.right);
  }

  public void inOrderIterativeTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = root;
    while (!stack.isEmpty() || temp != null) {
      if (temp != null) {
        stack.push(temp);
        temp = temp.left;
      } else {
        temp = stack.pop();
        System.out.println(temp.data + " ");
        temp = temp.right;
      }
    }
  }

  public int findMax(TreeNode root) {
    if (root == null) {
      return Integer.MIN_VALUE;
    }
    int result = root.data;
    int left = findMax(root.left);
    int right = findMax(root.right);
    if (left > result) {
      result = left;
    }
    if (right > result) {
      result = right;
    }
    return result;
  }

  public void createBinaryTree() {
    TreeNode first = new TreeNode(1);
    TreeNode second = new TreeNode(2);
    TreeNode third = new TreeNode(3);
    TreeNode fourth = new TreeNode(4);
    TreeNode fifth = new TreeNode(5);
    root = first;
    first.left = second;
    first.right = third;
    second.left = fourth;
    second.right = fifth;
  }
}

public class BinaryTreeTraversals {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.createBinaryTree();
    System.out.println("this is pre order ");
    tree.preOrderRecursiveTraversal(tree.getRoot());
    System.out.println("this is pre order iterative ");
    tree.preOrderIterativeTraversal(tree.getRoot());
    System.out.println("this is post order ");
    tree.postOrderRecursiveTraversal(tree.getRoot());
    System.out.println("this is post order iterative ");
    tree.postOrderIterativeTraversal(tree.getRoot());
    System.out.println("this is in order ");
    tree.inOrderRecursiveTraversal(tree.getRoot());
    System.out.println("this is in order iterative ");
    tree.inOrderIterativeTraversal(tree.getRoot());
    System.out.println("this is level order ");
    tree.levelOrderIterativeTraversal(tree.getRoot());
    System.out.println("this is the max value ");
    System.out.println(tree.findMax(tree.getRoot()));
  }
}
