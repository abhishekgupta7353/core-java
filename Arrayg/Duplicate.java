package Arrayg;

public class Duplicate {
    public static int duplicateData(int arr[], int n){
        int res = 1;
        for(int i =1 ; i<n; i++){
        if(arr[res-1]!=arr[i]){
            arr[res] = arr[i];
            res++;
        }
    }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,30};
        int n =6;
        System.out.println("before removal");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n = duplicateData(arr, n);
        System.out.println("after removal");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
