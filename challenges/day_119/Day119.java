public class Day119 {

    public static void verificadorDrSenha(String senha) {
        try {
            if (senha == null || senha.isEmpty()) {
                System.out.println("Senha inválida");
                return;
            }

            int comprimento = senha.length();

            switch (comprimento) {
                case 4:
                    System.out.println("Senha fraca");
                    break;
                case 6:
                    System.out.println("Senha média");
                    break;
                case 8:
                    System.out.println("Senha forte");
                    break;
                default:
                    System.out.println("Senha inválida");
                    return;
            }

            boolean temNumero = senha.matches(".*[0-9].*");
            boolean temMinuscula = senha.matches(".*[a-z].*");
            boolean temMaiuscula = senha.matches(".*[A-Z].*");
            boolean temEspecial = senha.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");

            if (!temNumero) {
                System.out.println("A senha deve conter pelo menos um número.");
            }
            if (!temMinuscula) {
                System.out.println("A senha deve conter pelo menos uma letra minúscula.");
            }
            if (!temMaiuscula) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
            }
            if (!temEspecial) {
                System.out.println("A senha deve conter pelo menos um caractere especial.");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        verificadorDrSenha("1234"); 
        verificadorDrSenha("abcdef"); 
        verificadorDrSenha("Abc123!");
    }
}
