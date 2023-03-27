package com.example.animalcareproducts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class AtencionAlClienteController {
    public ComboBox <Producto>listaproducto1;
    public Button solicitar1;
    public TextField numeroRecibo2;
    public ComboBox productoPorError;
    public ComboBox productorecibido;
    public Button solicitar2;
    public ComboBox productomalo;
    public ComboBox elProblema;
    public Button codigoDescuento;
    public Button buscar2;
    public Button buscar3;
    public TextField numerorecibo3;
    public TextArea caja1;
    public TextArea caja3;
    public TextArea caja2g;
    @FXML
    private TextField idRecibo;
    private static AtencionAcliente atencionAcliente = new AtencionAcliente();
    private static ObservableList<Producto> observableList;
  @FXML
  public void initialize(){

      Compras compras=new Compras();
      System.out.println(compras.getHistorialVentas().size());

    caja1.setVisible(false);
    caja2g.setVisible(false);

    caja3.setVisible(false);
      solicitar1.setVisible(false);
      solicitar2.setVisible(false);
      codigoDescuento.setVisible(false);
  }

    public void regresar(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(PrincipalClienteController.class.getResource("PrincipalCliente.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void solicitraone(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Informacion sobre reclamacion");
        alert.setContentText(atencionAcliente.reponer(Integer.parseInt(idRecibo.getText())));
        alert.showAndWait();


    }

    public void solicitartwo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Informacion sobre reclamacion");
        alert.setContentText(atencionAcliente.reembolso(Integer.parseInt(numeroRecibo2.getText())));
        alert.showAndWait();
    }

    public void generarCodigo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Informacion sobre reclamacion");
        alert.setContentText(atencionAcliente.descuento(Integer.parseInt(numerorecibo3.getText())));
        alert.showAndWait();

    }

    public void buscar1(ActionEvent event) {

      if (atencionAcliente.existe(Integer.parseInt(idRecibo.getText()))){
          caja1.setVisible(true);
          solicitar1.setVisible(true);
      }else {
          Alert alert = new Alert(Alert.AlertType.ERROR);
          alert.setHeaderText(null);
          alert.setTitle("Error");
          alert.setContentText("Error el recibo no existe");
          alert.showAndWait();
      }


    }

    public void buscar2(ActionEvent event) {
        if (atencionAcliente.existe(Integer.parseInt(numeroRecibo2.getText()))){
            caja2g.setVisible(true);
            solicitar2.setVisible(true);
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error el recibo no existe");
            alert.showAndWait();
        }
    }

    public void buscarthree(ActionEvent event) {
        if (atencionAcliente.existe(Integer.parseInt(numerorecibo3.getText()))){
            caja3.setVisible(true);
            codigoDescuento.setVisible(true);
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error el recibo no existe");
            alert.showAndWait();
        }
    }

    public void mostrar1(Event event) {

    }

    public void mostrar2(Event event) {
    }

    public void mostrar4(Event event) {
    }

    public void mostrar5(Event event) {
    }

    public void mostrar6(Event event) {
    }
}
