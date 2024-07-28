import java.util.Scanner;

/**
 *
 * 355 - Gregorio XIII - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       	int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int	ano = sc.nextInt();
            if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        }

    }

}
