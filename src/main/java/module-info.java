module com.example.assetmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.assetmanager to javafx.fxml;
    exports com.example.assetmanager;
    exports com.example.assetmanager.controllers;
    opens com.example.assetmanager.controllers to javafx.fxml;
}