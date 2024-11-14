import java.util.*;
public class MenuRestaurant {
    public static void main(String[] args) {
        ArrayList<Plato> platos = new ArrayList<Plato>();
        while(true){
            Scanner sc = new Scanner(System.in);
            while(true){
                Plato plato = new Plato();
                System.out.println("CARGA DE PLATOS");
                System.out.print("Ingrese el nombre del plato: ");
                plato.setNombreCompleto(sc.nextLine());
                System.out.print("Ingrese el precio del plato: ");
                plato.setPrecio(sc.nextDouble());
                sc.nextLine();
                Ingrediente ingredientes = new Ingrediente();
                System.out.println("Es una bebida? S / N ");
                String estado = sc.nextLine();
                if(estado.equalsIgnoreCase("s")){
                    plato.setEsBebida(true);
                }else if(estado.equalsIgnoreCase("n")){
                    while(true) {
                        System.out.print("Nombre del ingrediente: ");
                        ingredientes.setNombre(sc.nextLine());
                        System.out.print("Cantidad: ");
                        ingredientes.setCantidad(sc.nextDouble());
                        sc.nextLine();
                        System.out.print("Unidad de medida: ");
                        ingredientes.setUnidadDeMedida(sc.nextLine());
                        System.out.println("Desea cargar otro ingrediente? S / N ");
                        String variante = sc.nextLine();
                        if(variante.equalsIgnoreCase("s")){
                            plato.setListaDeIngredientes(ingredientes);
                            System.out.println("Cargando otro ingrediente...");
                        }else if(variante.equalsIgnoreCase("n")){
                            plato.setListaDeIngredientes(ingredientes);
                            System.out.println("Entendido...");
                            break;
                        }else{
                            System.out.println("Invalido, porfavor intente nuevamente");
                        }
                    }
                    break;
                }else{
                    System.out.println("INVALIDO, PORFAVOR INTENTE NUEVAMENTE.");
                }
                System.out.println("Desea cargar otro plato? S / N ");
                String platardo = sc.nextLine();
                if(platardo.equalsIgnoreCase("s")){
                    platos.add(plato);
                }else if(platardo.equalsIgnoreCase("n")){
                    platos.add(plato);
                    System.out.println("Entendido...");
                    break;
                }else{
                    System.out.println("Invalido, porfavor intente nuevamente");
                }
            }
            break;
        }
        for(Plato plato : platos){
            System.out.println(platos.toString());
            for(Ingrediente ingrediente : plato.getListaDeIngredientes()){
                System.out.println(plato.getListaDeIngredientes().toString());
            }
        }
    }
}
