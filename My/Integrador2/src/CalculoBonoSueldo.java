import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class CalculoBonoSueldo {
    String [][] haberes = {{"100","Presentismo","9"},{"101","Titulo Profesional","9"},{"102","Horas Extraordinarias","M"},{"103","Horas Nocturnas","M"},{"104","Otros Haberes","M"}};
    String [][] deducciones = {{"200","Obra Social","3"},{"201","Jubilacion","11"},{"202","Sindicato","2"},{"203","Seguro","1.5"},{"204","Otros","M"}};
    ArrayList<Integer> codigosIngresados = new ArrayList<Integer>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicito los atributos del empleado
    Empleado emp1 = solicitudEmpleadoSinBS();
        //Solicito los atributos del bono Sueldo
    BonoSueldo bono = solicitudBonoSueldo();
        //Agrego el bono a la lista de bonos del empleado
    emp1.setBonos(bono);


    }
    public static Empleado solicitudEmpleadoSinBS(){
        while(true) {
            Scanner sc = new Scanner(System.in);
            Empleado empleado = new Empleado();
            System.out.println("Ingrese su nombre de empleado");
            empleado.setNombreEmpleado(sc.nextLine());
            System.out.println("Ingrese su cuil:");
            empleado.setCuil(sc.nextLong());
            System.out.println("Ingrese su anio de ingreso:");
            empleado.setAnioIngreso(sc.nextInt());
            System.out.println("Ingrese su sueldo basico:");
            empleado.setSueldoBasico(sc.nextDouble());

            if(empleado.getAnioIngreso()<2024){
                return empleado;
            }else{
                System.out.println("Anio de ingreso no puede ser mayor o igual al actual, porfavor intente nuevamente.");
            }
        }
    }
    public static BonoSueldo solicitudBonoSueldo(){
        while(true) {
            BonoSueldo bonoSueldo = new BonoSueldo();
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese mes de liquidacion: ");
            bonoSueldo.setMesLiquidacion(sc.nextInt());
            System.out.println("Ingrese anio de liquidacion: ");
            bonoSueldo.setAnioLiquidacion(sc.nextInt());
            if (bonoSueldo.getAnioLiquidacion() < 2024) {
                return bonoSueldo;
            } else {
                System.out.println("Anio de liquidacion no puede ser mayor o igual al actual, porfavor intente nuevamente.");
            }
        }
    }
}
