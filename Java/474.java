import java.util.Scanner;

/**
 *
 * 474 - Tu Amigable Vecino - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucle = sc.nextInt();
        for (int i = 1; i <= bucle; i++) {
            int spiderman = sc.nextInt();
            int bomba1 = sc.nextInt();
            int bomba2 = sc.nextInt();

            if (Math.abs(spiderman - bomba1) + Math.abs(bomba1 - bomba2)
                    <= Math.abs(spiderman - bomba2) + Math.abs(bomba2 - bomba1)) {
                System.out.println(Math.abs(spiderman - bomba1) + Math.abs(bomba1 - bomba2));
            } else {
                System.out.println(Math.abs(spiderman - bomba2) + Math.abs(bomba2 - bomba1));
            }
        }
    }
}
