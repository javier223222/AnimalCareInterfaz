module com.example.animalcareproducts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animalcareproducts to javafx.fxml;
    exports com.example.animalcareproducts;
}