import java.util.Scanner;

/**
 *
 * 663 - Contando Desde el Cero - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int ano = sc.nextInt();
            if (ano > 0) {
                ano--;
            }
            System.out.println(ano);
        }
    }
}
