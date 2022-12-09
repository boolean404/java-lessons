package com.boboaung.controller;

import java.io.IOException;

import com.boboaung.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Category {

	@FXML
	private TableColumn<?, ?> col_created_at;

	@FXML
	private TableColumn<?, ?> col_created_by;

	@FXML
	private TableColumn<?, ?> col_id;

	@FXML
	private TableColumn<?, ?> col_name;

	@FXML
	private TableView<?> tbl_categories;

	@FXML
	private TextField txt_category;

	@FXML
	void btn_add_click(ActionEvent event) {

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

	}

}