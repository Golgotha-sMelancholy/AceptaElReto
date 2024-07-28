import java.util.Scanner;

/**
 *
 * 434 - Romance en el Palomar - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int palomo = sc.nextInt();
            int paloma = sc.nextInt();

            if (palomo > paloma) {
                System.out.println("PRINCIPIO");
            } else {
                System.out.println("ROMANCE");
            }

        }
    }
}
