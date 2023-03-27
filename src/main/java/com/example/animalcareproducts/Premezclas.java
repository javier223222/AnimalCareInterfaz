package com.example.animalcareproducts;

public class Premezclas extends Producto {
    private String tipoDeAntibiotico;
    private int peso;
    public Premezclas(String nombreProducto, int idProducto, int cantidad, String presentacion, float precio, String verificacion, String tipo ,String tipoDeAntibiotico, int peso){
        super(nombreProducto, idProducto, cantidad, presentacion, precio, verificacion, tipo);
        this.tipoDeAntibiotico=tipoDeAntibiotico;
        this.peso=peso;
    }
    public String getTipoDeAntibiotico() {
        return tipoDeAntibiotico;
    }
    public void setTipoDeAntibiotico(String tipoDeAntibiotico) {
        this.tipoDeAntibiotico = tipoDeAntibiotico;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean verificar(String verificacion) {
        if (verificacion.length()==10){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Premezclas{" +
                "tipoDeAntibiotico='" + tipoDeAntibiotico + '\'' +
                ", peso=" + peso +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                ", presentacion='" + presentacion + '\'' +
                ", precio=" + precio +
                ", verificacion='" + verificacion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
