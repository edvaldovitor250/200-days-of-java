# Day 152

## Desafio:

Escreva um programa Java que leia uma lista de números e verifique se há uma subsequência crescente de tamanho K.	

**Resultado:**

```java

public class Day152 {

    public static void main(String[] args) {
        String str = "Hola Mundo";
        letrasMasculas(str);
    }

    public static void letrasMasculas(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }


}