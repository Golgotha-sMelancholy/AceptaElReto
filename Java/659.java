import java.util.Scanner;

/**
 *
 * 659 - Números Jeroglíficos - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        while (numero > 0) {
            String jeroglifico = "";
            while (numero >= 1000000) {
                jeroglifico += 'H';
                numero -= 1000000;
            }
            while (numero >= 100000) {
                jeroglifico += 'R';
                numero -= 100000;
            }
            while (numero >= 10000) {
                jeroglifico += 'D';
                numero -= 10000;
            }
            while (numero >= 1000) {
                jeroglifico += 'F';
                numero -= 1000;
            }
            while (numero >= 100) {
                jeroglifico += 'C';
                numero -= 100;
            }
            while (numero >= 10) {
                jeroglifico += 'G';
                numero -= 10;
            }
            while (numero >= 1) {
                jeroglifico += 'T';
                numero -= 1;
            }
            System.out.println(jeroglifico);
            numero = sc.nextInt();
        }

    }

}
