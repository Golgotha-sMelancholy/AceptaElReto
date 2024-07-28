import java.util.Scanner;

/**
 *
 * 615 - La Pulga - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucle = sc.nextInt();
        for (int i = 1; i <= bucle; i++) {
            int barraDePotencia = sc.nextInt() + 1;
            int factor = sc.nextInt();
            int teclaMantenida = sc.nextInt();
            System.out.println((teclaMantenida % barraDePotencia) * factor);
        }
    }
}
