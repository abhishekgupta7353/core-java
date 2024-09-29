package Sorting;

public class Selection {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]) {
        int temp, smallest;
        for(int i=0; i<arr.length; i++){
            smallest =i;
            for(int j=i+1; j<arr.length; j++){
               if(arr[smallest]>arr[j]){
                smallest =j;
               }
            }
            temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,2,1};
        selectionSort(arr);
        printArray(arr);
    }
}
