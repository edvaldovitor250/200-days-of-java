# Day 139

## Desafio:

Implemente um programa Java que leia uma string e imprima a frequência de cada vogal.	

**Resultado:**

```java
public class Day139 {

    public static void main(String[] args) {
        String text = "aabbccddeeff
gghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        System.out.println("Frequência de vogais:");
        frenquenciaVogal(text);
    }

public static void frenquenciaVogal(String text){
    int[] frequencia = new int[5]; 
    String vogais = "aeiou";
    
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        int index = vogais.indexOf(c);
        if (index != -1) {
            frequencia[index]++;
        }
    }
    
    for (int i = 0; i < frequencia.length; i++) {
        System.out.println(vogais.charAt(i) + ": " + frequencia[i]);
    }
}

}
