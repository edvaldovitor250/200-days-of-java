# Day 88

## Desafio:

Implemente um programa Java que leia uma string e imprima todas as suas permutações.

**Resultado:**

```java
public class Day088 {

    public static void main(String[] args) {
        contagemPermutacoes("aabb");
        contagemPermutacoes("aaaabbbb");
        contagemPermutacoes("aabbcc");
    }

    public static void contagemPermutacoes(String texto) {
        int[] contagem = new int[26];
        for (int i = 0; i < texto.length(); i++) {
            contagem[texto.charAt(i) - 'a']++;
        }

        int total = 1;
        for (int i = 0; i < 26; i++) {
            total *= fatorial(contagem[i]);
        }

        System.out.println(fatorial(texto.length()) / total);
    }
    
    private static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

}

