import java.util.HashSet;
import java.util.Set;

public class ArraySumProblem {

  public static boolean findSum(int sum, int[] arr) {
    Set<Integer> valSet = new HashSet<>();
    for (int val : arr) {
      if (valSet.contains(Math.abs(val - sum))) {
        return true;
      } else {
        valSet.add(val);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 5, 3, 6, 1, 8 };
    System.out.println(findSum(10, arr));
  }
}
