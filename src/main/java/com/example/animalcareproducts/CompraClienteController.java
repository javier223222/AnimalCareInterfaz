package com.example.animalcareproducts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CompraClienteController {
    @FXML
    private DatePicker fecha;
    @FXML
    private TextField ingreseCodigoDeSeguridad;
    @FXML
    private TextField region;
    @FXML
    private TableColumn cantidad;
    @FXML
    private TableColumn precio;
    @FXML
    private TableColumn idproducto;
    @FXML
    private TableColumn presentacion;
    @FXML
    private TableColumn tipo;
    @FXML
    private TableColumn nombreProducto;
    @FXML
    private TableView articulos;
    @FXML
    private Label totalIva;
    @FXML
    private Label costolDelEnvio;
    @FXML
    private Label subtotal;
    @FXML
    private Button PagarObtenrData;
    @FXML
    private TextField ingreseCodigoDeDesceunto;
    @FXML
    private TextField ingresenumeroDelatarjeta;
    @FXML
    private TextField nombreenLatarjeta;
    @FXML
    private TextField ingreseNumeroTelfonico;
    @FXML
    private TextField ingreseCodigoPostal;
    @FXML
    private TextField ingreseciudad;
    @FXML
    private TextField codigoPostal;
    @FXML
    private TextField ingresecalleynumero;
    @FXML
    private TextField ingreseNombreCompleto;
    @FXML
    private TextField paisOregion;
    private static Compras compras=new Compras();
    private static ArrayList<Producto>articuloscopras=new ArrayList<Producto> ();
    private static PrincipalClienteController principalClienteController=new PrincipalClienteController();
    private static InformacionDeCompra informacionDeCompra;
    private static String descuentoProducto;
    @FXML
    public void initialize(){

        articuloscopras=principalClienteController.getArticulos();
        System.out.println(principalClienteController.getArticulos().toString());
        ObservableList productos= FXCollections.observableArrayList(principalClienteController.getArticulos());
        this.idproducto.setCellValueFactory(new PropertyValueFactory("idProducto"));
        this.nombreProducto.setCellValueFactory(new PropertyValueFactory("nombreProducto"));
        this.presentacion.setCellValueFactory(new PropertyValueFactory("presentacion"));
        this.tipo.setCellValueFactory(new PropertyValueFactory("tipo"));
        this.precio.setCellValueFactory(new PropertyValueFactory("precio"));

        this.cantidad.setCellValueFactory(new PropertyValueFactory("cantidad"));
        articulos.setItems(productos);
        compras=new Compras();
        subtotal.setText(compras.obnerSubtototal(principalClienteController.getArticulos())[0]);
        costolDelEnvio.setText(compras.obnerSubtototal(principalClienteController.getArticulos())[1]);
        totalIva.setText(compras.obnerSubtototal(principalClienteController.getArticulos())[2]);

     articulos.refresh();


    }


    public void regresar(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader=new FXMLLoader(PrincipalClienteController.class.getResource("PrincipalCliente.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public  PrincipalClienteController getPrincipalClienteController() {
        return principalClienteController;
    }

    public  void setPrincipalClienteController(PrincipalClienteController principalClienteController) {
        CompraClienteController.principalClienteController = principalClienteController;
    }

    public void procesar(ActionEvent event) throws  Exception{
        descuentoProducto=ingreseCodigoDeDesceunto.getText();
        ArrayList<Producto>productos1=principalClienteController.getArticulos();


        DatosBancarios datosBancarios=new DatosBancarios(nombreenLatarjeta.getText(),ingresenumeroDelatarjeta.getText(),fecha.toString(),Integer.parseInt(ingreseCodigoDeSeguridad.getText()));
        Direccion direccion=new Direccion(paisOregion.getText(),ingreseNombreCompleto.getText(),ingresecalleynumero.getText(),ingreseciudad.getText(),region.getText(),ingreseCodigoPostal.getText(),ingreseNumeroTelfonico.getText());
       informacionDeCompra=new InformacionDeCompra(direccion,datosBancarios);




            FXMLLoader fxmlLoader=new FXMLLoader(ReciboClienteController.class.getResource("ReciboCliente.fxml"));
            Scene scene=new Scene(fxmlLoader.load());
            Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();


        articulos.refresh();

    }

    public  ArrayList<Producto> getArticuloscopras() {
        return articuloscopras;
    }

    public  void setArticuloscopras(ArrayList<Producto> articuloscopras) {
        CompraClienteController.articuloscopras = articuloscopras;
    }

    public  InformacionDeCompra getInformacionDeCompra() {
        return informacionDeCompra;
    }

    public  void setInformacionDeCompra(InformacionDeCompra informacionDeCompra) {
        CompraClienteController.informacionDeCompra = informacionDeCompra;
    }

    public  String getDescuentoProducto() {
        return descuentoProducto;
    }

    public  void setDescuentoProducto(String descuentoProducto) {
        CompraClienteController.descuentoProducto = descuentoProducto;
    }
}
