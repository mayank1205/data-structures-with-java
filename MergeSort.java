public class MergeSort {

  public int[] merge(int[] arr, int l, int mid, int r) {
    int i = l;
    int j = mid + 1;
    int k = l;
    int[] b = new int[arr.length];
    while (i <= mid && j <= r) {
      if (arr[i] < arr[j]) {
        b[k] = arr[i];
        i++;
      } else {
        b[k] = arr[j];
        j++;
      }
      k++;
    }
    if (i > mid) {
      while (j <= r) {
        b[k] = arr[j];
        j++;
        k++;
      }
    } else {
      while (i <= mid) {
        b[k] = arr[i];
        i++;
        k++;
      }
    }
    for (k = l; k <= r; k++) {
      arr[k] = b[k];
    }
    return arr;
  }

  public int[] sort(int[] arr, int l, int h) {
    int[] result = new int[arr.length];
    if (l < h) {
      int mid = (l + h) / 2;
      sort(arr, l, mid);
      sort(arr, mid + 1, h);
      result = merge(arr, l, mid, h);
    }
    return result;
  }

  public void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = { 23, 21, 12, 3, 6, 1, 34, 67, 85, 22 };
    MergeSort ms = new MergeSort();
    ms.print(ms.sort(arr, 0, arr.length - 1));
  }
}
