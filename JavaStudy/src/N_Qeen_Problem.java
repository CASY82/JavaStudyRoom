
import java.util.Scanner;

public class N_Qeen_Problem  {
   static int result = 0;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[] chess = new int[n];
      boolean[] locate = new boolean[n];
      
      ChessBackTrack(0, n, chess, locate);
      System.out.println(result);

   }
   
   public static void ChessBackTrack(int x, int n, int[] chess, boolean[] locate) {
      if(x == n) {
         result++;
      }
      else {
         for(int i = 0; i<n; i++) {
            if(locate[i]) {
               continue;
            } 
            
            chess[x] = i;
            
            if(check(x, chess)) {
               locate[i] = true;
               ChessBackTrack(x+1, n, chess, locate);
               locate[i] = false;
            }
         }
      }
   }
   
   public static boolean check(int x, int[] chess) {
      for(int j = 0; j<x; j++) {
         if(chess[x] == chess[j] || (Math.abs(chess[x] - chess[j]) == (x - j))) {
            return false;
         }
      }
      return true;
   }

}

