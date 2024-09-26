import java.util.Scanner;

/**
 *
 * 472 - Caminando Voy - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = 0; 
        int DesnivelMaximo = 0; 
        int cotas = 0; 
        int cotaAnterior = 0; 
        int cotaActual = 0; 
        int Desnivel = 0; 
        int DesnivelSuma = 0; 
        int DesnivelAlcanzado = 0; 

        while (sc.hasNext()) {
            DesnivelMaximo = sc.nextInt();
            cotas = sc.nextInt();
            for (int j = 1; j <= cotas; j++) {
                cotaAnterior = cotaActual;
                cotaActual = sc.nextInt();

                if (cotaActual > cotaAnterior && j > 1) {
                    Desnivel = (cotaActual - cotaAnterior);
                    DesnivelSuma += Desnivel;
                } else {
                    DesnivelSuma = 0;
                }

                if (DesnivelSuma > DesnivelAlcanzado) {
                    DesnivelAlcanzado = DesnivelSuma;
                }
            }

            if (DesnivelMaximo >= DesnivelAlcanzado) {
                System.out.println("APTA");
            } else {
                System.out.println("NO APTA");
            }
            cotaAnterior = 0;
            cotaActual = 0;
            Desnivel = 0;
            DesnivelAlcanzado = 0;
        }
    }

}
