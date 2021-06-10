/**
 * Importamos clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Arreglos para almacenar las temperaturas ingresadas por el usuarioç
         * Y para poder realizar la sumatorias correspondientes
         */
        int[] temperatura1 = new int[1000];
        int[] temperatura2 = new int[1000];;
        int[]temperaturaAuxiliar1 = new int[1000];;
        int[] temperaturaAuxiliar2 = new int[1000];;

        /**
         * Variables para poder desarrollar la logica del sistema
         */
        int contadorTemperatura1=0, contadorTemperatura2=0;
        int contadorTemperaturaAux1=0, contadorTemperaturaAux2=0;
        int sumaTemperatura1=0, sumaTemperatura2=0;
        int sumatoriaTotal=0;
        int promedioTemperaturas=0;
        boolean salir = false;

        /**
         * Ciclo do while para que el usuario ingrese temperaturas hasta que la primera sea cero
         */
        do{
            /**
             * Almacenamos las temperaturas ingresada por el usuario en dos arreglos de tipo entero
             */
            System.out.println("Ingrese la primera temperatura");
            temperatura1[contadorTemperatura1] = scanner.nextInt();
            if (temperatura1[contadorTemperatura1]==0) {
                salir = true;
            }
            else if(temperatura1[contadorTemperatura1]!=0){
                salir = false;
            }
            contadorTemperatura1 += 1;
            System.out.println("Ingrese la segunda temperatura");
            temperatura2[contadorTemperatura2] = scanner.nextInt();
            contadorTemperatura2 += 1;
        }while(salir == false);

        /**
         * Ciclo de iteracion para poder almacenar temperaturas entre el rango de 5 y 15 grados
         */
        for(int i=0; i<contadorTemperatura1; i++){
            if (temperatura1[i]>5 && temperatura1[i]<=15) {
                temperaturaAuxiliar1[i] = temperatura1[i];
                contadorTemperaturaAux1 += 1;
            }
        }
        for(int i=0; i<contadorTemperatura2; i++){
            if (temperatura2[i]>5 && temperatura2[i]<=15) {
                temperaturaAuxiliar2[i] = temperatura2[i];
                contadorTemperaturaAux2 += 1;
            }
        }
        /**
         * Ciclo de iteracion para poder realizar la sumatoria de las temperaturas entre 5 y 15 grados
         */
        for(int i=0; i<contadorTemperaturaAux1; i++){
            sumaTemperatura1 += temperaturaAuxiliar1[i];
        }
        for(int i=0; i<contadorTemperaturaAux2; i++){
            sumaTemperatura2 += temperaturaAuxiliar2[i];
        }

        /**
         * Calculo de la sumatoria total y el promedio de temperaturas en el rango de 5 y 15 grados
         */
        sumatoriaTotal = sumaTemperatura1+sumaTemperatura2;
        promedioTemperaturas = sumatoriaTotal/(contadorTemperatura1+contadorTemperatura2);

        /**
         * Condicional para imprimir el promedio en caso que se hayan encontrado temperaturas dentro del rango
         */
        if(contadorTemperatura1==0 && contadorTemperatura2==0 || promedioTemperaturas==0){
            System.out.println("No se promedidaron temperaturas en el rango de 5 y 15 grados");
        }
        else{
            System.out.println("El promedio de temperaturas entre 5 y 15 grados es: "+promedioTemperaturas);
        }
    }
}
