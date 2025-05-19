
public class Day171 {

    public static void main(String[] args) {
        maiorNumero(20);
    }

    public static void maiorNumero(int n){
        int maior = 0;
        int i = 0;
        
        while(i < n){
            int num = (int) (Math.random() * 100);
            if(num > maior){
                maior = num;
            }
            i++;
        }
        System.out.println("O maior número gerado foi: " + maior);
    }

}
