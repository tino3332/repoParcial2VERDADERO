import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz();

        while(true){

        }
    }

    public class Celda{
        int fila;
        int columna;
        String valor;

        public Celda(int fila,int columna,String valor){

        }
    }
    public static class Matriz{
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
        public void agregarCelda(Celda celda){
            matrizCuadrada.add(celda);
        }
    }
}
