package com.example.animalcareproducts;

public class DatosBancarios {
    private String nombreEnLaTarjeta;
    private String numeroDeLaTarjeta;
    private String fechaDeVencimiento;
    private int codigoDeseguridad;

    public DatosBancarios(String nombreEnLaTarjeta, String numeroDeLaTarjeta, String fechaDeVencimiento, int codigoDeseguridad) {
        this.nombreEnLaTarjeta = nombreEnLaTarjeta;
        this.numeroDeLaTarjeta = numeroDeLaTarjeta;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.codigoDeseguridad = codigoDeseguridad;
    }

    public String getNombreEnLaTarjeta() {
        return nombreEnLaTarjeta;
    }

    public void setNombreEnLaTarjeta(String nombreEnLaTarjeta) {
        this.nombreEnLaTarjeta = nombreEnLaTarjeta;
    }

    public String getNumeroDeLaTarjeta() {
        return numeroDeLaTarjeta;
    }

    public void setNumeroDeLaTarjeta(String numeroDeLaTarjeta) {
        this.numeroDeLaTarjeta = numeroDeLaTarjeta;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public int getCodigoDeseguridad() {
        return codigoDeseguridad;
    }

    public void setCodigoDeseguridad(int codigoDeseguridad) {
        this.codigoDeseguridad = codigoDeseguridad;
    }

    @Override
    public String toString() {
        return "DatosBancarios{" +
                "nombreEnLaTarjeta='" + nombreEnLaTarjeta + '\'' +
                ", numeroDeLaTarjeta='" + numeroDeLaTarjeta + '\'' +

                '}';
    }
}
