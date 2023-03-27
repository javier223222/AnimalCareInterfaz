package com.example.animalcareproducts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML


    public void abrirPrincipal(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(PrincipalAdministradorController.class.getResource("PrincipalAdministrador.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void abiriCliente(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(PrincipalClienteController.class.getResource("PrincipalCliente.fxml"));
        Scene scene1=new Scene(fxmlLoader.load());
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene1);
        stage.show();

    }
}