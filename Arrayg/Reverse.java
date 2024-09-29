package Arrayg;

public class Reverse {
    public static void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
         System.out.println("before reverse");
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
        reverseArray(arr, 0, 4);
        System.out.println("after reverse");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
