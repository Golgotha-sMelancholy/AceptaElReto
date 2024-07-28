import java.util.Scanner;

/**
 *
 * 467 - Polisílaba es Polisílaba - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bucle = sc.nextInt();
        for (int i = 1; i <= bucle; i++) {
            String nombre = sc.next();
            String es = sc.next();
            String nombre2 = sc.next();
            if (nombre.toLowerCase().equals(nombre2.toLowerCase())) {
                System.out.println("TAUTOLOGIA");
            } else {
                System.out.println("NO TAUTOLOGIA");
            }

        }
    }

}
