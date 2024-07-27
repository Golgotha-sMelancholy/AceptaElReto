import java.util.Scanner;

/**
 *
 * 117 - La Fiesta Aburrida - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucle = 0;

        bucle = sc.nextInt();
        for (int i = 1; i <= bucle; i++) {
            
            String soy = sc.next();
            String nombre = sc.next();
            System.out.println("Hola, " + nombre + ".");
        }

    }

}
