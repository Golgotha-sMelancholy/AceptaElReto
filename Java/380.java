import java.util.Scanner;

/**
 *
 * 380 - ¡Me Caso! - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gastos = sc.nextInt();
        while (gastos != 0) {
          int gastoFinal = 0;
            for (int i = 1; i <= gastos; i++) {
                int precio = sc.nextInt();
                gastoFinal += precio;
            }
            System.out.println(gastoFinal);
            gastos = sc.nextInt();
        }
    }

}
