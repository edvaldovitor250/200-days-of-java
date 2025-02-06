
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Day067 {

    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();
        lista.add(1.0);
        lista.add(2.0);
        lista.add(3.0);
        lista.add(4.0);
        lista.add(5.0);
        desvioPadrao(lista);
    }

    static void desvioPadrao(List<Double> lista) {
        double media = 0;
        double soma = 0;
        double desvioPadrao = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }
        media = soma / lista.size();
        for (int i = 0; i < lista.size(); i++) {
            desvioPadrao += Math.pow(lista.get(i) - media, 2);
        }
        desvioPadrao = Math.sqrt(desvioPadrao / lista.size());
        System.out.println("Desvio padrão: " + desvioPadrao);

    }

}
    

