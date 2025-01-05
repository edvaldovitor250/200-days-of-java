public class Day035 {

    public static void main(String[] args) {
        printNamesInReverseOrder("João", "Maria", "José", "Pedro", "Ana", "Carlos");
    }

    static void printNamesInReverseOrder(String... names) {
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}

