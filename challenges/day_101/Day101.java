
public class Day101 {

    public static void main(String[] args) {
        String[] lista = {"banana", "abacaxi", "manga", "uva", "laranja", "melancia", "pera", "maçã", "pêssego", "kiwi"};
        organizarListaEmOrdemAlfabetica(lista);
        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }
    
    public static void organizarListaEmOrdemAlfabetica(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].compareTo(lista[j]) > 0) {
                    String temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
    }
}
