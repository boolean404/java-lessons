package com.boboaung.controller;

import java.io.IOException;

import com.boboaung.Start;
import com.boboaung.model.DatabaseHandler;
import com.boboaung.model.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Login {

	@FXML
	private PasswordField txt_password;

	@FXML
	private TextField txt_username;

	@FXML
	void btn_login_click(ActionEvent event) throws IOException {
		String username = txt_username.getText();
		String password = txt_password.getText();

		User user = DatabaseHandler.loginUser(username, password);
		if (user == null) { // login fail
			Start.showAlert(AlertType.ERROR, "Username and password do not match");
		} else { // login success
			Start.login_user = user;
			Start.changeScene("view/Main.fxml");
		}

	}

	@FXML
	void txt_cancel_click(ActionEvent event) {
		txt_username.setText("");
		txt_password.setText("");
	}

}
