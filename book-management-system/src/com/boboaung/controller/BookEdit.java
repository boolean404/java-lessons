package com.boboaung.controller;

import java.io.IOException;

import com.boboaung.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BookEdit {

	@FXML
	private ComboBox<?> cbo_author;

	@FXML
	private ComboBox<?> cbo_category;

	@FXML
	private TextField txt_code;

	@FXML
	private TextField txt_price;

	@FXML
	private DatePicker txt_publish_date;

	@FXML
	private TextField txt_search_code;

	@FXML
	private TextField txt_title;

	@FXML
	void btn_back_click(ActionEvent event) throws IOException {
		Start.changeScene("view/Book.fxml");
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

	@FXML
	void btn_search_click(ActionEvent event) {

	}

	@FXML
	void img_search_click(MouseEvent event) {

	}

}
