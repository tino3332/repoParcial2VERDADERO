import java.util.ArrayList;

public class Alumno {
    String nombreCompleto;
    long legajo;
    ArrayList<Nota> nombre = new ArrayList<>();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<Nota> nombre) {
        this.nombre = nombre;
    }
}
