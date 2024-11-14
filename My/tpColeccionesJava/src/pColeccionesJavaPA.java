import java.util.*;

public class pColeccionesJavaPA {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        Scanner sc = new Scanner(System.in);
        while(true){
            //menu principal
            System.out.println("********** MENU AGENDA **********");
            System.out.println("1- Cargar datos en la agenda");
            System.out.println("2- Buscar Telefono por nombre");
            System.out.println("3- Listar agenda");
            System.out.println("4- Salir");
            System.out.print("Que desea hacer: ");
            int userMenu = sc.nextInt();
            sc.nextLine();


            if(userMenu == 1){
                agenda = cargaAgenda();
            }else if(userMenu == 2){
                System.out.print("Para buscar una persona porfavor ingrese el nombre: ");
                String buscando = sc.nextLine();
                if(agenda.containsKey(buscando)){
                    System.out.println("***");
                    System.out.println("");
                    System.out.println("Numero de "+ buscando +": "+ agenda.get(buscando));
                    System.out.println("");
                    System.out.println("***");
                    System.out.println("");
                    System.out.println("Volviendo al menu...");
                }else{
                    System.out.println("La persona buscada no se encuentra en la agenda.");
                }
            }else if(userMenu == 3){
                System.out.println("Listando agenda:");
                System.out.println(agenda);
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("Volviendo al menu...");
            }else if(userMenu == 4){
                System.out.println("Saliendo...");
                break;
            }else{
                System.out.println("Opcion no valida, intente nuevamente.");
            }
        }
    }
    public static HashMap cargaAgenda(){
        HashMap agenda = new HashMap();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese el nombre completo de la persona: ");
            String nombreCompleto = sc.nextLine();
            System.out.println("Ingrese el telefono de la persona: ");
            long telefono = sc.nextLong();
            agenda.put(nombreCompleto, telefono);
            sc.nextLine();
            while(true) {
                System.out.println("Desea cargar otra persona? S / N ");
                String opcion = sc.nextLine();
                if(opcion.equalsIgnoreCase("S")) {
                    System.out.println("Volviendo a la carga de personas...");
                    break;
                }else if (opcion.equalsIgnoreCase("N")) {
                    System.out.println("Volviendo al menu...");
                    return agenda;
                }else{
                    System.out.println("Incorrecto, ingrese nuevamente.");
                    break;
                }

            }
        }
    }
}
