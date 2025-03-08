
public class Day099 {

    public static void main(String[] args) {
        
        int[][] matrizDupla = new int[5][5];

        for (int i = 0; i < matrizDupla.length; i++) {
            for (int j = 0; j < matrizDupla[i].length; j++) {
                matrizDupla[i][j] = i + j;
            }
        }
        for (int[] linha : matrizDupla) {
            System.out.print(linha[0] + " ");

            for (int j = 1; j < linha.length; j++) {
                System.out.print(linha[j] + " ");
            }

            System.out.println();
        }
    }
}
