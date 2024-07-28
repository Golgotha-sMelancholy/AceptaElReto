import java.util.Scanner;

/**
 *
 * 710 - Plazas Disponibles en un Mundial - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int equipos = sc.nextInt();
            int europa = sc.nextInt();
            int asia = sc.nextInt();
            int africa = sc.nextInt();
            int norteAmerica = sc.nextInt();
            int surAmerica = sc.nextInt();
            int oceania = sc.nextInt();
            System.out.println(equipos - europa - asia - africa - norteAmerica - surAmerica - oceania);
        }
    }
}
