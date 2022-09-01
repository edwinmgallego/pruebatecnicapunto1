import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner opcionesDeOrdenamiento = new Scanner(System.in);

        Scanner entradaDeDatos = new Scanner(System.in);
        int[] miArreglo = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            miArreglo[i] = entradaDeDatos.nextInt();
            System.out.println(miArreglo[i]);
        }



        System.out.println("digite  que  forma  quiere  ordenar");
        System.out.println("1. menor a mayor");
        System.out.println("2. mayor a menor");
        System.out.println("3. salir");
        int opciones = opcionesDeOrdenamiento.nextInt();




        //opciones para   ordenar
        switch (opciones){
            case 1 :
                menorAMayor(miArreglo);
                break;

            case 2:
                mayorAmenor(miArreglo);
                break;

            case 0:
                break;
        }


        }

       public static void menorAMayor(int[] ArregloVector){
           for (int i = 0; i < ArregloVector.length; i++) {
               for (int j = 0; j < ArregloVector.length; j++) {
                   if (ArregloVector[i] < ArregloVector[j]) {
                       int temp = ArregloVector[i];
                       ArregloVector[i] = ArregloVector[j];
                       ArregloVector[j] = temp;
                   }
               }
           }
           System.out.println("\ndespues de arreglado...");
           for (int i : ArregloVector) {
               System.out.print(i+" ");
           }
        }
        public static void mayorAmenor(int[] ArregloVector2){
            for (int i = 0; i < ArregloVector2.length; i++) {
                for (int j = 0; j < ArregloVector2.length; j++) {
                    if (ArregloVector2[i] > ArregloVector2[j]) {
                        int temp = ArregloVector2[i];
                        ArregloVector2[i] = ArregloVector2[j];
                        ArregloVector2[j] = temp;
                    }
                }
            }
            System.out.println("\ndespues de arreglado...");
            for (int i : ArregloVector2) {
                System.out.print(i+" ");
            }

        }



}
