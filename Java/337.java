import java.util.Scanner;

/**
 * 337 - La Abuela María - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int[][] mandibula = new int[2][6];
            for (int fila = 0; fila < mandibula.length; fila++) {
                for (int columna = 0; columna < mandibula[0].length; columna++) {
                    mandibula[fila][columna] = sc.nextInt();
                }
            }

            boolean simetria = true;
            int j = 0;
            int configuracion = mandibula[0][j] + mandibula[1][j];
            j++;
            while (simetria && j < mandibula[0].length) {
                if (mandibula[0][j] + mandibula[1][j] != configuracion) {
                    simetria = false;
                }
                j++;
            }
            if (simetria) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

}
