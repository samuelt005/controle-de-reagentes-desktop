module com.example.controledereagentesdesktop {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;


    opens com.controledereagentes.models to javafx.base;
    opens com.controledereagentes.controllers to javafx.fxml;
    exports com.controledereagentes;
    exports com.controledereagentes.controllers;
    exports com.controledereagentes.controllers.fornecedores;
    exports com.controledereagentes.controllers.nfes;
    exports com.controledereagentes.controllers.lotes;
    exports com.controledereagentes.controllers.reagentes;
    exports com.controledereagentes.controllers.solicitacoes;
    exports com.controledereagentes.models;
    exports com.controledereagentes.dao;
    opens com.controledereagentes.controllers.fornecedores to javafx.fxml;
    opens com.controledereagentes.controllers.nfes to javafx.fxml;
    opens com.controledereagentes.controllers.lotes to javafx.fxml;
    opens com.controledereagentes.controllers.reagentes to javafx.fxml;
    opens com.controledereagentes.controllers.solicitacoes to javafx.fxml;
    exports com.controledereagentes.interfaces;
    opens com.controledereagentes.interfaces to javafx.fxml;
}