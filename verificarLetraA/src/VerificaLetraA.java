import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        // Criação do scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Variável para contar o número de ocorrências da letra 'a' ou 'A'
        int contador = 0;

        // Iteração sobre cada caractere da string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Verifica se o caractere é 'a' ou 'A'
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        // Exibe o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' ou 'A' não foi encontrada.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
