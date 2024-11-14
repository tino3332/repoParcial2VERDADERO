import java.util.*;
public class Plato {
    String nombreCompleto;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> listaDeIngredientes = new ArrayList();

    @Override
    public String toString() {
        return "Plato{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", precio=" + precio +
                ", esBebida=" + esBebida +
                ", listaDeIngredientes=" + listaDeIngredientes +
                '}';
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getListaDeIngredientes() {
        return listaDeIngredientes;
    }

    public void setListaDeIngredientes(Ingrediente listaDeIngredientes) {
        this.listaDeIngredientes.add(listaDeIngredientes);
    }
}
