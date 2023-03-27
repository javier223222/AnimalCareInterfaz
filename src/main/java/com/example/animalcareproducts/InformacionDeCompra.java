package com.example.animalcareproducts;

public class InformacionDeCompra {
    private int idCompra;
    private Direccion direccion;
    private DatosBancarios datosBancarios;

    public InformacionDeCompra( Direccion direccion, DatosBancarios datosBancarios) {
        this.idCompra = 0;
        this.direccion = direccion;
        this.datosBancarios = datosBancarios;
    }
    public InformacionDeCompra(){

    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public DatosBancarios getDatosBancarios() {
        return datosBancarios;
    }

    public void setDatosBancarios(DatosBancarios datosBancarios) {
        this.datosBancarios = datosBancarios;
    }

    @Override
    public String toString() {
        return "InformacionDeCompra{" +
                ", direccion=" + direccion.toString() +
                ", datosBancarios=" + datosBancarios.toString() +
                '}';
    }
}
