import java.util.Scanner;

/**
 *
 * 158 - Los Saltos de Mario - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int i = 1; i <= prueba; i++) {
            int muros = sc.nextInt();
            int arriba = 0;
            int abajo = 0;
            int saltos = 0;
            int anterior = 0;
            for (int j = 1; j <= muros; j++) {
                anterior = saltos;
                saltos = sc.nextInt();

                if (j >= 2 && anterior < saltos) {
                    arriba++;
                } else if (anterior > saltos) {
                    abajo++;
                } else {

                }
            }
            System.out.println(arriba + " " + abajo);
            anterior = 0;
            saltos = 0;
        }
    }

}
