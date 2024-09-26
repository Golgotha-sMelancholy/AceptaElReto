import java.util.Scanner;

/**
 *
 * 595 - ¿En Qué Volumen? - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int numero = sc.nextInt();
            System.out.println(numero/100);
        }
    }
}
