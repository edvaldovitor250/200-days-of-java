
public class Day115 {

    public static void main(String[] args) {
        maiorNumeroCalculo(1, 2, 3, 4, 5);
    }

    public static void maiorNumeroCalculo(int... n){
        int maior = 0;
        for(int i = 0; i < n.length - 1; i++){
            int produto = n[i] * n[i+1];
            if(produto > maior){
                maior = produto;
            }
        }
        System.out.println(maior);
    }


}
