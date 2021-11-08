public class BinarySearch {

  public int search(int key, int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (high + low) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (key < arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 10, 11, 14, 20, 32, 50 };
    BinarySearch bs = new BinarySearch();
    System.out.println("found at index: " + bs.search(21, arr));
  }
}
