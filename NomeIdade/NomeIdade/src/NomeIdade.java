import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite seu nome: ");

        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome + " sua idade é: " + idade);

    }
}
