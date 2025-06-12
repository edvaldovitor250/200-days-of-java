# Day 194

## Desafio:

Escreva um programa Java que leia um texto e determine se ele é uma pangrama.	

**Resultado:**

```java

public class Day194 {

    public static void main(String[] args) {
        String s = "carro";
        pangrama(s);
    }

    public static boolean pangrama(String s){
        boolean[] alphabet = new boolean[26];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                index = Character.toLowerCase(s.charAt(i)) - 'a';
                alphabet[index] = true;
            }
        }
        for (boolean b : alphabet) {
            if (!b) {
                System.out.println("not pangram");
                return false;
            }
        }
        System.out.println("pangram");
        return true;
    }

   
}