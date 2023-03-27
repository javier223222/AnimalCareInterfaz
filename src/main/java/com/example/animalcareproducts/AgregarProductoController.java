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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashSet;

public class AgregarProductoController {




    private static ArrayList<Producto> productos = new ArrayList<>();
    @FXML
    private Label tipodepeso;
    @FXML
    private Label verificacionCorrecta;
    @FXML
    private Label tipodenumero4;
    @FXML
    private Label tipodenumero3;
    @FXML
    private Label tipodenumero2;
    @FXML

    private Label tipodenumero1;



    @FXML
    private ComboBox tipoDeProducto;
    @FXML
    private Label nombre;
    @FXML
    private TextArea  ingresaProducto;
    @FXML
    private Label idproducto;
    @FXML
    private TextField ingreseIdProducto;
    @FXML
    private Label cantidadProducto;
    @FXML
    private TextField ingresecantidaDeproducto;
    @FXML
    private Label presentacionProducto;
    @FXML
    private TextArea ingresepresentacion;
    @FXML
    private Label verificacionDelProducto;
    @FXML
    private TextField ingresarVerificacionDelProducto;
    @FXML
    private Label precioDelProducto;
    @FXML
    private TextField ingreseElPrecioDelProducto;
    @FXML
    private Label tipo;
    @FXML
    private TextArea ingresartipo;
    @FXML
    private Label tipoAntibiotico;
    @FXML
    private TextField ingreseEltipoDeAntibiotico;

    @FXML
    private Label pesoPremezcla;
    @FXML
    private TextField ingreseElpesoDeLaPremezcla;
    @FXML
    private Label cantidadMl;
    @FXML
    private TextField ingresarCantidadMl;
    @FXML
    private Label tipoFarmaceutico;
    @FXML
    private TextField ingreseeltipoFarmaceutico;
    @FXML
    private Label formulaFarmaceutica;
    @FXML
    private TextField ingreselaformulafarmacuetica;
    @FXML
    private Label tipohormona;
    @FXML
    private TextField ingresartipohormona;
    @FXML
    private Label formulaquimica;
    @FXML
    private TextField ingresartipoformulaquimica;
    @FXML
    private Label formulaantiparasitaria;
    @FXML
    private TextField ingresartipoformulaParasitaria;


    @FXML
    public void initialize() {
        tipodepeso.setVisible(false);

        verificacionCorrecta.setVisible(false);
        tipodenumero4.setVisible(false);
        tipodenumero1.setVisible(false);
        tipodenumero2.setVisible(false);
        tipodenumero3.setVisible(false);
        nombre.setVisible(false);
        ingresaProducto.setVisible(false);
        idproducto.setVisible(false);
        ingreseIdProducto.setVisible(false);
        cantidadProducto.setVisible(false);
        ingresecantidaDeproducto.setVisible(false);
        presentacionProducto.setVisible(false);
        ingresepresentacion.setVisible(false);
        verificacionDelProducto.setVisible(false);
        ingresarVerificacionDelProducto.setVisible(false);
        precioDelProducto.setVisible(false);
        ingreseElPrecioDelProducto.setVisible(false);
        tipo.setVisible(false);
        ingresartipo.setVisible(false);
        tipoAntibiotico.setVisible(false);
        ingreseEltipoDeAntibiotico.setVisible(false);

        pesoPremezcla.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        tipohormona.setVisible(false);
        ingresartipohormona.setVisible(false);
        formulaquimica.setVisible(false);
        ingresartipoformulaquimica.setVisible(false);
        formulaantiparasitaria.setVisible(false);
        ingresartipoformulaParasitaria.setVisible(false);
        ObservableList<String> rolesList = FXCollections.observableArrayList("Antibiotico", "Premezclas", "Farmaceuticos", "Hormonales", "Desifectantes", "Antiparasitarios");
        tipoDeProducto.setItems(rolesList);


    }


