# Day 156

## Desafio:

Crie um programa Java que leia um texto e conte o número de sentenças, palavras e caracteres.	

**Resultado:**

```java

public class Day156 {
public static void main(String[] args) {
    String texto = "Olá! Como você está? Espero que esteja bem.";
    contadorDeTexto(texto);
}


public static void contadorDeTexto(String texto){
    int numeroDeSentencas = 0;
    int numeroDePalavras = 0;
    int numeroDeCaracteres = 0;

    String[] sentencas = texto.split("[.!?]");
    numeroDeSentencas = sentencas.length;

    for (String sentenca : sentencas) {
        String[] palavras = sentenca.trim().split("\\s+");
        numeroDePalavras += palavras.length;
        numeroDeCaracteres += sentenca.length();
    }

    System.out.println("Número de sentenças: " + numeroDeSentencas);
    System.out.println("Número de palavras: " + numeroDePalavras);
    System.out.println("Número de caracteres: " + numeroDeCaracteres);
}


}