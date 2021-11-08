public class BubbleSort {
  public int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean isSwapped = false;
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          isSwapped = true;
        }
      }
      if (!isSwapped)
        break;
    }
    return arr;
  }

  public void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = { 22, 31, 15, 11, 34, 20, 27, 40 };
    BubbleSort bs = new BubbleSort();
    arr = bs.sort(arr);
    bs.print(arr);
  }
}
