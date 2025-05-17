# Day 169

## Desafio:

Implemente um programa Java que leia um texto e verifique se ele é uma tautologia.	

**Resultado:**

```java


public class Day169 {

    public static void main(String[] args) {
        verificadorTautologia("V V V F V V V F V V V F V V V F V V V F");
        verificadorTautologia("Teste");
    }


    public static void verificadorTautologia(String proposicao) {
        String[] proposicoes = proposicao.split(" ");
        boolean resultado = true;

        for (String p : proposicoes) {
            if (p.equals("F")) {
                resultado = false;
                break;
            }
        }

        if (resultado) {
            System.out.println("A proposição é uma tautologia.");
        } else {
            System.out.println("A proposição não é uma tautologia.");
        }
    }

}
