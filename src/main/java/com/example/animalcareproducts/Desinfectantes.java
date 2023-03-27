package com.example.animalcareproducts;

public class Desinfectantes extends Producto{
    private String formulaQuimica;

    public Desinfectantes(String nombreProducto, int idProducto, int cantidad, String presentacion, float precio, String verificacion, String tipo, String formulaQuimica) {
        super(nombreProducto, idProducto, cantidad, presentacion, precio, verificacion, tipo);
        this.formulaQuimica = formulaQuimica;
    }

    public String getFormulaQuimica() {
        return formulaQuimica;
    }

    public void setFormulaQuimica(String formulaQuimica) {
        this.formulaQuimica = formulaQuimica;
    }

    @Override
    public boolean verificar(String verificacion) {
        if (verificacion.length()!=6){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "Desinfectantes{" +
                "formulaQuimica='" + formulaQuimica + '\'' +
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
