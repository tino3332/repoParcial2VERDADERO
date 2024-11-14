import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Nota> notas = new ArrayList<>();

        while(true){
            Alumno alu0 = new Alumno();
            System.out.println("Ingrese datos del alumno");
            System.out.print("Ingrese nombre completo: ");
            alu0.setNombreCompleto(sc.nextLine());
            System.out.println("");
            System.out.print("Ingrese el legajo: ");
            alu0.setLegajo(sc.nextLong());
            sc.nextLine();
            while(true){
                Nota nota0 = new Nota();
                System.out.println("");
                System.out.print("Ingrese nombre catedra: ");
                nota0.setCatedra(sc.nextLine());
                System.out.println("");
                System.out.print("Nota: ");
                nota0.setNotaExamen(sc.nextDouble());
                System.out.println("");
                sc.nextLine();
                System.out.println("Desea salir de la carga de notas? S/N");
                String snN = sc.nextLine();
                if(snN.equalsIgnoreCase("S")){
                    break;
                }else if(snN.equalsIgnoreCase("N")){
                    System.out.println("Entendido");
                }
                notas.add(nota0);
            }
            alumnos.add(alu0);
            System.out.println("Desea salir de la carga de alumnos? S/N");
            String snA = sc.nextLine();
            if(snA.equalsIgnoreCase("S")){
                break;
            }else if(snA.equalsIgnoreCase("N")){
                System.out.println("Entendido");
            }
        }
        for(Alumno a: alumnos){
            System.out.println("Datos alumno "+a.getNombreCompleto());
            for(Nota n: notas){
                System.out.println("Nota de "+n.getCatedra()+": "+n.getNotaExamen());
            }
        }
    }
}
