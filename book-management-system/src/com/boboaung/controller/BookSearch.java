package com.boboaung.controller;

import java.io.IOException;

import com.boboaung.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BookSearch{

    @FXML
    private TableColumn<?, ?> col_author;

    @FXML
    private TableColumn<?, ?> col_category;

    @FXML
    private TableColumn<?, ?> col_id;

    @FXML
    private TableColumn<?, ?> col_price;

    @FXML
    private TableColumn<?, ?> col_publish_date;

    @FXML
    private TableColumn<?, ?> col_title;

    @FXML
    private TableView<?> tbl_book;

    @FXML
    private TextField txt_author;

    @FXML
    private TextField txt_category;

    @FXML
    private TextField txt_title;

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Start.changeScene("view/Book.fxml");
    }

    @FXML
    void btn_logout_click(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void btn_search_click(ActionEvent event) {
    	
    }

}
