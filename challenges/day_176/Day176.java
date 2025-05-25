
public class Day176 {

    public static void main(String[] args) {
        
        int numero = 10;
        possivelCriarUmQuadrado(numero);
    }

public static void possivelCriarUmQuadrado(int numero){
   double raiz = Math.sqrt(numero);
    if (raiz % 1 == 0) {
         System.out.println("É possível criar um quadrado com o número " + numero);
    } else {
         System.out.println("Não é possível criar um quadrado com o número " + numero);
    }
}

}