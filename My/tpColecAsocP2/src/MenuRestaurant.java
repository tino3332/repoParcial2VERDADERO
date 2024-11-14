import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        ArrayList<Plato> platosMenu = new ArrayList<>();
        ArrayList<Ingrediente> ingredientesMenu = new ArrayList<>();

        System.out.println("********** MENU RESTAURANT **********");
        while(true){
            Scanner sc = new Scanner(System.in);

            Plato plato = new Plato();

            System.out.println("----------INGRESO DE PLATO----------");
            System.out.print("NOMBRE DEL PLATO: ");
            plato.setNombreCompleto(sc.nextLine());

            System.out.print("PRECIO DEL PLATO: ");
            plato.setPrecio(sc.nextDouble());
            sc.nextLine();

            System.out.println("ES BEBIDA? S / N");
            String esBeb = sc.nextLine();
            if(esBeb.equalsIgnoreCase("s")){
                plato.setEsBebida(true);
            }else if(esBeb.equalsIgnoreCase("n")){
                plato.setEsBebida(false);
            }


            if(plato.getEsBebida()==true){
                System.out.println("plato terminado");
            }else if(plato.getEsBebida()==false){
                while(true){
                    Ingrediente ingredientes = new Ingrediente();

                    System.out.print("INGRESE INGREDIENTE: ");
                    ingredientes.setNombre(sc.nextLine());

                    System.out.print("INGRESE CANTIDAD: ");
                    ingredientes.setCantidad(sc.nextDouble());
                    sc.nextLine();

                    System.out.print("INGRESE UNIDAD DE MEDIDA: ");
                    ingredientes.setUnidadDeMedida(sc.nextLine());

                    System.out.println("DESEA INGRESAR OTRO INGREDIENTE? S / N");
                    String chisteBueno = sc.nextLine();
                    if(chisteBueno.equalsIgnoreCase("s")){
                        System.out.println("ENTENDIDO.");
                    }else if(chisteBueno.equalsIgnoreCase("n")){
                        System.out.println("ENTENDIDO.");
                        break;
                    }
                    ingredientesMenu.add(ingredientes);
                }
            }
            System.out.println("DESEA INGRESAR OTRO PLATO? S / N");
            String chisteMalo = sc.nextLine();
            if(chisteMalo.equalsIgnoreCase("s")){
                System.out.println("INGRESANDO OTRO PLATO");
            }else if(chisteMalo.equalsIgnoreCase("n")){
                System.out.println("ENTENDIDO.");
                break;
            }
            platosMenu.add(plato);
        }
        for(Plato plato : platosMenu){
            System.out.println(plato.getNombreCompleto());
            System.out.println(plato.getPrecio());
            for(Ingrediente ingrediente : ingredientesMenu){
                System.out.println(ingrediente.getNombre()+", "+ingrediente.getCantidad()+", "+ingrediente.getUnidadDeMedida());
            }
        }
    }
}
