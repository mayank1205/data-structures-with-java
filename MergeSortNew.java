public class MergeSortNew {
    
    public static int[] merge(int[] arr, int l, int mid, int r){
        int i = l, j = mid+1, k = l;
        int[] merged = new int[arr.length];
        // System.out.println("n "+ n);
        // System.out.println("m "+ m);
            
        while(i <= mid && j <= r) {

            if(arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while(j<=r){
                merged[k] = arr[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid) {
                merged[k] = arr[i];
                i++;
                k++;
            }
        }
        for (k = l; k <= r; k++) {
            arr[k] = merged[k];
          }
        return merged;
    }

    public static int[] sort(int[] arr, int l, int h){
        int[] result = new int[arr.length];
        if(l < h){
            int mid = (l + h) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            result = merge(arr, l, mid, h);
        }
        return result;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(" "+i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,6,7,9,10};
        int[] sorted = sort(arr, 0, arr.length -1);
        print(sorted);
    }
}
