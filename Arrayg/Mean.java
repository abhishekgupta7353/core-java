package Arrayg;

public class Mean {
    public static int addele(int arr[], int sum){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
            count++;
        }
        return sum/count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,19,28,5};
        System.out.println(arr.length+" "+addele(arr, 0));
    }
}
