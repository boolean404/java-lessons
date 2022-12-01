package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class LoginController {
	// convert tag to object

	@FXML
	private TextField txt_email;

	@FXML
	private TextField txt_pass;

	@FXML
	private void btn_login_click() {
		String email = txt_email.getText();
		String password = txt_pass.getText();

		if (email.isEmpty()) {
			showAlert(AlertType.ERROR, "Email is required");
			return;
		}
		if (password.isEmpty()) {
			showAlert(AlertType.ERROR, "Password is required");
			return;
		}

		if (email.equals("admin@gmail.com") && password.equals("admin")) {
//			System.out.println("Authicated User");
			showAlert(AlertType.INFORMATION, "Login Success");

		} else {
//			System.err.println("Authication Fail!");
			showAlert(AlertType.ERROR, "Login Fail");
		}
	}

	@FXML
	private void btn_clear_click() {
		txt_email.setText("");
		txt_pass.setText("");
	}

	@FXML
	void lbl_register_click(MouseEvent event) throws IOException {
		Main.changeScence("Register.fxml", "Register Form");
	}

	private void showAlert(AlertType alertType, String msg) {
		Alert alert = new Alert(alertType);
		alert.setTitle("Message");
		alert.setContentText(msg);

		alert.showAndWait();
	}
}
