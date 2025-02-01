# Day 61

## Desafio:

Implemente um programa Java que leia uma lista de nomes e os organize em ordem alfabética.

**Resultado:**

```java

import java.util.ArrayList;
import java.util.List;

public class Day061 {

    public static void main(String[] args) {
        Day061 obj = new Day061();
        System.out.println(obj.oordemAlfacabetica("a"));  
        System.out.println(obj.oordemAlfacabetica("cba")); 
        System.out.println(obj.oordemAlfacabetica("bdac")); 
    }

    public String oordemAlfacabetica(String str) {
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
         list.sort(Character::compareTo); 

         return list.toString().replaceAll("[,\\s\\[\\]]", "");
        
    }
}
