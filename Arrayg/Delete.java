package Arrayg;

public class Delete {
    public static int deleteData(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                break;
            }
            if(i == arr.length){
                return arr.length;
            }
            for(int j=i; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            return(arr.length - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,25,84,45,50};
        System.out.println("before the deletion ");
        for(int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
        }
        System.out.println();
        int n = deleteData(arr, 25);
        System.out.println("after the deletion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
