import java.util.Scanner;

/**
 *
 * 532 - Reduciendo Envases - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int valor = sc.nextInt();
            int valor2 = sc.nextInt();

            System.out.println(valor2 -= valor);
        }

    }
}
