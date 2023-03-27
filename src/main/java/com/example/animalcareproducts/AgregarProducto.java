package com.example.animalcareproducts;

public class AgregarProducto extends Producto{
    @Override
    public boolean verificar(String verificacion) {
        return false;
    }

    public AgregarProducto(int idProducto) {
        super(idProducto);
    }
}
