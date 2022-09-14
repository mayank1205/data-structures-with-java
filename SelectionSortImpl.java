public class SelectionSortImpl {

    public void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i+' ');
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sort(int[] arr) {
        for(int i =0;i< arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
        return arr;
    }
    public static void main(String[] args) {
      int[] arr = {4,2,5,1,7,8,9,11,56,12,98,6};
        SelectionSort s = new SelectionSort();
        arr = s.sort(arr);
        s.print(arr);
    }
}
