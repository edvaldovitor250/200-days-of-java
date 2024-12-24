import java.util.ArrayList;

public class Day023 {

  public static void main(String[] args) {
    int[] n =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int menor = Integer.MIN_VALUE;
    int indiceMenor = -1;

    for (int i = 0; i < n.length; i++) {
      if (n[i] > menor) {
        menor = n[i];
        indiceMenor = i;

      }
      System.err.println("Menor: " + menor);
        
    }
  }
  }
 
  

