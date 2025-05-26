# Day 177

## Desafio:

Crie um programa Java que leia duas listas de números e imprima a união ordenada entre elas.	

**Resultado:**

```java

import java.util.Map;

public class Day177 {

    public static void main(String[] args) {
        Map<Integer, Integer> list = Map.of(
            3, 30,
            1, 10,
            2, 20
        );
        ordenadaList(list);
        
    }

public static void ordenadaList(Map<Integer,Integer> list){
    if (list == null || list.isEmpty()){
        System.out.println("Lista vazia ou nula");
    } else {
        list.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue()));
    }
}

}