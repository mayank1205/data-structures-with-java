public class InsertionSortImpl {

    public void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j >=0 && temp< arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,7,8,9,11,56,12,98,6};
        InsertionSortImpl s = new InsertionSortImpl();
        arr = s.sort(arr);
        s.print(arr);
    }
}
