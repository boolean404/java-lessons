package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	private static Stage originalStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			// create layout (convert fxml to java obj)
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

			// create sence
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Login Form");

			originalStage = primaryStage;
			// show stage
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void changeScence(String inp_file, String title) throws IOException {
		Parent root = FXMLLoader.load(Main.class.getResource(inp_file));
		Scene new_scene = new Scene(root);

		originalStage.hide();
		originalStage.setScene(new_scene);
		originalStage.setTitle(title);
		originalStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
