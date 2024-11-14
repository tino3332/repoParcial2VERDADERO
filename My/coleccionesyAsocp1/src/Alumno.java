import java.util.*;
public class Alumno {
    String nombreCompleto;
    long Legajo;
    ArrayList<Nota> notas = new ArrayList();

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", Legajo=" + Legajo +
                ", notas=" + notas +
                '}';
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return Legajo;
    }

    public void setLegajo(long legajo) {
        Legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(Nota nota) {
        this.notas.add(nota);
    }
}
