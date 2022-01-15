/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlyvexe;

import com.hcm.conf.jdbcUtils;
import com.qlbv.pojo.Xe;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class FXMLChuyenDiController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TableColumn<Xe, String> col_BienSo;

    @FXML
    private TableColumn<Xe, Double> col_GiaVe;

    @FXML
    private TableColumn<Xe, String> col_chuyenXe;

    @FXML
    private TableColumn<Xe, String> col_den;

    @FXML
    private TableColumn<Xe, String> col_di;

    @FXML
    private TableColumn<Xe, String> col_maChuyenXe;

    @FXML
    private TableView<Xe> table_infoChuyenXe;
    
    ObservableList<Xe> ListXe;
    
    int index = -1;
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        col_maChuyenXe.setCellValueFactory(new PropertyValueFactory<Xe,String>("Mã Chuyến Xe"));
        col_chuyenXe.setCellValueFactory(new PropertyValueFactory<Xe,String>("Chuyến Xe"));
        col_den.setCellValueFactory(new PropertyValueFactory<Xe,String>("Nơi Đến"));
        col_di.setCellValueFactory(new PropertyValueFactory<Xe,String>("Nơi Đi"));
        col_BienSo.setCellValueFactory(new PropertyValueFactory<Xe,String>("Biển Số Xe"));
        col_GiaVe.setCellValueFactory(new PropertyValueFactory<Xe,Double>("Giá Vé"));
    
        ListXe = jdbcUtils.getConnection();
        table_infoChuyenXe.setItems(ListXe);
    }       
}
