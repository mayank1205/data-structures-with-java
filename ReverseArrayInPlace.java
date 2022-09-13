public class ReverseArrayInPlace {

    public static int[] reverseArray(int[] input) {
        for(int i =0; i<input.length ; i++){
            if(i < input.length - 1 - i){
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
            }
        }
        return input;
    }

    private static void printArray(int[] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,4,7,5,2,3,5,11,1,45,6,7,23,4,234,3,1};
        int[] rev = reverseArray(arr);
        printArray(rev);
    }
}
