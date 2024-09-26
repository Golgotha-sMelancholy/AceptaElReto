import java.util.Scanner;

/**
 *
 * 605 - Ordenando el Armario - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char armario = sc.next().charAt(0);
        while (armario != '.') {
            int invierno = 0;
            int verano = 0;
            int entretiempo = 0;
            while (armario != ('.')) {
                if (armario == 'V') {
                    verano++;
                } else if (armario == 'I') {
                    invierno++;
                } else if (armario == 'A') {
                    entretiempo++;
                }
                armario = sc.next().charAt(0);
            }
            if (verano > invierno) {
                System.out.println("VERANO");
            } else if (verano < invierno) {
                System.out.println("INVIERNO");
            } else {
                System.out.println("EMPATE");
            }

            armario = sc.next().charAt(0);
        }
    }

}