    public void eleccion(Event event) {

        if (tipoDeProducto.getValue() != null) {
            String palbra = (String) tipoDeProducto.getValue().toString();
            if (palbra.equals("Antibiotico")) {
                mostrarantibiotico();
                nombre.getText();
                ingresaProducto.getText();
                idproducto.getText();
                ingreseIdProducto.getText();
                cantidadProducto.getText();
                ingresecantidaDeproducto.getText();
                presentacionProducto.getText();
                ingresepresentacion.getText();
                verificacionDelProducto.getText();
                ingresarVerificacionDelProducto.getText();
                precioDelProducto.getText();
                ingreseElPrecioDelProducto.getText();
                tipo.getText();
                ingresartipo.getText();
                tipoAntibiotico.getText();

                ingreseEltipoDeAntibiotico.getText();
                cantidadMl.getText();
                ingresarCantidadMl.getText();
                System.out.println(ingresarCantidadMl.getText());

            } else if (palbra.equals("Premezclas")) {
                mostrarPremezcla();

            } else if (palbra.equals("Farmaceuticos")) {
                verfarmaceuticos();


            } else if (palbra.equals("Hormonales")) {
                mostrarHormonales();
            } else if (palbra.equals("Desifectantes")) {
                mostrarDesifectantes();
            } else if (palbra.equals("Antiparasitarios")) {
                mostrarantiparasitarios();
            }







               /*     break;

                case "Antiparasitarios":
                    nombre.setVisible(true);
                    ingresaProducto.setVisible(true);
                    idproducto.setVisible(true);
                    ingreseIdProducto.setVisible(true);
                    cantidadProducto.setVisible(true);
                    ingresecantidaDeproducto.setVisible(true);
                    presentacionProducto.setVisible(true);
                    ingresepresentacion.setVisible(true);
                    verificacionDelProducto.setVisible(true);
                    ingresarVerificacionDelProducto.setVisible(true);
                    precioDelProducto.setVisible(true);
                    ingreseElPrecioDelProducto.setVisible(true);
                    tipo.setVisible(true);
                    ingresartipo.setVisible(true);
                    break;*/

        }
    }

