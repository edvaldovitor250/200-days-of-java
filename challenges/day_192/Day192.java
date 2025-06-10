
public class Day192 {

        public static void main(String[] args) {
        String texto = "Hoje é um dia lindo!";
        formatacaoEmLetrasAlternativas(texto);
    }

    public static void formatacaoEmLetrasAlternativas(String texto) {
        StringBuilder resultado = new StringBuilder();
        boolean alternar = true;

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (alternar) {
                    resultado.append(Character.toUpperCase(c));
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
                alternar = !alternar;
            } else {
                resultado.append(c);
            }
        }

        System.out.println(resultado.toString());
    }

}