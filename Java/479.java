import java.util.Scanner;

/**
 *
 * 479 - El Hombre Sin Miedo y Sin Radar - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        while (filas != 0 || columnas != 0) {
            char[][] matriz = new char[filas][columnas];
            for (int fila = 0; fila < matriz.length; fila++) {
                String cadena = sc.next();
                for (int columna = 0; columna < matriz[0].length; columna++) {
                    matriz[fila][columna] = cadena.charAt(columna);
                }
            }
            int casosAEvaluar = sc.nextInt();
            for (int i = 0; i < casosAEvaluar; i++) {
                int filaLocalizada = sc.nextInt() - 1;
                int columnaLocalizada = sc.nextInt() - 1;
                String direccion = sc.next().toUpperCase();
                boolean encontrado = false;
                int contador = 0;
                if (direccion.equals("ARRIBA")) {
                    int j = filaLocalizada;
                    while (!encontrado && j >= 0) {
                        if (matriz[j][columnaLocalizada] == 'X') {
                            encontrado = true;
                        } else {
                            contador++;
                        }
                        j--;
                    }
                } else if (direccion.equals("ABAJO")) {
                    int j = filaLocalizada;
                    while (!encontrado && j < matriz.length) {
                        if (matriz[j][columnaLocalizada] == 'X') {
                            encontrado = true;
                        } else {
                            contador++;
                        }
                        j++;
                    }
                } else if (direccion.equals("DERECHA")) {
                    int j = columnaLocalizada;
                    while (!encontrado && j < matriz[0].length) {
                        if (matriz[filaLocalizada][j] == 'X') {
                            encontrado = true;
                        } else {
                            contador++;
                        }
                        j++;
                    }
                } else if (direccion.equals("IZQUIERDA")) {
                    int j = columnaLocalizada;
                    while (!encontrado && j >= 0) {
                        if (matriz[filaLocalizada][j] == 'X') {
                            encontrado = true;
                        } else {
                            contador++;
                        }
                        j--;
                    }
                }
                if (encontrado) {
                    System.out.println(contador);
                } else {
                    System.out.println("NINGUNO");
                }
            }
            System.out.println("---");
            filas = sc.nextInt();
            columnas = sc.nextInt();
        }
    }
}
