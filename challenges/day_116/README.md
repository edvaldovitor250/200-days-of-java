# Day 116

## Desafio:

Escreva um programa Java que leia uma string e imprima apenas os caracteres que não se repetem.	

**Resultado:**

```java


public class Day116{

    public static void main(String[] args){
        String str = "geeksforgeeks";
        caracteresNaoRepetidos(str);
    }


    public static void caracteresNaoRepetidos(String str){
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++){
            if (count[str.charAt(i)] == 1){
                System.out.print(str.charAt(i));
            }
        }
    }

}
