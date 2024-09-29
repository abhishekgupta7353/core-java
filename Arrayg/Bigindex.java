package Arrayg;

public class Bigindex {
   public static int getBig(int arr[]){
        int res =0 ;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,52,54, 87,54};
        System.out.println(getBig(arr));
    }
}
