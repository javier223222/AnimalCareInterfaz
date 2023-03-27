package com.example.animalcareproducts;

public class Hormonales extends Producto{
    private String tipoHormona;

    public String getTipoHormona() {
        return tipoHormona;
    }

    public void setTipoHormona(String tipoHormona) {
        this.tipoHormona = tipoHormona;
    }

    public Hormonales(String nombreProducto, int idProducto, int cantidad, String presentacion, float precio, String verificacion, String tipo, String tipoHormona) {

        super(nombreProducto, idProducto, cantidad, presentacion, precio, verificacion, tipo);
        this.tipoHormona = tipoHormona;
    }

    @Override
    public boolean verificar(String verificacion) {
      if (verificacion.length()!=9){
          return false;
      }else {
          return true;
      }

    }

    @Override
    public String toString() {
        return "Hormonales{" +
                "tipoHormona='" + tipoHormona + '\'' +
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
