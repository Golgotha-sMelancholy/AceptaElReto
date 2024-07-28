import java.util.Scanner;

/**
 *
 * 618 - Buscando el Nivel - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel = sc.nextInt();
        while (nivel != 0) {
            int[] niveles = new int[nivel];
            for (int i = 0; i < niveles.length; i++) {
                niveles[i] = sc.nextInt();
            }
            int casos = sc.nextInt();
            for (int j = 1; j <= casos; j++) {
                int ultimoNivel = sc.nextInt() - 1;
                int nuevoNivel = sc.nextInt() - 1;
                int resultado = 0;
                if (ultimoNivel < nuevoNivel) {
                    for (int i = ultimoNivel + 1; i < nuevoNivel; i++) {
                        resultado += niveles[i];
                    }
                    System.out.println(resultado);
                } else {
                    for (int i = ultimoNivel; i >= nuevoNivel; i--) {
                        resultado += niveles[i];
                    }
                    System.out.println("-" + resultado);
                }
            }
            System.out.println("---");

            nivel = sc.nextInt();
        }

    }
}
