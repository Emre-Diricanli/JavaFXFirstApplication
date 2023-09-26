package com.example.lab13_emrediricanli;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label result;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;

    public int add(ActionEvent actionEvent){
        int num1 = Integer.parseInt(this.num1.getText());
        int num2 = Integer.parseInt(this.num2.getText());
        int finalResult = num1+num2;
        return finalResult;
    }
    @FXML
    protected void onAddButtonClick(){
        int num1 = Integer.parseInt(this.num1.getText());
        int num2 = Integer.parseInt(this.num2.getText());
        int finalResult = num1+num2;
        String FR = String.valueOf(finalResult);
        this.result.setText("The result is: " + finalResult);
    }
}