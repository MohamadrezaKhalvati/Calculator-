package com.company;
import java.util.* ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.omg.CORBA.INTERNAL;

public class Light {

    @FXML
    public Button one;

    @FXML
    public Button two;

    @FXML
    public Button three;

    @FXML
    public Button four;

    @FXML
    public Button five;

    @FXML
    public Button six;

    @FXML
    public Button seven;

    @FXML
    public Button eight;

    @FXML
    public Button nine;

    @FXML
    public Button clear;

    @FXML
    public Button minus;

    @FXML
    public Button darsad;

    @FXML
    public Button taghsim;

    @FXML
    public Button zarb;

    @FXML
    public Button plus;

    @FXML
    public Button ziro;

    @FXML
    public Button three_ziro;

    @FXML
    public Button two_ziro;

    @FXML
    public Button point;

    @FXML
    public TextField input;

    @FXML
    public Button multi;

    @FXML
    public Button mosavi;

    @FXML
    public Label bala;


    private double fnumber = 0 ;
    private double snumber = 0 ;

   private String operation ;

    public void one_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "1" ;
        input.setText(oldvalue + set);

    }
    public void two_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "2" ;
        input.setText(oldvalue + set);
    }
    public void three_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "3" ;
        input.setText(oldvalue + set);
    }
    public void four_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "4" ;
        input.setText(oldvalue + set);
    }
    public void five_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "5" ;
        input.setText(oldvalue + set);
    }
    public void six_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "6" ;
        input.setText(oldvalue + set);
    }
    public void seven_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "7" ;
        input.setText(oldvalue + set);
    }
    public void eight_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "8" ;
        input.setText(oldvalue + set);
    }
    public void nine_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "9" ;
        input.setText(oldvalue + set);
    }
    public void one_ziro_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "0" ;
        input.setText(oldvalue + set);
    }
    public void three_zero_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "000" ;
        input.setText(oldvalue + set);
    }
    public void two_zero_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "00" ;
        input.setText(oldvalue + set);

    }
    public void point_click(ActionEvent event) {
        String oldvalue = input.getText();
        String set = "." ;
        input.setText(oldvalue + set);
    }


    public void clear_click(ActionEvent event) {
       input.setText("");
       bala.setText("");
       this.fnumber = 0 ;
       this.snumber = 0 ;

    }
    public void multi_click(ActionEvent event) {


    }
    public void darsad_click(ActionEvent event) {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value) ;
        this.fnumber = valuenumber ;
        input.setText("");
        bala.setText(fnumber + "%");
        operation = "%" ;

    }
    public void taghsim_click(ActionEvent event) {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value) ;
        this.fnumber = valuenumber ;
        input.setText("");
        bala.setText(fnumber + "/");
        operation = "/" ;

    }
    public void zarb_click(ActionEvent event) {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value) ;
        this.fnumber = valuenumber ;
        input.setText("");
        bala.setText(fnumber + "x");
        operation = "x" ;
    }
    public void plus_click(ActionEvent event) {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value) ;
        this.fnumber = valuenumber ;
        input.setText("");
        bala.setText(fnumber + "+");
        operation = "+" ;
    }
    public void minus_click(ActionEvent event) {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value) ;
        this.fnumber = valuenumber ;
        input.setText("");
        bala.setText(fnumber + "-");
        operation = "-" ;
    }


    public void mosavli_click(ActionEvent event) {
        if (input.getText().equals("")) {
            input.setText("");
        }
        else{
            
            switch (operation) {

                case "+":

                    String value = input.getText();
                    this.snumber = Integer.parseInt(value);
                    double System = this.fnumber + this.snumber;
                    input.setText(String.valueOf(System));
                    String oldprom = bala.getText();
                    bala.setText(oldprom + value);
                    break;

                case "-":
                    String value_minus = input.getText();
                    this.snumber = Integer.parseInt(value_minus);
                    double System_minus = this.fnumber - this.snumber;
                    input.setText(String.valueOf(System_minus));
                    String oldprom_minus = bala.getText();
                    bala.setText(oldprom_minus + value_minus);
                    break;

                case "x":
                    String value_zarb = input.getText();
                    this.snumber = Integer.parseInt(value_zarb);
                    double System_zarb = this.fnumber * this.snumber;
                    input.setText(String.valueOf(System_zarb));
                    String oldprom_zarb = bala.getText();
                    bala.setText(oldprom_zarb + value_zarb);
                    break;


                case "/":
                    String value_taghsim = input.getText();
                    this.snumber = Integer.parseInt(value_taghsim);
                    double System_taghsim = this.fnumber / this.snumber;
                    input.setText(String.valueOf(System_taghsim));
                    String oldprom_taghsim = bala.getText();
                    bala.setText(oldprom_taghsim + value_taghsim);
                    break;


            }
        }
    }


}
