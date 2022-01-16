/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlyvexe;

//import com.hcm.conf.jdbcUtils;
import com.qlbv.pojo.Xe;
import com.qlbv.services.DV_Xe;
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
    
    ObservableList<Xe> listXe;
    
    int index = -1;
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //TODO
        col_maChuyenXe.setCellValueFactory(new PropertyValueFactory<>("MaChuyenXe"));
        col_chuyenXe.setCellValueFactory(new PropertyValueFactory<>("ChuyenXe"));
        col_den.setCellValueFactory(new PropertyValueFactory<>("NoiDen"));
        col_di.setCellValueFactory(new PropertyValueFactory<>("NoiDi"));
        col_BienSo.setCellValueFactory(new PropertyValueFactory<>("BienSoXe"));
        col_GiaVe.setCellValueFactory(new PropertyValueFactory<>("Giave"));
    
        listXe = DV_Xe.getListXe();
        table_infoChuyenXe.setItems(listXe);
    }       
}
