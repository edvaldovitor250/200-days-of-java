public class Day128 {
    
    public static void possivielTriangulo(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("É possível formar um triângulo com os lados dados.");
        } else {
            System.out.println("Não é possível formar um triângulo com os lados dados.");
        }
    }
    public static void main(String[] args) {
        possivielTriangulo(3, 4, 5); 
        possivielTriangulo(1, 2, 3); 
}

}
