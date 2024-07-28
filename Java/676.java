import java.util.Scanner;

/**
 *
 * 676 - Día Mundial Del Piano - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {
  
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pruebas = sc.nextInt();
        for (int i = 1; i<=pruebas; i++) {
            int contadorBisiesto = 0;
        	int contadorNoBisiesto = 0;
            int anoMinimo = sc.nextInt();
            int anoMaximo = sc.nextInt();
            for (int j = anoMinimo; j<=anoMaximo; j++) {
                if (esAnoBisiesto(j)) {
                    contadorBisiesto++;
                } else {
                    contadorNoBisiesto++;
                }
            }
            System.out.println(contadorNoBisiesto + " " + contadorBisiesto);
        }
    }
    
    public static boolean esAnoBisiesto(int ano) {
        return (ano % 4 == 0) && !(ano % 100 == 0) || ((ano % 100 == 0 && ano % 400 == 0));
    }

}
