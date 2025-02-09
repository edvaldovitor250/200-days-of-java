public class Day070 {

    public static void main(String[] args) {
        numeroPerfeito(6);
        numeroPerfeito(28);
        numeroPerfeito(496);
        numeroPerfeito(8128);
        numeroPerfeito(33550336);
        numeroPerfeito(33550337);
    }

    static void numeroPerfeito(int n){
        int soma = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                soma += i;
            }
        }
        if(soma == n){
            System.out.println("O número " + n + " é perfeito.");
        }else{
            System.out.println("O número " + n + " não é perfeito.");
        }
    }

   
}
