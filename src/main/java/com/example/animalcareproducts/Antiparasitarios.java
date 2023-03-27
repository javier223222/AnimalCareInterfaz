package com.example.animalcareproducts;

public class Antiparasitarios extends Producto {
    private String formulaParasitaria;

    public Antiparasitarios(String nombreProducto, int idProducto, int cantidad, String presentacion, float precio, String verificacion, String tipo, String formulaParasitaria) {
        super(nombreProducto, idProducto, cantidad, presentacion, precio, verificacion, tipo);
        this.formulaParasitaria = formulaParasitaria;
    }

    public String getFormulaParasitaria() {
        return formulaParasitaria;
    }

    public void setFormulaParasitaria(String formulaParasitaria) {
        this.formulaParasitaria = formulaParasitaria;
    }

    @Override
    public boolean verificar(String verificacion) {
       if (verificacion.length()!=7){
           return false;
       }else {
           return true;
       }
    }

    @Override
    public String toString() {
        return "Antiparasitarios{" +
                "formulaParasitaria='" + formulaParasitaria + '\'' +
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
