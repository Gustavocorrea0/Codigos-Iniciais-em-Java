import java.util.Scanner;

public class FizzBuzz {
    static Scanner scanner = new Scanner(System.in);
    static int numero;
    static int numero2;

    public static void main(String[] args) {
        System.out.println("Bem vindo ao FizzBuzz");
        System.out.println("Todo número divisivel por 3 se torna Fizz e Todo número divisivel por 5 se torna Buzz.");
        System.out.print("Informe o menor número: ");
        numero = scanner.nextInt();
        System.out.print("Informe o maior número: ");
        numero2 = scanner.nextInt();
        if (numero < numero2) {
            System.out.println("---------------------------------FizzBuzz-------------------------------------");

            testarNumero();
        } else {
            System.out.println("Forma Incorreta");
        }
    }

    private static void testarNumero(){
        while (numero != numero2 + 1){
            if ((numero % 3) == 0 && (numero % 5) == 0) {
                System.out.println("FizzBuzz");
            } else if ((numero % 3) == 0) {
                System.out.println("Fizz");
            } else if ((numero % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
