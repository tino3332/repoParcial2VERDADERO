import java.util.Scanner;
public class GeneraPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] componentesPc = {{"AAA", "Placa Madre", "20000", "S"},
                {"BBB", "Procesador", "25000", "S"},
                {"CCC", "Memoria RAM", "5000", "S"},
                {"DDD", "Placa de Red", "3000", "N"},
                {"EEE", "Disco Rigido SSD", "22000", "S"},
                {"FFF", " Placa de Video", "42000", "N"},
                {"GGG", "Monitor Led 21", "32000", "N"},
                {"HHH", "Monitor Led 25", "41000", "N"},
                {"JJJ", "Kit Teclado - Mouse", "9000", "N"},
                {"KKK", "Gabinete", "6500", "S"},
                {"LLL", "Fuente  Alimentación", "6500", "S"},
                {"MMM", "Placa de Sonido", "16500", "N"}};

        System.out.println("Porfavor ingrese los siguientes valores");

        String marcaUser;
        System.out.print("Marca: ");
        marcaUser = sc.nextLine();

        String modeloUser;
        System.out.print("Modelo: ");
        modeloUser = sc.nextLine();
        System.out.println(modeloUser);

        long codigoBarraUser = pidoCodBarras();
        int numCompUser = pidoCantComp();
        Computadora compu = new Computadora(marcaUser, modeloUser, codigoBarraUser);

        String [][] computadora = compu.crearComponentes(numCompUser);
    }

    public static long pidoCodBarras(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            long codigoBarrasUser;
            System.out.print("Codigo de barrras: ");
            codigoBarrasUser = sc.nextLong();
            if(comprobadorCodBarra(codigoBarrasUser) == true) {
                return codigoBarrasUser;
            }else{
                System.out.println("El codigo de barrra no existe, porfavor intente nuevamente");
            }
        }
    }

    public static int pidoCantComp(){
        while(true) {
            Scanner sc = new Scanner(System.in);
            int numCompUser;
            System.out.print("Indique la cantidad de componentes que tendra la computadora (min. 5 y max. 12): ");
            numCompUser = sc.nextInt();
            if(comprobadorCantComp(numCompUser)== true){
                return numCompUser;
            }else{
                System.out.println("Cantidad incorrecta, intente nuevamente.");
            }
        }
    }

    public static boolean comprobadorCodBarra(long codigoBarra){
        boolean estado;
        String numerosBarra;
        int longitud;
        numerosBarra = Long.toString(codigoBarra);
        longitud = numerosBarra.length();

        if(longitud >= 7 && longitud <= 15){
            estado = true;
        }else{
            estado = false;
        }
        return estado;
    }

    public static boolean comprobadorCantComp(int cantidad){
        boolean estado;
        if(cantidad >= 5 && cantidad <= 12){
            estado = true;
        }else{
            estado = false;
        }
        return estado;
    }
}
