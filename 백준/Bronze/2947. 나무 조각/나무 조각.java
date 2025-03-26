import java.util.*;
import java.io.*;

class Main{

    public static void main(String args[])throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] srr = {1, 2, 3, 4, 5};
        
        while(!Arrays.equals(arr, srr)){
            if(arr[0] > arr[1]){
                int a = 0;
                int b = 1;
                swap(a, b, arr);
                show(arr);
            }
            if(arr[1] > arr[2]){
                int a = 1;
                int b = 2;
                swap(a, b, arr);
                show(arr);
            }
            if(arr[2] > arr[3]){
                int a = 2;
                int b = 3;
                swap(a, b, arr);
                show(arr);
            }
            if(arr[3] > arr[4]){
                int a = 3;
                int b = 4;
                swap(a, b, arr);
                show(arr);
            }
        }
        
        
    }
    
    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    private static void show(int[] arr){
        for(int n : arr){
            System.out.print(n+ " ");
        }
        System.out.println();
    }
    
}