package com.example.animalcareproducts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Compras {
    private static ArrayList <ArrayList<Producto>>historialVentas=new ArrayList<>();
    private static ArrayList <InformacionDeCompra>informacionDecompra=new ArrayList<>();
    private static ArrayList <Float>totalCompras=new ArrayList<Float>();
    private static ArrayList <String>codigoDeDescuentos=new ArrayList<>();
    private static ArrayList<String >revisado=new ArrayList<>();

    public String[] comprarProducto(ArrayList<Producto>compras,InformacionDeCompra informacionDeCompra1,String codigoDescuento){
        String []datos=new String[8];
        String idRecibo=" ";
        float subtotal=Float.parseFloat(obnerSubtototal(compras)[0]);
        float costoDeEnvio=Float.parseFloat(obnerSubtototal(compras)[1]);
        float total=Float.parseFloat(obnerSubtototal(compras)[2]);
        float descuento =0;
        String fecha="";



        if (codigoDeDescuentos.contains(codigoDescuento)){
            descuento=total*10/100;
            System.out.println(descuento);
            total-=descuento;
            System.out.println("descuento encontrado");
            codigoDeDescuentos.remove(codigoDescuento);

        }
        informacionDeCompra1.setIdCompra(generaridDeRecibo());
        idRecibo=String.valueOf(informacionDeCompra1.getIdCompra());
        historialVentas.add(compras);
        System.out.println(historialVentas.size());
        informacionDecompra.add(informacionDeCompra1);
        revisado.add(" ");
        fecha=generarFecha();

        datos[0]=String.valueOf(subtotal);
        datos[1]=String.valueOf(costoDeEnvio);
        datos[2]=String.valueOf(idRecibo);
        datos[3]=String.valueOf(fecha);
        datos[4]=String.valueOf(total);
        datos[5]=informacionDeCompra1.getDatosBancarios().getNombreEnLaTarjeta();
        datos[6]=informacionDeCompra1.getDatosBancarios().getNumeroDeLaTarjeta();
        datos[7]=informacionDeCompra1.getDireccion().getCalleYNumero();
        return datos;


    }
    public String []obnerSubtototal(ArrayList<Producto>articulos){
        String []obnerSubtototal = new String[3];
        float subtotal=0;
        float costoEnvio=40;
        float costoTotal=0;
        for (int i = 0; i <articulos.size() ; i++) {
            Producto producto=articulos.get(i);


            subtotal+=producto.getPrecio()*producto.getCantidad();
        }
        obnerSubtototal[0]=Float.toString(subtotal);
        obnerSubtototal[1]=Float.toString(costoEnvio);
        obnerSubtototal[2]=Float.toString(costoTotal+subtotal+costoEnvio);

        return obnerSubtototal;
    }

    public int generaridDeRecibo(){
        Random random=new Random();
        int id=0;
        for (int i = 0; i <4 ; i++) {
            id+= random.nextInt(0,100);
        }

        return id;

    }

    public String generarFecha(){
        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");

        String date = dateFormat.format(new Date());

        return date;
    }

    public ArrayList<ArrayList<Producto>> getHistorialVentas() {
        return historialVentas;
    }

    public void setHistorialVentas(ArrayList<ArrayList<Producto>> historialVentas) {
        this.historialVentas = historialVentas;
    }

    public ArrayList<InformacionDeCompra> getInformacionDecompra() {
        return informacionDecompra;
    }

    public void setInformacionDecompra(ArrayList<InformacionDeCompra> informacionDecompra) {
        this.informacionDecompra = informacionDecompra;
    }

    public ArrayList<Float> getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(ArrayList<Float> totalCompras) {
        this.totalCompras = totalCompras;
    }

    public ArrayList<String> getCodigoDeDescuentos() {
        return codigoDeDescuentos;
    }

    public void setCodigoDeDescuentos(ArrayList<String> codigoDeDescuentos) {
        this.codigoDeDescuentos = codigoDeDescuentos;
    }
    public void agregarDescuento(String idDescuento){
        codigoDeDescuentos.add(idDescuento);
    }

    public ArrayList<String> getRevisado() {
        return revisado;
    }

    public void setRevisado(ArrayList<String> revisado) {
        this.revisado = revisado;
    }
}
