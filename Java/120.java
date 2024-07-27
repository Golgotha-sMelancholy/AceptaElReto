import java.util.Scanner;

/**
 *
 * 116 - Hola Mundo - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimensiones = sc.nextInt();
        int primerNumero = sc.nextInt();
        while (dimensiones != 0 || primerNumero != 0) {
            int[][] cuadradoMagico = construirCuadradoMagico(dimensiones, primerNumero);
            System.out.println(obtenerConstanteMagica(cuadradoMagico));
            dimensiones = sc.nextInt();
            primerNumero = sc.nextInt();
        }
    }

    public static int[][] construirCuadradoMagico(int dimension, int primerNumero) {
        int[][] cuadradoMagico = new int[dimension][dimension];
        int recorrido = primerNumero;
        int filaPosicion = 0;
        int columnaPosicion = dimension / 2;
        if (dimension == 1) {
            cuadradoMagico[0][0] = primerNumero;
        } else {
            int recorridoSuperficial = 1;
            while (recorridoSuperficial <= dimension * dimension) {
                if (primerNumero == recorrido) {
                    cuadradoMagico[filaPosicion][columnaPosicion] = recorrido;
                } else {
                    filaPosicion--;
                    if (filaPosicion < 0) {
                        filaPosicion += dimension;
                    }
                    columnaPosicion++;
                    if (columnaPosicion >= dimension) {
                        columnaPosicion -= dimension;
                    }
                    if (cuadradoMagico[filaPosicion][columnaPosicion] == 0
                            && !(filaPosicion == 0 && columnaPosicion == dimension / 2)) {
                        cuadradoMagico[filaPosicion][columnaPosicion] = recorrido;
                    } else {
                        filaPosicion += 2;
                        if (filaPosicion >= dimension) {
                            filaPosicion -= dimension;
                        }
                        columnaPosicion--;
                        if (columnaPosicion < 0) {
                            columnaPosicion += dimension;
                        }
                        cuadradoMagico[filaPosicion][columnaPosicion] = recorrido;
                    }
                }
                recorridoSuperficial++;
                recorrido++;
            }
        }

        return cuadradoMagico;
    }

    public static int obtenerConstanteMagica(int[][] matrizCuadrada) {
        int sumaDiagonalPrincipal = 0;
        int diagonal = 0;
        while (diagonal < matrizCuadrada.length) {
            sumaDiagonalPrincipal += matrizCuadrada[diagonal][diagonal];
            diagonal++;
        }
        return sumaDiagonalPrincipal;
    }
}
