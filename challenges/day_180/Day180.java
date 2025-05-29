
public class Day180 {


    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        determineMatrizSimetrica(matriz);
    }


public static void determineMatrizSimetrica(int[][] matriz) {
    int linhas = matriz.length;
    int colunas = matriz[0].length;
    
    if (linhas != colunas) {
        System.out.println("A matriz não é simétrica porque não é quadrada.");
        return;
    }
    
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            if (matriz[i][j] != matriz[j][i]) {
                System.out.println("A matriz não é simétrica.");
                return;
            }
        }
    }
    
    System.out.println("A matriz é simétrica.");

}
}