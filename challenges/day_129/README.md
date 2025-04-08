# Day 129

## Desafio:

Crie um programa Java que leia uma lista de palavras e imprima as palavras que têm todas as vogais.	

**Resultado:**

```java

public class Day129 {

public static void main(String[] args) {
    String str = "Hello World!";
    todasAsVogais(str);
}
    
public static void todasAsVogais(String str){
    String vogais ="aeiouAEIOU";
    StringBuilder vogaisEncontradas = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (vogais.indexOf(c) != -1) {
            vogaisEncontradas.append(c);
        }
    }
    if (vogaisEncontradas.length() == 0) {
        System.out.println("Nenhuma vogal encontrada.");
    } else {
        System.out.println("Vogais encontradas: " + vogaisEncontradas.toString());
    }
}

}
