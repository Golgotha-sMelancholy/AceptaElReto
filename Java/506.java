import java.util.Scanner;

/**
 *
 * 506 - Tensión Descompensada - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int valor = sc.nextInt();
            char division = sc.next().charAt(0);
            int valor2 = sc.nextInt();

            if (valor >= valor2) {
                System.out.println("BIEN");
            } else {
                System.out.println("MAL");
            }
        }

    }
}
