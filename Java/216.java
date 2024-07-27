import java.util.Scanner;

/**
 *
 * 216 - Goteras - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba = sc.nextInt();
        for (int rapido = 0; rapido < prueba; rapido++) {
            String tiempo = sc.next();
            System.out.println(pasarDeSegundosATiempo(tiempo));
        }

    }

    public static String pasarDeSegundosATiempo(String tiempo) {
        String resultado = "";
        int segundos = Integer.parseInt(tiempo);
        int minutos = 0;
        int hora = 0;
        for (int i = 1; i <= segundos; i++) {
            if (i % 60 == 0) {
                minutos++;
                if (minutos % 60 == 0) {
                    minutos = 0;
                    hora++;
                }
            }
        }
        segundos %= 60;
        resultado = String.format("%02d:%02d:%02d", hora, minutos, segundos);
        return resultado;
    }
}
