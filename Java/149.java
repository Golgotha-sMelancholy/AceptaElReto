
import java.util.Scanner;

/**
 *
 * 149 - San Fermines - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = 0;
        while (sc.hasNext()) {
            int velocidad = 0;
            prueba = sc.nextInt();
            for (int i = 0; i < prueba; i++) {
                int toro = sc.nextInt();
                if (i == 0) {
                    velocidad = toro;
                } else if (toro > velocidad) {
                    velocidad = toro;
                }
            }
            System.out.println(velocidad);
        }
        sc.close();
    }

}
