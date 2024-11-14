import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        ArrayList<Integer> listaUser = obtenerLista();

        System.out.println("Su arraylist: "+listaUser);

        System.out.println("El numero mayor es: "+obtenerMaximo(listaUser));
        int numMayor = obtenerMaximo(listaUser);

        System.out.println("El numero menor es: "+obtenerMenor(listaUser));
        int numMenor = obtenerMenor(listaUser);

        int diferenNum = obtenerDiferencia(numMenor, numMayor);
        System.out.println("La diferencia entre "+numMenor+" y "+numMayor+" es: "+diferenNum);


    }




    public static ArrayList<Integer> obtenerLista(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        double numUser;
        System.out.println("Ingrese sus valores (un numero negativo terminara el input)");
        while(true) {
            System.out.print("Valor:");
            numUser = sc.nextDouble();
            if(numUser >= 0 && lista.size() < 20) {
                lista.add((int) numUser);
            }else if(numUser < 0 || lista.size() > 19) {
                lista.add((int) numUser);
                break;
            }
        }
        return lista;
    }

    public static int obtenerMaximo(ArrayList<Integer> lista){
        int maximo = lista.get(0);
        if(lista.isEmpty()){
            System.out.println("Lista vacia?");
        }else{
            for(int i : lista){
                if(i>maximo){
                    maximo = i;
                }
            }
        }
        return maximo;
    }


    public static int obtenerMenor(ArrayList<Integer> lista){
        int menor = lista.get(0);
        if(lista.isEmpty()){
            System.out.println("Lista vacia?");
        }else{
            for(int i : lista){
                if(i<menor){
                    menor = i;
                }
            }
        }
        return menor;
    }

    public static int obtenerDiferencia(int menor, int mayor){
        int diferencia = mayor - menor;
        return diferencia;
    }
}
