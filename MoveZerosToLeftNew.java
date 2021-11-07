public class MoveZerosToLeftNew {
  public static void main(String[] args) {
    int[] arr = { 8, 2, 0, 1, 3, 0, 5, 0 };
    int j = arr.length - 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] != 0 && arr[j] == 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] != 0) {
        j--;
      }
    }
    for (int i : arr) {
      System.out.println(i);
    }
  }
}
