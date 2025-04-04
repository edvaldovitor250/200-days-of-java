
public class Day126 {

    public static void main(String[] args) {
        String texto[] = {"aabbcc", "dddeee", "ffggg"};
        removendoLetrasRepitidas(texto);
    }

    public static void removendoLetrasRepitidas(String texto[]){
        StringBuilder resultado = new StringBuilder();
        for (String tt : texto) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < tt.length(); i++) {
                char c = tt.charAt(i);
                if (temp.indexOf(String.valueOf(c)) == -1) {
                    temp.append(c);
                }
            }
            resultado.append(temp).append(" ");
            System.out.println(resultado.toString().trim());
            
        }

    }

}   