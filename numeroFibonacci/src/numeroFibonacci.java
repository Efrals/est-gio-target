import java.util.Scanner;

public class numeroFibonacci {

    public static void main(String[] args) {
        // Criação do scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando um número ao usuário
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Verificando se o número informado está na sequência de Fibonacci
        if (fibonacci(numero))
        {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " Não pertence à sequência de Fibonacci.");
        }
    }

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean fibonacci(int numeroInserido) {
        if (numeroInserido < 0) return false;
        
        int a = 0, b = 1;
        while (a < numeroInserido) {
            int temporario = a;
            a = b;
            b = temporario + b;
        }
        return a == numeroInserido;
    }

}