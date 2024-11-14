import java.util.ArrayList;
import java.util.List;
public class ejemplosArrayArraylist {
    public static void main(String[] args) {

//----------------------------------------------------------------------------------------------------------------------
//      Ejemplo Array de una dimension
// Este se construye de la siguiente manera:
//      {tipo de dato} [] {nombre} = new {mismo tipo de dato} [tamanio]

    String [] cars = new String [3];
    // Este tiene un tamanio de 3 por la tanto: {0,1,2}, esto no se puede modificar luego, una vez puesto 3 queda en 3
    cars[0] = "Mustang";
    cars[0] = "Honda";
    System.out.println(cars[0]);
    // Este printearia Honda porque lo remplaza
        //tambien se pueden hacer de la siguiente manera:
        // String [] cars = {"Mustang","Camaro","Honda"};
        //                       0         1       2
    cars[1] = "Mustang";
    cars[2] = "Lamborghini";

    // de esta forma mostramos todos los items de el Array
    for(int i = 0; i<cars.length;i++){
        System.out.println(cars[i]);
    }


//----------------------------------------------------------------------------------------------------------------------
        //ejemplo Array multidimensional\
    int [][] numbers = new int [3][3]; // Este es igual pero con dos [][] en vez de con uno []
        // EL PRIMERO ES FILA --- Y EL SEGUNDO ES COLUMNA |||
    for(int i=0;;i++){
        for(int j=0;;j++){
          numbers [i][j] = (int)(Math.random() * 50) + 50;   // este math random asigna un numero random entre el 50 y el 100
        }
    }


//----------------------------------------------------------------------------------------------------------------------
        //ejemplo ArrayList comun
        // para poder usar arraylist debemos traer la libreria con: import java.util.ArrayList
      ArrayList<IString> nombre = new ArrayList<>();

    // Usamos .add para agregar algo al arrayList, .get para "seleccionarlo", .set para cambiarlo/modificarlo y .remove
      nombre.add("Agustin");
      nombre.add("Francisco");

        System.out.println(nombre.get(0)); // esto printearia Agustin, no se consigue lo mismo sin el .get



//----------------------------------------------------------------------------------------------------------------------
        //ejemplo ArrayList multidimensional
        // ESTE CONSISTIRIA EN USAR ARRAYLISTS DENTRO DE OTRO ARRAYLIST, ESTO ES MUY SIMPLE
        //SIMPLEMENTE CREAMOS UN ARRAYLIST NORMAL PERO EN VEZ DE TIPO INT O STRING PONEMOS TIPO: <Arraylist<{tipo}>>
        ArrayList<ArrayList<Integer>> nombrePadre = new ArrayList<>();
        // PARA ACCEDER SE VUELVE A USAR .GET, POR EJEMPLO:
        System.out.println(nombrePadre.get(0).get(0));
        // De esta forma traemos al arraylist con los demas dentro, seleccionamos el primer arraylist de todos los que tenga
        //y de ese arraylist seleccionamos el primer "objeto" que tenga.


//----------------------------------------------------------------------------------------------------------------------
      list<Integer> numeros;


    }
}
