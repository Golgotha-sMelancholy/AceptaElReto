import java.util.Scanner;

/**
 *
 * 363 - Las Calorías - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int restador = sc.nextInt();
        while (restador > 0) {
            int contador = 0;
            int casos = sc.nextInt();
            int suma = 0;
            for (int i = 0; i < casos; i++) {
                suma += sc.nextInt();
            }
            while (suma > 0) {
                suma -= restador;
                contador++;
            }
            System.out.println(contador);
            restador = sc.nextInt();
        }
    }

}
