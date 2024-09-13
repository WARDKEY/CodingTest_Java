import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    Main.solution(input1);

  }
    static void solution(int input1){
        int n = 1;
        for(int i = 0; i < input1; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            n++;
            System.out.println();
        }        
    }
    
}