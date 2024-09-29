package Arrayg;

public class Insert {
    public static void insertatmid(int arr[],int pos,int n, int x, int cap){
        if(n == cap){
            return ;
        }
        int index = pos-1;

        for(int i=n-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = x;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        int n = 3;
        arr[0] = 14;
        arr[1] = 57;
        arr[2] = 24;
        insertatmid(arr, 3, 3, 85, 5);
    }
}
