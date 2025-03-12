# Day 103

## Desafio:

Escreva um programa Java que leia uma lista de palavras e organize em ordem alfabética reversa.

**Resultado:**

```java
import java.util.ArrayList;
import java.util.List;

public class Day103 {

    public static void main(String[] args) {
        List<String> n = new ArrayList<>();
        n.add("Hola");
        n.add("Mundo");
        n.add("Java");
        n.add("Programacion");
        n.add("Facil");
        organize(n);
        for (String string : n) {
            System.out.println(string);
        }
    }

    public static void organize(List<String> n){

        for (int i = 0; i < n.size(); i++) {
            for (int j = i + 1; j < n.size(); j++) {
                if (n.get(i).length() > n.get(j).length()) {
                    String temp = n.get(i);
                    n.set(i, n.get(j));
                    n.set(j, temp);
                }
            }
        }
        
    }
}
