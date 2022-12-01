package application;

import java.awt.geom.Area;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class RegisterController implements Initializable {

	@FXML
	private ComboBox<String> cbo_city;

	@FXML
	private CheckBox chk_java;

	@FXML
	private CheckBox chk_nodejs;

	@FXML
	private CheckBox chk_php;

	@FXML
	private ToggleGroup gender_group;

	@FXML
	private TextArea textarea_address;

	@FXML
	private DatePicker txt_birthday;

	@FXML
	private TextField txt_email;

	@FXML
	private TextField txt_password;

	@FXML
	private TextField txt_salary;

	@FXML
	void btn_register_click(ActionEvent event) {
		String email = txt_email.getText();
		String password = txt_password.getText();
		String city_item = cbo_city.getSelectionModel().getSelectedItem();
		int city_index = cbo_city.getSelectionModel().getSelectedIndex();
		RadioButton selected_gender = (RadioButton) gender_group.getSelectedToggle();
		String gender = selected_gender.getText();
		LocalDate birthday = txt_birthday.getValue();
		String address = textarea_address.getText();
		int salary = Integer.parseInt(txt_salary.getText());

		// muti check
		String skill_sets = "";
		if (chk_java.isSelected()) {
			skill_sets = chk_java.getText() + ", ";

		}
		if (chk_nodejs.isSelected()) {
			skill_sets += chk_nodejs.getText() + ", ";

		}
		if (chk_php.isSelected()) {
			skill_sets += chk_php.getText()+", ";
		}

		String output = "";

		output += email + password + city_index + city_item + gender + birthday + address + salary + "\n" + skill_sets.substring(0,skill_sets.lastIndexOf(","));
		System.out.println(output);

	}

	@FXML
	void btn_reset_click(ActionEvent event) {

	}

	@FXML
	void lbl_login_click(MouseEvent event) throws IOException {
		Main.changeScence("Login.fxml", "Login Form");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<String> cities = List.of("Yangon", "Dawei", "Mandalay", "Myeik");
		cbo_city.setItems(FXCollections.observableArrayList(cities));

	}

}
