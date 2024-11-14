import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer> listaUser = obtenerLista();
        System.out.println("Su ArrayList: " + listaUser);
    }

    public static ArrayList<Integer> obtenerLista() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Creando su ArrayList (cualquier numero negativo terminara el input)");
        while(true){
            System.out.print("ingrese un valor:");
            int numUser = sc.nextInt();
            if(numUser >= 0){
                lista.add(numUser);
            }else{
                lista.add(numUser);
                break;
            }
        }
        return lista;
    }
}
