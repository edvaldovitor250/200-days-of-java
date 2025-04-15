# Day 137

## Desafio:

Escreva um programa Java que leia um array e verifique se é um array monotônico.	

**Resultado:**

```java
import java.util.Arrays;

public class Day137 {

    public static void main(String[] args) {
        Day137 day137 = new Day137();
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(day137.isMonotonico(a)); 
        int[] b = {5, 4, 3, 2, 1};
        System.out.println(day137.isMonotonico(b));
        int[] c = {1, 2, 3, 2, 1};
        System.out.println(day137.isMonotonico(c)); 
    }

    public boolean isMonotonico(int []a){
        if (a.length <= 2) return true;
        boolean increasing = false, decreasing = false;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                increasing = true;
            } else if (a[i] < a[i - 1]) {
                decreasing = true;
            }
            if (increasing && decreasing) return false;
        }
        return true;
    }

}
