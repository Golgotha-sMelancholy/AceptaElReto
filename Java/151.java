import java.util.Scanner;

/**
 *
 * 151 - ¿Es Matriz Identidad? - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int[][] matriz = new int[casos][casos];
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[0].length; columna++) {
                    matriz[fila][columna] = sc.nextInt();
                }
            }

            if (identidad(matriz)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            casos = sc.nextInt();
        }
    }

    public static boolean identidad(int[][] matriz) {
        boolean identico = true;
        int fila = 0;
        int columna = 0;
        while (identico && fila < matriz.length) {
            while (identico && columna < matriz[0].length) {
                if (fila == columna && matriz[fila][columna] != 1) {
                    identico = false;
                } else if (fila != columna && matriz[fila][columna] != 0) {
                    identico = false;
                }
                columna++;
            }
            columna = 0;
            fila++;
        }
        return identico;
    }
}
