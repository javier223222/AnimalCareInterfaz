package com.example.animalcareproducts;

import java.util.ArrayList;
import java.util.Random;

public class AtencionAcliente {
   private static Compras compras=new Compras();
    public String reembolso(int numeroDeRecibo){

        System.out.println(compras.getInformacionDecompra());
        int posicion=-1;
        for (int i = 0; i <compras.getInformacionDecompra().size() ; i++) {
            InformacionDeCompra informacionDeCompra=compras.getInformacionDecompra().get(i);
            if (informacionDeCompra.getIdCompra()==numeroDeRecibo){

                posicion=i;
                break;
            }
        }

        if (posicion!=-1){
            String revisado=compras.getRevisado().get(posicion);
            if (revisado.equals("revisado")){
                return "usted ya ha hecho una reclamacion";
            }else{

                    compras.getRevisado().set(posicion,"revisado");
                    return "se le rembolsara el producto";


                }
            }else {
           return "El producto no existe";
        }

        }

    public boolean existe(int numeroRecibo){

        for (int i = 0; i <compras.getInformacionDecompra().size() ; i++) {
            InformacionDeCompra informacionDeCompra=compras.getInformacionDecompra().get(i);
            if (informacionDeCompra.getIdCompra()==numeroRecibo){
                return true;

            }
        }
        return false;
    }
    public void regresarProductos(int id){
        int posicion=-1;


        System.out.println(compras.getHistorialVentas().toString());

    }
    public  String reponer(int numeroDeRecibo){
        int posicion=-1;
        for (int i = 0; i <compras.getInformacionDecompra().size() ; i++) {
            InformacionDeCompra informacionDeCompra=compras.getInformacionDecompra().get(i);
            if (informacionDeCompra.getIdCompra()==numeroDeRecibo){

                posicion=i;
                break;
            }
        }

        if (posicion!=-1){
            String revisado=compras.getRevisado().get(posicion);
            if (revisado.equals("revisado")){
               return "usted ya ha hecho una reclamacion";
            }else{
                compras.getRevisado().set(posicion,"revisado");
                    return "se le reponera el producto";


                }
            }else {
            return "el producto no existe";
        }

        }





    public  String descuento(int numeroDeRecibo){
        int posicion=-1;
        for (int i = 0; i <compras.getInformacionDecompra().size() ; i++) {
            InformacionDeCompra informacionDeCompra=compras.getInformacionDecompra().get(i);
            if (informacionDeCompra.getIdCompra()==numeroDeRecibo){

                posicion=i;
                break;
            }
        }

        if (posicion!=-1){
            String revisado=compras.getRevisado().get(posicion);
            if (revisado.equals("revisado")){
              return "usted ya ha hecho una reclamacion";
            }else{

                    String codigo;


                    codigo=generarCodigoDeDescuento();

                    compras.agregarDescuento(codigo);
                   compras.getRevisado().set(posicion,"revisado");
                    return " se generara un codigo de descuento del 10% en su siguiente compra el codigo es el siguiente "+codigo;
                }
            }else {
            return "el producto no existe";
        }

        }
    public String generarCodigoDeDescuento(){
        Random random=new Random();
        int iddescuento=0;
        for (int i=0;i<4;i++){
            iddescuento+= random.nextInt(0,100);
        }
        return Integer.toString(iddescuento);
    }
}
