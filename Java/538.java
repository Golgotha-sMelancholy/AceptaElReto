import java.util.Scanner;

/**
 *
 * 538 - Toesto Era Campo - Iván - https://github.com/wildfireOfMine
 */
public class Main {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abuelo = sc.nextInt();
        int construccion = sc.nextInt();
        while (abuelo != 0 || construccion != 0) {
            if (abuelo >= construccion) {
                System.out.println("CUERDO");
            } else {
                System.out.println("SENIL");
            }
            abuelo = sc.nextInt();
            construccion = sc.nextInt();
        }
    }
}
