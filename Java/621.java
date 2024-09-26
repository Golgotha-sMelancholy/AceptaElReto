import java.util.Scanner;

/**
 *
 * 621 - La Otra Página - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int pagina = sc.nextInt();
            if (pagina % 2 == 0) {
                pagina++;
            } else {
                pagina--;
            }
            System.out.println(pagina);
        }
    }
}
