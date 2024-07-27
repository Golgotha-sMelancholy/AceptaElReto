import java.util.Scanner;

/**
 *
 * 217 - ¿Qué Lado de la Calle? - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int registro = sc.nextInt();
        while (registro != 0) {
            if (registro % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
            registro = sc.nextInt();
        }
    }

}
