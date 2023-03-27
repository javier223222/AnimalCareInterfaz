package com.example.animalcareproducts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ReciboClienteController {
    private static CompraClienteController compraClienteController=new CompraClienteController();
    private static Compras compras=new Compras();
    @FXML
    private Label direccion2;

    @FXML
    private TableColumn cantidad;
    @FXML
    private TableColumn precio;
    @FXML
    private TableColumn tipo;
    @FXML
    private TableColumn idproducto;
    @FXML
    private TableColumn presentacion;
    @FXML
    private TableColumn nombreProducto;
    @FXML
    private TableView articulos;
    @FXML
    private Label totaliva;
    @FXML
    private Label subtotal;
    @FXML
    private Label totalEnvio;
    @FXML
    private Label totalEnProductos;
    @FXML
    private Label direccionfactura;
    @FXML
    private Label nombrefactura;
    @FXML
    private Label dsatosBancarios;
    @FXML
    private Label region;
    @FXML
    private Label ciudad;
    @FXML
    private Label direccion;
    @FXML
    private Label nombre;
    @FXML
    private Label compraRealizada2;
    @FXML
    private Label totalPedido;
    @FXML
    private Label idRecibo;
    @FXML
    private Label compraRealizada1;
   private static PrincipalClienteController principalClienteController=new PrincipalClienteController();
    @FXML
    public void initialize(){

       String data[]= compras.comprarProducto(compraClienteController.getPrincipalClienteController().getArticulos(),compraClienteController.getInformacionDeCompra(),compraClienteController.getDescuentoProducto());
        System.out.println(compras.getHistorialVentas().size());
        compraRealizada1.setText(data[3]);
        idRecibo.setText(data[2]);
        totalPedido.setText(data[4]);
        compraRealizada2.setText(data[3]);

        ObservableList productos= FXCollections.observableArrayList(principalClienteController.getArticulos());
        this.idproducto.setCellValueFactory(new PropertyValueFactory("idProducto"));
        this.nombreProducto.setCellValueFactory(new PropertyValueFactory("nombreProducto"));
        this.presentacion.setCellValueFactory(new PropertyValueFactory("presentacion"));
        this.tipo.setCellValueFactory(new PropertyValueFactory("tipo"));
        this.precio.setCellValueFactory(new PropertyValueFactory("precio"));

        this.cantidad.setCellValueFactory(new PropertyValueFactory("cantidad"));
        articulos.setItems(productos);
      nombre.setText(compraClienteController.getInformacionDeCompra().getDireccion().getNombreCompleto());
        nombrefactura.setText(data[5]);
        nombre.setText(compraClienteController.getInformacionDeCompra().getDireccion().getNombreCompleto());
        dsatosBancarios.setText(data[6]);
        subtotal.setText(data[0]);
        totalEnProductos.setText(data[4]);
        totaliva.setText(data[4]);
       totalEnvio.setText(data[1]);
      direccion2.setText(data[7]);
       direccionfactura.setText(data[7]);



    }
    public void regresar(ActionEvent event) throws  Exception {
        ArrayList<Producto>productos1=principalClienteController.getArticulos();
        productos1.clear();
        principalClienteController.setArticulos(productos1);
        FXMLLoader fxmlLoader=new FXMLLoader(PrincipalClienteController.class.getResource("PrincipalCliente.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();





    }
}
