package com.example.animalcareproducts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashSet;

public class PrincipalAdministradorController {
    @FXML
    public ImageView editar;
    @FXML
    private ImageView elimar;
    @FXML
    private TableColumn  cantidad;
    @FXML
    private TableColumn verificacion;
    @FXML
    private TableColumn nombreProducto;
   @FXML
    private TableColumn precio;
   @FXML
    private TableColumn tipo;
    @FXML
    private TableColumn idproducto;
    @FXML
    private TableColumn presentacion;
    @FXML
    private TableView<Producto> tabla;
    @FXML
    private Label etiqueta;
    private AgregarProductoController agregarProductoController=new AgregarProductoController();
  private static ObservableList<Producto>productos;

    @FXML
    public void initialize(){
        tabla.setVisible(true);
        if (agregarProductoController.getProductos().size()!=0){
            productos= FXCollections.observableArrayList();
            for (int i = 0; i <agregarProductoController.getProductos().size() ; i++) {
                Producto producto=agregarProductoController.getProductos().get(i);
                productos.add(producto);
            }
            this.idproducto.setCellValueFactory(new PropertyValueFactory("idProducto"));
            this.nombreProducto.setCellValueFactory(new PropertyValueFactory("nombreProducto"));
            this.presentacion.setCellValueFactory(new PropertyValueFactory("presentacion"));
            this.tipo.setCellValueFactory(new PropertyValueFactory("tipo"));
          this.precio.setCellValueFactory(new PropertyValueFactory("precio"));

            this.cantidad.setCellValueFactory(new PropertyValueFactory("cantidad"));
            this.verificacion.setCellValueFactory(new PropertyValueFactory("verificacion"));


            tabla.setItems(productos);
            elimar.setVisible(true);
            editar.setVisible(true);
        }else {
                tabla.setVisible(false);
               elimar.setVisible(false);
               editar.setVisible(false);
        }




    }

    public void forn(ActionEvent event) {

    }

    public void salir(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(HelloController.class.getResource("Principal.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void agregarProducto(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(AgregarProductoController.class.getResource("AgregarProducto.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }


    public void eliminar(MouseEvent mouseEvent) {
        Producto producto=this.tabla.getSelectionModel().getSelectedItem();
        if (producto==null ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Necesita seleccionar un elemento");
            alert.showAndWait();
        }else {
            productos.remove(producto);
            ArrayList<Producto>nuevosproductos=agregarProductoController.getProductos();
            nuevosproductos.remove(producto);
            agregarProductoController.setProductos(nuevosproductos);
            tabla.refresh();
        }

    }

    public void editar(MouseEvent mouseEvent) {
        Producto producto=this.tabla.getSelectionModel().getSelectedItem();


    }

    public void seleccionar(MouseEvent mouseEvent) {
        Producto producto=this.tabla.getSelectionModel().getSelectedItem();
        if (producto==null ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Necesita seleccionar un elemento");
            alert.showAndWait();
        }else {

        }
    }
}
