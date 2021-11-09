public class MergeSortedArrays {
  public int[] merge(int[] arr1, int[] arr2, int n, int m) {
    int[] result = new int[n + m];
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        result[k] = arr1[i];
        i++;
      } else {
        result[k] = arr2[j];
        j++;
      }
      k++;
    }
    while (i < n) {
      result[k] = arr1[i];
      i++;
      k++;
    }
    while (j < m) {
      result[k] = arr2[j];
      j++;
      k++;
    }
    return result;
  }

  public void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int[] a1 = { 2, 6, 8, 21, 23, 34, 40, 55 };
    int[] a2 = { 3, 6, 9, 21, 25, 38, 42, 50 };
    MergeSortedArrays msa = new MergeSortedArrays();
    int[] result = msa.merge(a1, a2, a1.length, a2.length);
    msa.print(result);
  }
}
