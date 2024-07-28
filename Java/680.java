import java.util.Scanner;

/**
 *
 * 680 - La Carrera del Salmón - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int contador = 1;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (z >= y && y < x) {
                System.out.println("IMPOSIBLE");
            } else {
                int suma = 0;
                while (suma+y < x) {
                    suma += (y - z);
                    contador++;
                }
                System.out.println(contador);
            }

        }
    }

}
