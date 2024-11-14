import java.util.*;
public class Empleado {
    String nombreEmpleado;
    long cuil;
    int anioIngreso;
    double montoAntiguedad;
    double sueldoBasico;
    List<BonoSueldo> bonos;

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", cuil=" + cuil +
                ", anioIngreso=" + anioIngreso +
                ", montoAntiguedad=" + montoAntiguedad +
                ", sueldoBasico=" + sueldoBasico +
                ", bonos=" + bonos +
                '}';
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public List<BonoSueldo> getBonos() {
        return bonos;
    }

    public void setBonos(BonoSueldo bono) {
        this.bonos.add(bono);
    }
}
