public class Day006 {
  public static void main(String[] args) {

    int numero = 2;

    if(numero <= 1){
        System.out.println("O número " + numero + " não é primo");
        return;
    }
    else{
        for(int i =2, j = 0; i <= numero; i++){
            if(numero % i == 0){
                j++;
            }
            if(j > 1){
                System.out.println("O número " + numero + " não é primo");
                return;
            } else {
                System.out.println("O número " + numero + " é primo");
                return;
            }
        }
    }
    
}

}
