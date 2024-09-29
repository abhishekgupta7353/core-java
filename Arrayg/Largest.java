package Arrayg;

public class Largest {
    public static int getLargest(int arr[], int sizeofarray){
            int largest = arr[0];

            for(int i=0; i<sizeofarray; i++){
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
            return largest;

    }
    public static void main(String[] args) {
        int arr[] = {10,20,25,84,74,48};
        System.out.println(getLargest(arr, 6));
    }
}
