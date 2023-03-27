package com.example.animalcareproducts;

public class Farmaceuticos extends Producto{
    private String tipoFarmaceutico ;
    private String formula;

    public Farmaceuticos(String nombreProducto, int idProducto, int cantidad, String presentacion, float precio, String verificacion, String tipo, String tipoFarmaceutico, String formula) {
        super(nombreProducto, idProducto, cantidad, presentacion, precio, verificacion, tipo);
        this.tipoFarmaceutico = tipoFarmaceutico;
        this.formula = formula;
    }


    public String getTipoFarmaceutico() {
        return tipoFarmaceutico;
    }

    public void setTipoFarmaceutico(String tipoFarmaceutico) {
        this.tipoFarmaceutico = tipoFarmaceutico;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public boolean verificar(String verificacion) {
      if (verificacion.length()!=4){
          return false;
      }else {
          return true;
      }
    }

    @Override
    public String toString() {
        return "Farmaceuticos{" +
                "tipoFarmaceutico='" + tipoFarmaceutico + '\'' +
                ", formula='" + formula + '\'' +
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