    private void mostrarantiparasitarios() {
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);
        tipoAntibiotico.setVisible(false);
        ingreseEltipoDeAntibiotico.setVisible(false);
        pesoPremezcla.setVisible(false);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreselaformulafarmacuetica.setVisible(false);
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);
        tipoAntibiotico.setVisible(false);
        ingreseEltipoDeAntibiotico.setVisible(false);
        pesoPremezcla.setVisible(false);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreselaformulafarmacuetica.setVisible(false);
        tipohormona.setVisible(false);
        ingresartipohormona.setVisible(false);
        formulaquimica.setVisible(false);
        ingresartipoformulaquimica.setVisible(false);
        formulaantiparasitaria.setVisible(true);
        ingresartipoformulaParasitaria.setVisible(true);
    }

    private void mostrarDesifectantes() {
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);
        tipoAntibiotico.setVisible(false);
        ingreseEltipoDeAntibiotico.setVisible(false);
        pesoPremezcla.setVisible(false);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreselaformulafarmacuetica.setVisible(false);
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);
        tipoAntibiotico.setVisible(false);
        ingreseEltipoDeAntibiotico.setVisible(false);
        pesoPremezcla.setVisible(false);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreselaformulafarmacuetica.setVisible(false);
        tipohormona.setVisible(false);
        ingresartipohormona.setVisible(false);
        formulaquimica.setVisible(true);
        ingresartipoformulaquimica.setVisible(true);
        formulaantiparasitaria.setVisible(false);
        ingresartipoformulaParasitaria.setVisible(false);
    }

    private void mostrarHormonales() {
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);
        tipoAntibiotico.setVisible(false);
        ingreseEltipoDeAntibiotico.setVisible(false);
        pesoPremezcla.setVisible(false);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreselaformulafarmacuetica.setVisible(false);
        tipohormona.setVisible(true);
        ingresartipohormona.setVisible(true);
        formulaquimica.setVisible(false);
        ingresartipoformulaquimica.setVisible(false);
        formulaantiparasitaria.setVisible(false);
        ingresartipoformulaParasitaria.setVisible(false);
    }

    private void verfarmaceuticos() {
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);
        tipoAntibiotico.setVisible(false);
        ingreseEltipoDeAntibiotico.setVisible(false);
        pesoPremezcla.setVisible(false);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        tipoFarmaceutico.setVisible(true);
        ingreseeltipoFarmaceutico.setVisible(true);
        formulaFarmaceutica.setVisible(true);
        ingreselaformulafarmacuetica.setVisible(true);
        tipohormona.setVisible(false);
        ingresartipohormona.setVisible(false);
        formulaquimica.setVisible(false);
        ingresartipoformulaquimica.setVisible(false);
        formulaantiparasitaria.setVisible(false);
        ingresartipoformulaParasitaria.setVisible(false);
    }


    public void salirdelagregar(ActionEvent event) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalAdministradorController.class.getResource("PrincipalAdministrador.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public void mostrarantibiotico() {
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);
        tipoAntibiotico.setVisible(true);

        ingreseEltipoDeAntibiotico.setVisible(true);
        cantidadMl.setVisible(true);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        ingresarCantidadMl.setVisible(true);
        pesoPremezcla.setVisible(false);
        ingreseElpesoDeLaPremezcla.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreselaformulafarmacuetica.setVisible(false);
        tipohormona.setVisible(false);
        ingresartipohormona.setVisible(false);
        formulaquimica.setVisible(false);
        ingresartipoformulaquimica.setVisible(false);
        formulaantiparasitaria.setVisible(false);
        ingresartipoformulaParasitaria.setVisible(false);
    }

    public void mostrarPremezcla() {
        nombre.setVisible(true);
        ingresaProducto.setVisible(true);
        idproducto.setVisible(true);
        ingreseIdProducto.setVisible(true);
        cantidadProducto.setVisible(true);
        ingresecantidaDeproducto.setVisible(true);
        presentacionProducto.setVisible(true);
        ingresepresentacion.setVisible(true);
        verificacionDelProducto.setVisible(true);
        ingresarVerificacionDelProducto.setVisible(true);
        precioDelProducto.setVisible(true);
        ingreseElPrecioDelProducto.setVisible(true);
        tipo.setVisible(true);
        ingresartipo.setVisible(true);

        tipoAntibiotico.setVisible(true);
        ingreseEltipoDeAntibiotico.setVisible(true);
        pesoPremezcla.setVisible(true);
        ingreseElpesoDeLaPremezcla.setVisible(true);
        cantidadMl.setVisible(false);
        ingresarCantidadMl.setVisible(false);
        tipoFarmaceutico.setVisible(false);
        ingreseeltipoFarmaceutico.setVisible(false);
        formulaFarmaceutica.setVisible(false);
        ingreselaformulafarmacuetica.setVisible(false);
        tipohormona.setVisible(false);
        ingresartipohormona.setVisible(false);
        formulaquimica.setVisible(false);
        ingresartipoformulaquimica.setVisible(false);
        formulaantiparasitaria.setVisible(false);
        ingresartipoformulaParasitaria.setVisible(false);
    }









               /*     break;

                case "Antiparasitarios":
                    nombre.setVisible(true);
                    ingresaProducto.setVisible(true);
                    idproducto.setVisible(true);
                    ingreseIdProducto.setVisible(true);
                    cantidadProducto.setVisible(true);
                    ingresecantidaDeproducto.setVisible(true);
                    presentacionProducto.setVisible(true);
                    ingresepresentacion.setVisible(true);
                    verificacionDelProducto.setVisible(true);
                    ingresarVerificacionDelProducto.setVisible(true);
                    precioDelProducto.setVisible(true);
                    ingreseElPrecioDelProducto.setVisible(true);
                    tipo.setVisible(true);
                    ingresartipo.setVisible(true);
                    break;*/


    public void obtenerdata(ActionEvent event) {
        int cantida;
        float precio;
        int cantidadml;
        int idProducto;
        Antibiotico antibiotico;
        Farmaceuticos farmaceuticos;
        Antiparasitarios antiparasitarios;
        Desinfectantes desinfectantes;
        Premezclas premezclas;
        Hormonales hormonas;


        if (tipoDeProducto.getValue() != null) {
            String palbra = (String) tipoDeProducto.getValue().toString();
            if (palbra.equals("Antibiotico")) {




                ingresaProducto.getText();

                ingreseIdProducto.getText();
                try {
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());
                    tipodenumero1.setVisible(false);
                    if (idProducto<=0){
                        tipodenumero1.setText("Ingrese un numero positivo");
                        tipodenumero1.setVisible(true);
                    }else {
                        tipodenumero1.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero1.setVisible(true);
                }

                ingresecantidaDeproducto.getText();
               try {
                  cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                  tipodenumero2.setVisible(false);
                  if (cantida<=0){
                      tipodenumero2.setText("Ingrese un numero positivo");
                      tipodenumero2.setVisible(true);
                  }else {
                      tipodenumero2.setVisible(false);
                  }

               }catch (Exception e) {
                   tipodenumero2.setVisible(true);
               }

                ingresepresentacion.getText();



                ingreseElPrecioDelProducto.getText();
                try {
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    tipodenumero4.setVisible(false);
                    if (precio<=0){
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(true);
                    }else {
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero4.setVisible(true);
                }


                ingresartipo.getText();
                ingresarVerificacionDelProducto.getText();


                ingreseEltipoDeAntibiotico.getText();

                ingresarCantidadMl.getText();
                try {
                 cantidadml=Integer.parseInt(ingresarCantidadMl.getText());
                    tipodenumero3.setVisible(false);
                    if (cantidadml<=0){
                        tipodenumero3.setText("Ingrese un numero positivo");
                        tipodenumero3.setVisible(true);
                    }else {
                        tipodenumero3.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero3.setVisible(true);
                }
                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    cantidadml=Integer.parseInt(ingresarCantidadMl.getText());
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());

                    if (cantida>0&&precio>0){

                        tipodenumero2.setVisible(false);
                        antibiotico=new Antibiotico(ingresaProducto.getText(),idProducto,cantida,ingresepresentacion.getText(),precio,ingresarVerificacionDelProducto.getText(),ingresartipo.getText(),ingreseEltipoDeAntibiotico.getText(),cantidadml);
                        if (antibiotico.verificar(antibiotico.getVerificacion())==false){
                            verificacionCorrecta.setText("La verificaion debe ser igual a 8 digitos");
                            verificacionCorrecta.setVisible(true);
                        }else {
                            verificacionCorrecta.setVisible(false);
                            if (productos.contains(antibiotico)){
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("Error");
                                alert.setContentText("Error el producto ya existe");
                                alert.showAndWait();
                            }else {

                                productos.add(antibiotico);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText(null);
                                alert.setTitle("Producto guardado correctamente");
                                alert.setContentText("El producto se guardo correctamente");
                                alert.showAndWait();
                            }

                        }


                    }else if (cantida<=0||precio<=0){
                        if (cantida<=0&&precio<=0){

                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        else if (cantida<=0){
                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                        }else {
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(false);
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Error no se pudo guardar el producto verifique las casillas");
                    alert.showAndWait();
                }





            } else if (palbra.equals("Premezclas")) {
                int pesoPremezcla;

              //  ingresaProducto.getText();

                //ingreseIdProducto.getText();
                try {
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());
                    tipodenumero1.setVisible(false);
                    if (idProducto<=0){
                        tipodenumero1.setText("Ingrese un numero positivo");
                        tipodenumero1.setVisible(true);
                    }else {
                        tipodenumero1.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero1.setVisible(true);
                }

               // ingresecantidaDeproducto.getText();
                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    tipodenumero2.setVisible(false);
                    if (cantida<=0){
                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(true);
                    }else {
                        tipodenumero2.setVisible(false);
                    }

                }catch (Exception e) {
                    tipodenumero2.setVisible(true);
                }

             //   ingresepresentacion.getText();



                //ingreseElPrecioDelProducto.getText();
                try {
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    tipodenumero4.setVisible(false);
                    if (precio<=0){
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(true);
                    }else {
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero4.setVisible(true);
                }
                try {
                   pesoPremezcla=Integer.parseInt(ingreseElpesoDeLaPremezcla.getText());
                    tipodepeso.setVisible(false);
                    if (pesoPremezcla<=0){
                        tipodepeso.setText("Por favor ingrese peso positivo");
                        tipodepeso.setVisible(true);
                    }else {
                        tipodepeso.setVisible(false);
                    }
                }catch (Exception e){
                    tipodepeso.setVisible(true);
                }
                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    pesoPremezcla=Integer.parseInt(ingreseElpesoDeLaPremezcla.getText());
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());

                    if (cantida>0&&precio>0){

                        tipodenumero2.setVisible(false);
                      premezclas=new Premezclas(ingresaProducto.getText(),idProducto,cantida,ingresepresentacion.getText(),precio,ingresarVerificacionDelProducto.getText(),ingresartipo.getText(),ingreseEltipoDeAntibiotico.getText(),pesoPremezcla);
                        if (!premezclas.verificar(premezclas.getVerificacion())){
                            verificacionCorrecta.setText("La verificación debe ser igual 10 digitos");
                            verificacionCorrecta.setVisible(true);
                        }else {
                            verificacionCorrecta.setVisible(false);
                            if (productos.contains(premezclas)){
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("Error");
                                alert.setContentText("Error el producto ya existe");
                                alert.showAndWait();
                            }else {
                                productos.add(premezclas);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText(null);
                                alert.setTitle("Producto guardado correctamente");
                                alert.setContentText("El producto se guardo correctamente");
                                alert.showAndWait();
                            }

                        }


                    }else if (cantida<=0||precio<=0){
                        if (cantida<=0&&precio<=0){

                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        else if (cantida<=0){
                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                        }else {
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(false);
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Error no se pudo guardar el producto verifique las casillas");
                    alert.showAndWait();
                }








            } else if (palbra.equals("Farmaceuticos")) {
                //  ingresaProducto.getText();

                //ingreseIdProducto.getText();
                try {
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());
                    tipodenumero1.setVisible(false);
                    if (idProducto<=0){
                        tipodenumero1.setText("Ingrese un numero positivo");
                        tipodenumero1.setVisible(true);
                    }else {
                        tipodenumero1.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero1.setVisible(true);
                }

                // ingresecantidaDeproducto.getText();
                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    tipodenumero2.setVisible(false);
                    if (cantida<=0){
                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(true);
                    }else {
                        tipodenumero2.setVisible(false);
                    }

                }catch (Exception e) {
                    tipodenumero2.setVisible(true);
                }

                //   ingresepresentacion.getText();



                //ingreseElPrecioDelProducto.getText();
                try {
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    tipodenumero4.setVisible(false);
                    if (precio<=0){
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(true);
                    }else {
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero4.setVisible(true);
                }

                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());

                    idProducto=Integer.parseInt(ingreseIdProducto.getText());

                    if (cantida>0&&precio>0){

                        tipodenumero2.setVisible(false);
                        farmaceuticos=new Farmaceuticos(ingresaProducto.getText(),idProducto,cantida,ingresepresentacion.getText(),precio,ingresarVerificacionDelProducto.getText(),ingresartipo.getText(),ingreseeltipoFarmaceutico.getText(),ingreselaformulafarmacuetica.getText());
                        if (!farmaceuticos.verificar(farmaceuticos.getVerificacion())){
                            verificacionCorrecta.setText("La verificación debe ser igual a 4 digitos");
                            verificacionCorrecta.setVisible(true);
                        }else {
                            verificacionCorrecta.setVisible(false);
                            if (productos.contains(farmaceuticos)){
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("Error");
                                alert.setContentText("Error el producto ya existe");
                                alert.showAndWait();
                            }else {
                                productos.add(farmaceuticos);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText(null);
                                alert.setTitle("Producto guardado correctamente");
                                alert.setContentText("El producto se guardo correctamente");
                                alert.showAndWait();
                            }

                        }


                    }else if (cantida<=0||precio<=0){
                        if (cantida<=0&&precio<=0){

                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        else if (cantida<=0){
                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                        }else {
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(false);
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Error no se pudo guardar el producto verifique las casillas");
                    alert.showAndWait();
                }






            } else if (palbra.equals("Hormonales")) {
                //ingreseIdProducto.getText();
                try {
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());
                    tipodenumero1.setVisible(false);
                    if (idProducto<=0){
                        tipodenumero1.setText("Ingrese un numero positivo");
                        tipodenumero1.setVisible(true);
                    }else {
                        tipodenumero1.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero1.setVisible(true);
                }

                // ingresecantidaDeproducto.getText();
                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    tipodenumero2.setVisible(false);
                    if (cantida<=0){
                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(true);
                    }else {
                        tipodenumero2.setVisible(false);
                    }

                }catch (Exception e) {
                    tipodenumero2.setVisible(true);
                }

                //   ingresepresentacion.getText();



                //ingreseElPrecioDelProducto.getText();
                try {
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    tipodenumero4.setVisible(false);
                    if (precio<=0){
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(true);
                    }else {
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero4.setVisible(true);
                }

                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());

                    idProducto=Integer.parseInt(ingreseIdProducto.getText());

                    if (cantida>0&&precio>0){

                        tipodenumero2.setVisible(false);
                       hormonas =new Hormonales(ingresaProducto.getText(),idProducto,cantida,ingresepresentacion.getText(),precio,ingresarVerificacionDelProducto.getText(),ingresartipo.getText(),ingresartipohormona.getText());
                        if (!hormonas.verificar(hormonas.getVerificacion())){
                            verificacionCorrecta.setText("La verificación debe ser igual a 9 digitos");
                            verificacionCorrecta.setVisible(true);
                        }else {
                            verificacionCorrecta.setVisible(false);
                            if (productos.contains(hormonas)){
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("Error");
                                alert.setContentText("Error el producto ya existe");
                                alert.showAndWait();
                            }else {
                                productos.add(hormonas);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText(null);
                                alert.setTitle("Producto guardado correctamente");
                                alert.setContentText("El producto se guardo correctamente");
                                alert.showAndWait();
                            }

                        }


                    }else if (cantida<=0||precio<=0){
                        if (cantida<=0&&precio<=0){

                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        else if (cantida<=0){
                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                        }else {
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(false);
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Error no se pudo guardar el producto verifique las casillas");
                    alert.showAndWait();
                }


            } else if (palbra.equals("Desifectantes")) {
                try {
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());
                    tipodenumero1.setVisible(false);
                    if (idProducto<=0){
                        tipodenumero1.setText("Ingrese un numero positivo");
                        tipodenumero1.setVisible(true);
                    }else {
                        tipodenumero1.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero1.setVisible(true);
                }

                // ingresecantidaDeproducto.getText();
                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    tipodenumero2.setVisible(false);
                    if (cantida<=0){
                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(true);
                    }else {
                        tipodenumero2.setVisible(false);
                    }

                }catch (Exception e) {
                    tipodenumero2.setVisible(true);
                }

                //   ingresepresentacion.getText();



                //ingreseElPrecioDelProducto.getText();
                try {
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    tipodenumero4.setVisible(false);
                    if (precio<=0){
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(true);
                    }else {
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero4.setVisible(true);
                }

                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());

                    idProducto=Integer.parseInt(ingreseIdProducto.getText());

                    if (cantida>0&&precio>0){

                        tipodenumero2.setVisible(false);
                        desinfectantes =new Desinfectantes(ingresaProducto.getText(),idProducto,cantida,ingresepresentacion.getText(),precio,ingresarVerificacionDelProducto.getText(),ingresartipo.getText(),ingresartipoformulaquimica.getText());
                        if (!desinfectantes.verificar(desinfectantes.getVerificacion())){
                            verificacionCorrecta.setText("La verificación debe ser igual a 6 digitos");
                            verificacionCorrecta.setVisible(true);
                        }else {
                            verificacionCorrecta.setVisible(false);
                            if (productos.contains(desinfectantes)){
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("Error");
                                alert.setContentText("Error el producto ya existe");
                                alert.showAndWait();
                            }else {
                                productos.add(desinfectantes);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText(null);
                                alert.setTitle("Producto guardado correctamente");
                                alert.setContentText("El producto se guardo correctamente");
                                alert.showAndWait();
                            }

                        }


                    }else if (cantida<=0||precio<=0){
                        if (cantida<=0&&precio<=0){

                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        else if (cantida<=0){
                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                        }else {
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(false);
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Error no se pudo guardar el producto verifique las casillas");
                    alert.showAndWait();
                }

            } else if (palbra.equals("Antiparasitarios")) {
                try {
                    idProducto=Integer.parseInt(ingreseIdProducto.getText());
                    tipodenumero1.setVisible(false);
                    if (idProducto<=0){
                        tipodenumero1.setText("Ingrese un numero positivo");
                        tipodenumero1.setVisible(true);
                    }else {
                        tipodenumero1.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero1.setVisible(true);
                }

                // ingresecantidaDeproducto.getText();
                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    tipodenumero2.setVisible(false);
                    if (cantida<=0){
                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(true);
                    }else {
                        tipodenumero2.setVisible(false);
                    }

                }catch (Exception e) {
                    tipodenumero2.setVisible(true);
                }

                //   ingresepresentacion.getText();



                //ingreseElPrecioDelProducto.getText();
                try {
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());
                    tipodenumero4.setVisible(false);
                    if (precio<=0){
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(true);
                    }else {
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    tipodenumero4.setVisible(true);
                }

                try {
                    cantida=Integer.parseInt(ingresecantidaDeproducto.getText());
                    precio=Float.parseFloat( ingreseElPrecioDelProducto.getText());

                    idProducto=Integer.parseInt(ingreseIdProducto.getText());

                    if (cantida>0&&precio>0){

                        tipodenumero2.setVisible(false);
                        antiparasitarios =new Antiparasitarios(ingresaProducto.getText(),idProducto,cantida,ingresepresentacion.getText(),precio,ingresarVerificacionDelProducto.getText(),ingresartipo.getText(),ingresartipoformulaParasitaria.getText());
                        if (!antiparasitarios.verificar(antiparasitarios.getVerificacion())){
                            verificacionCorrecta.setText("La verificación debe ser igual a 6 digitos");
                            verificacionCorrecta.setVisible(true);
                        }else {
                            verificacionCorrecta.setVisible(false);
                            if (productos.contains(antiparasitarios)){
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("Error");
                                alert.setContentText("Error el producto ya existe");
                                alert.showAndWait();
                            }
                            else {
                                productos.add(antiparasitarios);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText(null);
                                alert.setTitle("Producto guardado correctamente");
                                alert.setContentText("El producto se guardo correctamente");
                                alert.showAndWait();
                            }

                        }


                    }else if (cantida<=0||precio<=0){
                        if (cantida<=0&&precio<=0){

                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        else if (cantida<=0){
                            tipodenumero2.setText("Ingrese un numero positivo");
                            tipodenumero2.setVisible(true);
                        }else {
                            tipodenumero4.setText("El numero debe ser positivo");
                            tipodenumero4.setVisible(true);
                        }

                        tipodenumero2.setText("Ingrese un numero positivo");
                        tipodenumero2.setVisible(false);
                        tipodenumero4.setText("El numero debe ser positivo");
                        tipodenumero4.setVisible(false);
                    }
                }catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Error no se pudo guardar el producto verifique las casillas");
                    alert.showAndWait();
                }
            }
        }
        System.out.println(productos.size());
    }
    public  ArrayList<Producto> getProductos() {
        return productos;
    }

    public  void setProductos(ArrayList<Producto> productos) {
        AgregarProductoController.productos = productos;
    }



}
