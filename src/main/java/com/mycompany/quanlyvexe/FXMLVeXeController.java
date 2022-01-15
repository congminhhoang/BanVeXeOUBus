/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlyvexe;

import com.qlbv.pojo.VeXe;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author congm
 */
public class FXMLVeXeController implements Initializable {

    
    @FXML
    private TableColumn<VeXe, Double> col_cost;

    @FXML
    private TableColumn<VeXe, Date> col_date;

    @FXML
    private TableColumn<VeXe, Integer> col_id;

    @FXML
    private TableColumn<VeXe, String> col_license;

    @FXML
    private TableColumn<VeXe, String> col_name;

    @FXML
    private TableColumn<VeXe, Time> col_time;

    @FXML
    private TableColumn<VeXe, String> col_trip;

    @FXML
    private TableView<VeXe> table_ticket;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
