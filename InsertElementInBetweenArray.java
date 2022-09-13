public class InsertElementInBetweenArray {
    public static int[] insertInBetween(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length+1];
        for(int i = newArr.length - 1; i>=0;i--){
            if(i>index) {
                newArr[i] = arr[i-1];
            } else{
                if(i != index)
                    newArr[i] = arr[i];                
            }
        }
        newArr[index] = value;
        return newArr;
    }

    private static void printArray(int[] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr = insertInBetween(arr, 4, 100);
        printArray(arr);
    }
}
