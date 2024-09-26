import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * 536 - Huerto Ecológico - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int casos = sc.nextInt();
            Terreno mejorTerreno = null;
            for (int i = 0; i < casos; i++) {
                int tamano = sc.nextInt();
                int abono = sc.nextInt();
                int agua = sc.nextInt();
                int distanciaCasa = sc.nextInt();
                String nombre = sc.nextLine();
                Terreno terreno = new Terreno(tamano, abono, agua, distanciaCasa, nombre);
                if (i == 0) {
                    mejorTerreno = terreno;
                } else if (new Comparador().compare(terreno, mejorTerreno) == -1) {
                    mejorTerreno = terreno;
                }
            }
            System.out.println(mejorTerreno.getNombreEmpresa().substring(1));
        }
    }

}

class Terreno {

    private int tamano;
    private int abono;
    private int agua;
    private int distanciaCasa;
    private String nombreEmpresa;

    public Terreno(int tamano, int abono, int agua, int distanciaCasa, String nombreEmpresa) {
        this.tamano = tamano;
        this.abono = abono;
        this.agua = agua;
        this.distanciaCasa = distanciaCasa;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTamano() {
        return this.tamano;
    }

    public int getAbono() {
        return this.abono;
    }

    public int getAgua() {
        return this.agua;
    }

    public int getDistanciaCasa() {
        return this.distanciaCasa;
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

}

class Comparador implements Comparator<Terreno> {

    @Override
    public int compare(Terreno o1, Terreno o2) {
        Integer t1 = o1.getTamano();
        Integer a1 = o1.getAgua();
        Integer d1 = o1.getDistanciaCasa();
        Integer ab1 = o1.getAbono();
        Integer t2 = o2.getTamano();
        Integer a2 = o2.getAgua();
        Integer d2 = o2.getDistanciaCasa();
        Integer ab2 = o2.getAbono();

        int numero = t1.compareTo(t2);
        if (numero == 0) {
            numero = a1.compareTo(a2);
            if (numero == 0) {
                numero = d1.compareTo(d2);
                if (numero == 0) {
                    numero = ab1.compareTo(ab2);
                }
            }
        } else if (numero == 1) {
            numero = -1;
        } else {
            numero = 1;
        }
        return numero;
    }

}
