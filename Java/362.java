import java.util.Scanner;

/**
 *
 * 362 - El Día de Navidad - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fechas = sc.nextInt();
        for (int i = 1; i<=fechas; i++) {
           int dia = sc.nextInt();
            int mes = sc.nextInt();
            
            if (dia == 25 && mes == 12) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
        }
        }
        
        
    }

}
