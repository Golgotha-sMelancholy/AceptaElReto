import java.util.Scanner;

/**
 *
 * 471 - Buscando el Pinchazo - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int posicion = sc.nextInt();
            int pinchazo = sc.nextInt();

            int distancia = (posicion - pinchazo - 360) % 360;
            int equidad = (pinchazo - posicion - 360) % 360;

            if (distancia < equidad) {
                System.out.println("DESCENDENTE");
            } else if (distancia > equidad) {
                System.out.println("ASCENDENTE");
            } else {
                System.out.println("DA IGUAL");
            }

        }
    }
}
