import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> userList = new ArrayList<>();
        System.out.println("Rellene su arrayList de 10 numeros:");
        for(int i=0;i<10;i++){
            System.out.print("Numero "+(i+1)+": ");
            userList.add(sc.nextInt());
        }
        System.out.println("Su array: "+userList);

        ArrayList<Integer> userListAsc = ordenarAsc(userList);
        System.out.println("Su array en forma ascendente: "+userListAsc);

        ArrayList<Integer> userListDesc = ordenarDesc(userList);
        System.out.println("Su array en forma descendente: "+userListDesc);
    }

    public static ArrayList<Integer> ordenarAsc(ArrayList<Integer> lista){
        Collections.sort(lista);
        return lista;
    }

    public static ArrayList<Integer> ordenarDesc(ArrayList<Integer> lista){
        Collections.sort(lista, Collections.reverseOrder());
        return lista;
    }
}
