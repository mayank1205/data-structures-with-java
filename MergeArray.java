public class MergeArray{
    
    public static int[] mergeArrays(int[] arr1, int[] arr2, int n, int m){
        int[] arr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("i "+ i);
            System.out.println("j "+ j);
            System.out.println("k "+ k);

            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            System.out.println("array 3 "+arr[k]);
            k++;
            
        }
        while(i < n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] arr1 = {3,5,7,9,11};
        int[] arr2 = {2,4,6,8,10};
        int[] mergedArray = mergeArrays(arr1, arr2, arr1.length, arr2.length);
        for (int i : mergedArray) {
            System.out.print(" "+ i);
        }
    }
}