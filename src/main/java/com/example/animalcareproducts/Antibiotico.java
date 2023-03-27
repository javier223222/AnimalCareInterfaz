package com.example.animalcareproducts;

public class Antibiotico extends Producto{
    protected String tiposDeAntibiotico;
    protected int cantidadMl;



    public Antibiotico(String nombreProducto, int idProducto, int cantidad, String presentacion, float precio, String verificacion, String tipo, String tiposDeAntibiotico, int cantidadMl) {
        super(nombreProducto, idProducto, cantidad, presentacion, precio, verificacion, tipo);
        this.tiposDeAntibiotico = tiposDeAntibiotico;
        this.cantidadMl = cantidadMl;
    }


    public String getTiposDeAntibiotico() {
        return tiposDeAntibiotico;
    }

    public void setTiposDeAntibiotico(String tiposDeAntibiotico) {
        this.tiposDeAntibiotico = tiposDeAntibiotico;
    }

    public int getCantidadMl() {
        return cantidadMl;
    }

    public void setCantidadMl(int cantidadMl) {
        this.cantidadMl = cantidadMl;
    }

    @Override
    public boolean verificar(String verificacion) {
        if (verificacion.length()!=8){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Antibiotico{" +
                "tiposDeAntibiotico='" + tiposDeAntibiotico + '\'' +
                ", cantidadMl=" + cantidadMl +
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
