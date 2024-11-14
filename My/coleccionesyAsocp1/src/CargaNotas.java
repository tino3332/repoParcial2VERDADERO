    import java.util.*;
    public class CargaNotas {
        public static void main(String[] args) {
            ArrayList<Alumno> listaAlumnos = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while(true){
                Alumno alu = new Alumno();
                System.out.println("INGRESE DATOS DEL ALUMNO");
                System.out.println("INGRESE NOMBRE COMPLETO: ");
                alu.setNombreCompleto(sc.nextLine());
                System.out.println("INGRESE LEGAJO: ");
                alu.setLegajo(sc.nextLong());
                sc.nextLine();
                while(true){
                    Nota nota = new Nota();
                    System.out.println("INGRESE NOMBRE DE CATEDRA: ");
                    nota.setCatedra(sc.nextLine());
                    System.out.println("INGRESE LA NOTA: ");
                    nota.setNotaExamen(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("DESEA SALIR DE LA CARGA DE NOTAS? S / N ");
                    String estado = sc.nextLine();
                    if(estado.equalsIgnoreCase("S")){
                        alu.setNotas(nota);
                        break;
                    }else if(estado.equalsIgnoreCase("N")){
                        alu.setNotas(nota);
                    }else{
                        System.out.println("OPCION INVALIDA, PORFAVOR INTENTE NUEVAMENTE.");
                    }
                }
                System.out.println("DESEA SALIR DE LA CARGA DE ALUMNOS? S / N ");
                String estado = sc.nextLine();
                if(estado.equalsIgnoreCase("S")){
                    listaAlumnos.add(alu);
                    break;
                }else if(estado.equalsIgnoreCase("N")){
                    listaAlumnos.add(alu);
                }
            }
            for(Alumno alu : listaAlumnos){
                System.out.println("DATOS DEL ALUMNO "+ alu.getNombreCompleto());
                for(Nota nota : alu.getNotas()){
                    System.out.println(alu.getNotas().toString());
                }
            }
        }
    }
