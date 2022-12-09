package com.boboaung.controller;

import java.io.IOException;

import com.boboaung.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class User {

    @FXML
    private TableColumn<?, ?> col_birthday;

    @FXML
    private TableColumn<?, ?> col_created_by;

    @FXML
    private TableColumn<?, ?> col_id;

    @FXML
    private TableColumn<?, ?> col_name;

    @FXML
    private TableColumn<?, ?> col_native_town;

    @FXML
    private TableView<?> tbl_authors;

    @FXML
    private PasswordField txt_password;

    @FXML
    private TextField txt_user_name;

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
    	System.exit(0);
    }

}
