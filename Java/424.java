import java.util.Scanner;

/**
 *
 * 424 - Ahorro Infantil - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        while (prueba != 0) {
            int gasto = 0;
            int mayor = 0;
            for (int i = 1; i <= prueba; i++) {
                int ahorro = sc.nextInt();
                gasto += ahorro;
                if (mayor < gasto) {
                    mayor = gasto;
                }
            }
            System.out.println(gasto + " " + mayor);
            prueba = sc.nextInt();
        }
    }

}
