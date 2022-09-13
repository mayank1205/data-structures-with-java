public class QuickSortImpl {
    public void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(arr[i] <= pivot){
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,low);
        return j;
    }
    public int[] sort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
        return arr;
    }
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { 23, 21, 12, 3, 6, 1, 34, 67, 85, 22 };
        QuickSortImpl qs = new QuickSortImpl();
        qs.print(qs.sort(arr, 0, arr.length - 1));
    }
}
