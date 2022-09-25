import java.util.Scanner;

public class TwoFer {
    static Scanner scanner = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {
        System.out.print("Informe Seu nome: ");
        nome = scanner.nextLine();
        System.out.println(teste());
    }

    private static String teste() {
        String op1;
        if (nome == null || nome.isBlank()) {
            op1 = ("Um para Você, Um para mim");
        } else {
            op1 = ("Um para " + nome + ", Um para mim");
        }
        return op1;
    }
}
