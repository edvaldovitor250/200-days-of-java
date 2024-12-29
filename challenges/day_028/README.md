# Day 28

## Desafio:

	Implemente um programa Java que use try/catch para abrir um arquivo e ler seu conteúdo.

**Resultado:**

```java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day028 {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\edval\\IdeaProjects\\200-days-of-Java\\challenges\\day_028\\arquivo.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

