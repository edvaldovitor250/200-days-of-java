# Day 150

## Desafio:

Crie um programa Java que leia duas listas e imprima os elementos que aparecem em ambas.	

**Resultado:**

```java



import java.util.Map;

public class Day150 {

    public static void main(String[] args) {
        Map<String,String> lista = Map.of(
                "1", "a",
                "2", "b",
                "3", "c",
                "4", "d",
                "5", "e"
        );

        System.out.println("Lista original:");
        listarPrint(lista);

    }

    public static Map<String,String> listarPrint(Map<String,String>lista) {

        for (Map.Entry<String,String> entry : lista.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        return lista;
    }
}
