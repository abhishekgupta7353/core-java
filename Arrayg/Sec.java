package Arrayg;

import java.util.ArrayList;

public class Sec {
    public static ArrayList<Integer> firstAndSecond(int arr[], int n){
        ArrayList<Integer> al = new ArrayList<Integer>();

        int first =-1, second = -1;

        for(int i=0; i<n; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            if(arr[i]<first && arr[i]>=second){
                second = arr[i];
            }
        }
        al.add(first);
        al.add(second);
        return al;
    }
    public static void main(String[] args) {
        int arr[] = {20,35,85,68,47,21,};
        System.out.println(firstAndSecond(arr, 6));
    }
}
