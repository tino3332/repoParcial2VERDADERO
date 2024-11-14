import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class parcial {
    public static void main(String[] args) {
        //valores del array con el user
        ArrayList<Integer> valoresUser = obtenerMatriz();
        int fila = valoresUser.get(0);
        int columna = valoresUser.get(1);

        //rellenando el array con el user y random
        int [][] matrizUser = rellenoMatrizUlt(fila,columna);

        // mostrando array
        mostrarArray(matrizUser);


    }

    public static ArrayList<Integer> obtenerMatriz() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> matriz = new ArrayList<>();
        int fila;
        int columna;
        System.out.println("Ingrese fila y columna con numeros impares entre 3 y 15.");
        while (true) {
            System.out.print("fila: ");
            fila = sc.nextInt();
            if (fila / 2 != 0 && fila >= 3 && fila <= 15) {
                matriz.add(fila);
                break;
            } else {
                System.out.println("Numero no valido.");
            }
        }
        while (true) {
            System.out.print("columna: ");
            columna = sc.nextInt();
            if (columna / 2 != 0 && columna >= 3 && columna <= 15) {
                matriz.add(columna);
                break;
            } else {
                System.out.println("Numero no valido.");
            }
        }
        return matriz;
    }

    public static int [][] rellenoMatrizUlt(int fila, int columna) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[fila][columna];
        System.out.println("rellene la ultima fila del array con numeros entre el 10 y el 99");
        int num = 0;
        //llenando con user
        for(int i=0;i <= (columna -1);i++){
            while(true){
            System.out.print("Ingrese el valor de la posicion "+(i+1)+":");
            num = sc.nextInt();
                if (num != 0 && num >= 10 && num <= 99) {
                    matriz[fila-1][i] = num;
                    break;
                }else{
                    System.out.println("Numero no valido, intente nuevamente porfavor.");
                }
            }
        }
        //llenando con random
        for(int i=0;i < fila-1;i++){
            for(int j=0;j <= columna-1;j++){
                matriz[i][j] = (int) (Math.random() * 99) + 10;
            }
        }
        return matriz;
    }

    public static void mostrarArray(int [][] matriz){
        System.out.println("Su precioso array:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }
    }

    public static int [][] obtenerValoresCentrales(int [][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int [][] matrizNueva;

        int filaCentro = filas /2;
        int columnaCentro = columnas /2;

        int centro = matriz[filaCentro][columnaCentro];




     return ;
    }
}
