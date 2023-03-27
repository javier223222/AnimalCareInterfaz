package com.example.animalcareproducts;

import java.util.Objects;

public abstract class  Producto {
    protected String nombreProducto;
    protected int idProducto;
    protected int cantidad;
    protected String presentacion;
    protected float precio;
    protected String verificacion;
    protected String tipo;



    public abstract boolean verificar(String verificacion);

    public Producto(String nombreProducto, int idProducto, int cantidad, String presentacion, float precio, String verificacion, String tipo) {
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.presentacion = presentacion;
        this.precio = precio;
        this.verificacion = verificacion;
        this.tipo = tipo;
    }
    public Producto(Producto producto){
        this.nombreProducto = producto.getNombreProducto();
        this.idProducto =producto.getIdProducto();
        this.cantidad = producto.getCantidad();
        this.presentacion = producto.getPresentacion();
        this.precio =producto.getPrecio() ;
        this.verificacion =producto.getVerificacion();
        this.tipo = producto.getTipo();

    }

    public Producto(int idProducto){
        this.idProducto = idProducto;

    }
    public void restarInventario(int cantidad){
        if (cantidad>this.cantidad){
            this.cantidad = 0;
        }else {
            this.cantidad-=cantidad;
        }

    }


    public String getNombreProducto() {
        return nombreProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(String verificacion) {
        this.verificacion = verificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public boolean equals(Object o) {
        boolean existe = false;
        if (o instanceof Producto) {
            Producto producto = (Producto) o;
            existe =  this.idProducto == producto.getIdProducto();
        }
        return existe;
    }


    @Override
    public String toString() {
        return this.idProducto+";";
    }

    public String imprimirCliente(){
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", idProducto=" + idProducto + '\''+
                ", presentacion='" + presentacion + '\'' +
                ", precio=" + precio +
                ", verificacion='" + verificacion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
