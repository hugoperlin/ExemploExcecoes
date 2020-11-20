import java.util.InputMismatchException;
import java.util.Scanner;

public class MainInputMismatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Digite um número inteiro:");
            int num = scan.nextInt();

            System.out.println("Você digitou "+num);

        }catch (InputMismatchException e){
            System.out.println("Voce digitou um valor inesperado...");
            e.printStackTrace();
        }

        System.out.println("Fim...");
    }

}
