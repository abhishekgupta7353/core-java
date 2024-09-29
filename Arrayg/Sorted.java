package Arrayg;

public class Sorted {
    public static boolean sortedArray(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {25,45,78,605, 88};
        System.out.println(sortedArray(arr));
    }
}
