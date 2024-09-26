import java.util.Scanner;

/**
 *
 * 166 - Zapping - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();
        int pinchazo = sc.nextInt();
        while (posicion != 0 && pinchazo != 0) {
            if ((posicion - pinchazo - 99) % 99 < (pinchazo - posicion - 99) % 99) {
                System.out.println(Math.abs((pinchazo - posicion - 99) % 99));
            } else if ((posicion - pinchazo - 99) % 99 > (pinchazo - posicion - 99) % 99) {
                System.out.println(Math.abs((posicion - pinchazo - 99) % 99));
            } else {
                System.out.println("0");
            }
            posicion = sc.nextInt();
            pinchazo = sc.nextInt();
        }
    }
}
