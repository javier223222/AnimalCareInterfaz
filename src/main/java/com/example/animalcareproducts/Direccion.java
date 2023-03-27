package com.example.animalcareproducts;

public class Direccion {
    private String paisOregion;
    private String nombreCompleto;
    private String calleYNumero;
    private String ciudad;
    private String estadoProvinciaRegion;
    private String codigoPostal;
    private String numeroDeTelefono;

    public Direccion(String paisOregion, String nombreCompleto, String calleYNumero, String ciudad, String estadoProvinciaRegion, String codigoPostal, String numeroDeTelefono) {
        this.paisOregion = paisOregion;
        this.nombreCompleto = nombreCompleto;
        this.calleYNumero = calleYNumero;
        this.ciudad = ciudad;
        this.estadoProvinciaRegion = estadoProvinciaRegion;
        this.codigoPostal = codigoPostal;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getPaisOregion() {
        return paisOregion;
    }

    public void setPaisOregion(String paisOregion) {
        this.paisOregion = paisOregion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCalleYNumero() {
        return calleYNumero;
    }

    public void setCalleYNumero(String calleYNumero) {
        this.calleYNumero = calleYNumero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadoProvinciaRegion() {
        return estadoProvinciaRegion;
    }

    public void setEstadoProvinciaRegion(String estadoProvinciaRegion) {
        this.estadoProvinciaRegion = estadoProvinciaRegion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "paisOregion='" + paisOregion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", calleYNumero='" + calleYNumero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", estadoProvinciaRegion='" + estadoProvinciaRegion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", numeroDeTelefono='" + numeroDeTelefono + '\'' +
                '}';
    }
}
