package com.boboaung.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import com.boboaung.Start;
import com.boboaung.model.DatabaseHandler;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Author implements Initializable {

	@FXML
	private TableColumn<com.boboaung.model.Author, LocalDate> col_birthday;

	@FXML
	private TableColumn<com.boboaung.model.Author, String> col_created_by;

	@FXML
	private TableColumn<com.boboaung.model.Author, Integer> col_id;

	@FXML
	private TableColumn<com.boboaung.model.Author, String> col_name;

	@FXML
	private TableColumn<com.boboaung.model.Author, String> col_native_town;

	@FXML
	private TableView<com.boboaung.model.Author> tbl_authors;

	@FXML
	private DatePicker txt_birthday;

	@FXML
	private TextField txt_name;

	@FXML
	private TextField txt_native_town;

	@FXML
	void btn_add_click(ActionEvent event) {

		try {
			// get data from input
			String name = txt_name.getText();
			LocalDate birthday = txt_birthday.getValue();
			String native_town = txt_native_town.getText();

			// create new author object
			com.boboaung.model.Author author = new com.boboaung.model.Author();
			author.setName(name);
			author.setBirthday(birthday);
			author.setNative_town(native_town);
			author.setCreated_by(Start.login_user);

			// save to database
			DatabaseHandler.saveAuthor(author);

			// not error
			Start.showAlert(AlertType.INFORMATION, "Successful added author");

			// clear old data

			txt_name.setText(null);
			txt_birthday.setValue(null);
			txt_native_town.setText(null);
		} catch (Exception e) {
			Start.showAlert(AlertType.ERROR, e.getMessage());
		}
	}

	@FXML
	void btn_back_click(ActionEvent event) throws IOException {
		Start.changeScene("view/Main.fxml");
	}

	@FXML
	void btn_delete_click(ActionEvent event) {

	}

	@FXML
	void btn_edit_click(ActionEvent event) {

	}

	@FXML
	void btn_logout_click(ActionEvent event) {
		System.exit(0);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		col_id.setCellValueFactory(new PropertyValueFactory<>("id")); // id mean getId
		col_name.setCellValueFactory(new PropertyValueFactory<>("name")); // name mean getName
		col_birthday.setCellValueFactory(new PropertyValueFactory<>("birthday")); // birthday mean getBirthday
		col_native_town.setCellValueFactory(new PropertyValueFactory<>("native_town"));
		col_created_by.setCellValueFactory(new PropertyValueFactory<>("authorName"));

		// set data to table
		List<com.boboaung.model.Author> list = DatabaseHandler.findAllAuthor();
		tbl_authors.setItems(FXCollections.observableArrayList(list));

	}

}
