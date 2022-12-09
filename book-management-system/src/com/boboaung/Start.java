package com.boboaung;

import java.io.IOException;
import java.util.Optional;

import com.boboaung.model.User;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;

public class Start extends Application {
	private static Stage original_stage;
	public static User login_user = null;

	@Override
	public void start(Stage primaryStage) {
		try {
			original_stage = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Book Management System");
			primaryStage.setFullScreen(false);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void changeScene(String inp_file) throws IOException {
		Parent root = FXMLLoader.load(Start.class.getResource(inp_file));
		Scene scene = new Scene(root);
		original_stage.hide();

		original_stage.setScene(scene);
		original_stage.show();
	}

	public static Optional<ButtonType> showAlert(AlertType type, String msg) {
		Alert alert = new Alert(type);
		alert.setContentText(msg);
		alert.setHeaderText(null);
		alert.setTitle("Message");

		return alert.showAndWait();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
