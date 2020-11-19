import java.util.Scanner;

public class MainInputMismatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = scan.nextInt();

        System.out.println("Você digitou "+num);

        System.out.println("Fim...");
    }

}
