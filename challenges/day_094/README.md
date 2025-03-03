# Day 94

## Desafio:

Implemente um programa Java que leia um número e converta para sua representação binária, octal e hexadecimal.

**Resultado:**

```java


public class Day094 {

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Binary: ");
        binaria(n);
        System.out.println();
        System.out.print("Octal: ");
        octal(n);
        System.out.println();
        System.out.print("Hexadecimal: ");
        hexadecimal(n);
    }

    public static void binaria(int n){
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void octal (int n){
        int[] octalNum = new int[1000];
        int i = 0;
        while (n > 0) {
            octalNum[i] = n % 8;
            n = n / 8;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }

    public static void hexadecimal(int n){
        char[] hexaDeciNum = new char[100];
        int i = 0;
        while (n != 0) {
            int temp = 0;
            temp = n % 16;
            if (temp < 10) {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }
            n = n / 16;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(hexaDeciNum[j]);
    }


}

