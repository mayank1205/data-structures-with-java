public class MoveZerosToRight {
  public static void main(String[] args) {
    int[] arr = { 8, 2, 0, 1, 3, 0, 5, 0 };
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0 && arr[j] == 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] != 0) {
        j++;
      }
    }
    for (int i : arr) {
      System.out.println(i);
    }

  }
}
