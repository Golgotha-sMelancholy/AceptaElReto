import java.util.Scanner;

/**
 *
 * 608 - Peligro por Hielo - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        while (cantidad != 0) {
            int alarma = 0;
            boolean distancia = false;
            for (int i = 1; i <= cantidad; i++) {
                int grados = sc.nextInt();
                if (grados <= 4 && !distancia) {
                    alarma++;
                    distancia = true;
                } else if (grados > 6) {
                    distancia = false;
                }
            }
            System.out.println(alarma);
            alarma = 0;
            distancia = false;
            cantidad = sc.nextInt();
        }
    }
}
