package Arrayg;


public class SecondLar {
    public static int secondLargest(int arr[], int n){
        int first=-1, second = -1;
        if(n<2){
            System.out.println("invalid");
        }
        for(int i=0; i<n; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            if(arr[i]<first && arr[i]>=second){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int arr[] = {10,25,85,38,45,24};
        System.out.println(secondLargest(arr, 6));
    }
}
