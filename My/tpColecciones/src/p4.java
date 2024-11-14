import java.util.ArrayList;
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        ArrayList<Integer> listRandoms =obtener50Random();
        System.out.println("ARRAY RANDOM, COMENTAR SI NO QUIERO VERLO: "+listRandoms);


        buscador(listRandoms);
    }

    public static ArrayList<Integer> obtener50Random() {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i =0;i <50;i++){
            lista.add((int) (Math.random() * 100));
        }
        return lista;
    }

    public static void buscador(ArrayList<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero a buscar: ");
        int numUser = sc.nextInt();
        for (int i=0;i<lista.size();i++){
            if(numUser == lista.get(i)){
                System.out.print("Valor encontrado en la posicion "+(i+1));
                return;
            }
        }
        System.out.print("Se llego al final del arreglo y no se encontro el numero indicado.");
    }
}