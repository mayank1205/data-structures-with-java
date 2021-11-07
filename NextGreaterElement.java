import java.util.Stack;

public class NextGreaterElement {

  public static int[] findNextGreaterElement(int[] arr, int length) {
    int[] result = new int[length];
    Stack<Integer> stack = new Stack<>();
    for (int i = length - 1; i >= 0; i--) {
      if (!stack.isEmpty()) {
        while (!stack.isEmpty() && stack.peek() <= arr[i]) {
          stack.pop();
        }
      }
      if (stack.isEmpty()) {
        result[i] = -1;
      } else {
        result[i] = stack.peek();
      }
      stack.push(arr[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 7, 3, 4, 8, 1 };
    int[] result = findNextGreaterElement(arr, arr.length);
    for (int i : result) {
      System.out.println(i);
    }
  }
}
