package com.example.animalcareproducts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PrincipalClienteController {
    @FXML
    private Button agregarAlcarrito;
    @FXML

    private TableColumn verificacion;
    @FXML
    private TableColumn cantidad;
    @FXML
    private TableColumn precio;
    @FXML
    private TableColumn tipo;
    @FXML
    private TableColumn presentacion;
    @FXML
    private TableColumn nombreProducto;
    @FXML
    private TableColumn idproducto;
    @FXML private TableView tabla;
    //private AgregarProductoController productos=new AgregarProductoController();

private static AgregarProductoController agregarProductoController=new AgregarProductoController();
private static ObservableList<Producto> productos;
private static ArrayList<Producto>articulos=new ArrayList<Producto>();
private static Producto producto4;
private static Producto producto5;
private static Producto producto6;


    @FXML
    public void initialize(){
        ArrayList <Producto>paso=new ArrayList<Producto>();
        for (int i = 0; i <agregarProductoController.getProductos().size() ; i++) {
            Producto producto=agregarProductoController.getProductos().get(i);
            if (producto.getCantidad()!=0){
                paso.add(producto);

            }
        }
        agregarProductoController.setProductos(paso);
        tabla.setVisible(true);
        if (agregarProductoController.getProductos().size()!=0){
            agregarAlcarrito.setVisible(true);
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

        }else {
            agregarAlcarrito.setVisible(false);
            tabla.setVisible(false);

        }

    }
    public void comprar(MouseEvent mouseEvent) throws Exception {
        if (articulos.size()!=0) {
            FXMLLoader fxmlLoader=new FXMLLoader(CompraClienteController.class.getResource("CompraCliente.fxml"));
            Scene scene=new Scene(fxmlLoader.load());
            Stage stage=(Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Necesita agregar producto al carrito antes de comprar");
            alert.showAndWait();
        }

    }

    public void atencionAcliente(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(AtencionAlClienteController.class.getResource("AtencionAlCliente.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void salir(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(HelloController.class.getResource("Principal.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void seleccionar(MouseEvent mouseEvent) {

    }

    public void agregarAlcarrito(ActionEvent event) {
      Producto producto= (Producto) tabla.getSelectionModel().getSelectedItem();
        if (producto==null ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Necesita seleccionar un elemento");
            alert.showAndWait();
        }else if(producto.getCantidad()==0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Este producto no puede ser seleccionado,no tiene stock");
            alert.showAndWait();
        } else if (articulos.contains(producto)) {
            articulos.get(articulos.indexOf(producto)).setCantidad(1);
            producto.restarInventario(1);
            tabla.refresh();
            System.out.println(articulos.get(articulos.indexOf(producto)).getCantidad());
        } else {
         producto.restarInventario(1);
         producto4= new Producto(producto) {
             @Override
             public boolean verificar(String verificacion) {
                 return false;
             }
         };
        producto4.restarInventario(producto.getCantidad()-1);
         articulos.add(producto4);

         tabla.refresh();
        }

            System.out.println(articulos.size());
           tabla.refresh();
        }

    public  ArrayList<Producto> getArticulos() {
        return articulos;
    }

    public  void setArticulos(ArrayList<Producto> articulos) {
        PrincipalClienteController.articulos = articulos;
    }
}

