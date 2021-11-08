public class SelectionSort {
  public int[] sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
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
    SelectionSort is = new SelectionSort();
    arr = is.sort(arr);
    is.print(arr);
  }
}
