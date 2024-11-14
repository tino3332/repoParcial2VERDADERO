public class AlumnoAprobado extends Alumno {
    boolean estado;
    public AlumnoAprobado(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.estado = true;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
