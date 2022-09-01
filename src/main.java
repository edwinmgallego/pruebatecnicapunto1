import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entradaDeDatos = new Scanner(System.in);
        int[] miArreglo = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            miArreglo[i] = entradaDeDatos.nextInt();
            System.out.println(miArreglo[i]);
        }

        }

}
