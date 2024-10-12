import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr);

    }

    private static void solution(int[] arr){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    for(int a : arr){
                        System.out.print(a +" ");
                    }
                    System.out.println();
                }
            }
            
        }
    }
 
}