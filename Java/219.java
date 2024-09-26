import java.util.Scanner;

/**
 *
 * 219 - La Lotería de la Peña Atlética - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i<=casos; i++) {
            int numeros = sc.nextInt();
            int puntuaje = 0;
            for (int j = 1; j<=numeros; j++) {
                int numerito = sc.nextInt();
                if (numerito % 2 == 0) {
                    puntuaje++;
                }
            }
            System.out.println(puntuaje);
        }
    }

}
