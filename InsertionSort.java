public class InsertionSort {
  public int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int temp = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
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
    InsertionSort is = new InsertionSort();
    arr = is.sort(arr);
    is.print(arr);
  }
}
