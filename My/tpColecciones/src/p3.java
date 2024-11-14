import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayListRandom = llenarRandom();
        System.out.println("ArrayList: " + arrayListRandom);

        int sumaRandoms = obtenerSuma(arrayListRandom);
        double promedio = sumaRandoms / arrayListRandom.size();
        System.out.println("La suma de los valores random es de: "+sumaRandoms);
        System.out.println("El promedio de estos es: "+promedio);

        int vecesPromedio = igualesPromedio(promedio, arrayListRandom);
        System.out.println("Cantidad de numeros iguales al promedio: "+vecesPromedio);

        int mayoresPromedio = mayoresPromedio(promedio, arrayListRandom);
        System.out.println("Cantidad de numeros mayores al promedio: "+mayoresPromedio);

        int menoresPromedio = menoresPromedio(promedio, arrayListRandom);
        System.out.println("Cantidad de numeros menores al promedio: "+menoresPromedio);
    }

    public static ArrayList<Integer> llenarRandom(){
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i =0; i<20 ; i++){
            lista.add((int) (Math.random() * 100));
        }
        return lista;
    }

    public static int obtenerSuma(ArrayList<Integer> lista){
        int suma = 0;
        for(int i=0; i<lista.size();i++){
            suma += lista.get(i);
        }
        return suma;
    }

    public static int igualesPromedio(double promedio, ArrayList<Integer> lista){
        int cant = 0;
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i) == promedio){
                cant +=1;
            }
        }
        return cant;
    }

    public static int mayoresPromedio(double promedio, ArrayList<Integer> lista){
        int cant = 0;
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i) > promedio){
                cant +=1;
            }
        }
        return cant;
    }

    public static int menoresPromedio(double promedio, ArrayList<Integer> lista){
        int cant = 0;
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i) < promedio){
                cant +=1;
            }
        }
        return cant;
    }
}
