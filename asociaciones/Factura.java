/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociaciones;

import java.util.ArrayList;
import java.util.List;
import mananatemaa.*;

/**
 *
 * @author Gerardo
 */
public class Factura {
    
    private String fecha;
    private long nroFactura;
    private String razonSocial;
    private long cuitCliente;
    private String tipoPago;
    private double montoTotalItems;
    private double recargo;
    private double montoFinal;
    private List<DetalleFactura> itemsFactura;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuitCliente() {
        return cuitCliente;
    }

    public void setCuitCliente(long cuitCliente) {
        this.cuitCliente = cuitCliente;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getMontoTotalItems() {
        return montoTotalItems;
    }

    public void setMontoTotalItems(double montoTotalItems) {
        this.montoTotalItems = montoTotalItems;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public List<DetalleFactura> getItemsFactura() {
        return itemsFactura;
    }

    public void setItemsFactura(List<DetalleFactura> itemsFactura) {
        this.itemsFactura = itemsFactura;
    }

    void addDetalleFactura(DetalleFactura fac) {
        if(this.itemsFactura == null)
            this.itemsFactura = new ArrayList<DetalleFactura>();
        this.itemsFactura.add(fac);
    }
    
    void calcularMontoTotalItems() {
        double montoTotal = 0;
        for(int i=0; i < itemsFactura.size(); i++){
            //montoTotal += itemsFactura.get(i).getPrecio() * itemsFactura.get(i).getCantidad();
            montoTotal += itemsFactura.get(i).calcularSubTotal();
        }
        this.montoTotalItems = montoTotal;
    }
    
    void calcularRecargo() {
        switch (this.tipoPago.toUpperCase()) {
            case "TD":
                this.recargo = this.montoTotalItems * 0.05;
                break;
            case "TC":
                this.recargo = this.montoTotalItems * 0.1;
                break;
            default:
                this.recargo = 0;
                break;
        }
    }
    
    void calcularMontoFinal() {
        this.montoFinal = this.montoTotalItems + this.recargo;
    }
    
}
