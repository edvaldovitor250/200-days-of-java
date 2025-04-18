# Day 140

## Desafio:

Escreva um programa Java que leia um número e imprima se ele é um número armstrong.	

**Resultado:**

```java

public class Day140 {

    public static void main(String[] args) {
        System.out.println("Fibonacci Series:");
        fibonacci(10); 

        System.out.println("\nPrime Numbers:");
        primeNumbers(50); 

        System.out.println("\nArmstrong Number Check:");
        numeroArmstrong(153);
    }



    public static void numeroArmstrong(int n){
        int num = n, sum = 0, digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        num = n;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
