# Day 64

## Desafio:

Implemente um programa Java que leia um texto e conte o número de caracteres alfabéticos, dígitos e espaços.

**Resultado:**

```java


public class Day064 {

    public static void main(String[] args) {
        contadorDeLetras("Hola mundo vida");
    
    }

    public static void contadorDeLetras(String text) {
        int[] count = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }
    }

}
