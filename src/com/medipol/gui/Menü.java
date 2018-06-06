package com.medipol.gui;
import com.medipol.School;
import com.medipol.Student;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Menü extends Application {
	
	final static School school = new School("Medipol", "kavacik","0216423423432");

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Registration Form JavaFX Application");

        // Create the registration form grid pane
        GridPane gridPane = createRegistrationFormPane();
        // Add UI controls to the registration form grid pane
        addUIControls(gridPane,primaryStage);
        // Create a scene with registration form grid pane as the root node
        Scene scene = new Scene(gridPane, 800, 500);
        
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        // Set the scene in primary stage	
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }


    private GridPane createRegistrationFormPane() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane, Stage primaryStage) {
        // Add Header
        Label headerLabel = new Label("Ogrenci Kayýt Sistemi");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

     // Add Submit Button
        ToggleButton submitButton = new ToggleButton("Yeni Ogrenci Ekle");
        submitButton.setPrefHeight(40);
//        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(150);
        gridPane.add(submitButton, 0, 1, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

     // Add Submit Button
        ToggleButton submitButton1 = new ToggleButton(" Ogrenci Bilgisi Düzenle");
        submitButton1.setPrefHeight(40);
//        submitButton.setDefaultButton(true);
        submitButton1.setPrefWidth(150);
        gridPane.add(submitButton1, 0, 2, 2, 1);
        GridPane.setHalignment(submitButton1, HPos.CENTER);
        GridPane.setMargin(submitButton1, new Insets(20, 0,20,0));


        // Add Submit Button
        ToggleButton submitButton11 = new ToggleButton("Ogrenci Ara");
        submitButton11.setPrefHeight(40);
//        submitButton.setDefaultButton(true);
        submitButton11.setPrefWidth(150);
        gridPane.add(submitButton11, 0, 3, 2, 1);
        GridPane.setHalignment(submitButton11, HPos.CENTER);
        GridPane.setMargin(submitButton11, new Insets(20, 0,20,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	
                	OgrenciBilgiSistemi og= new OgrenciBilgiSistemi();
                	primaryStage.getScene().setRoot(og.createRegistrationFormPane());               	                	                	                                                          // showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Kullanýcý adý veye þifresi yanlýþ");
            }
         
            
        });
        submitButton11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	
            	Ogrenci_Arama og= new Ogrenci_Arama();
                	primaryStage.getScene().setRoot(og.createRegistrationFormPane(primaryStage)); 
                	
                		// showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Kullanýcý adý veye þifresi yanlýþ");
                	}
            });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}