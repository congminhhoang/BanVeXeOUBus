/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlyvexe;

import com.qlbv.pojo.VeXe;
import com.qlbv.services.DV_VeXe;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TextField txtHoten;
    
    @FXML
    private TableView<VeXe> table_ticket;
    
    ObservableList<VeXe> listVeXe;
    int index = -1;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public void themKH(){
        conn = DV_VeXe.ConnectDbVeXe();
        String sql = "insert into VeXe(txtHoten)values(?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(6, txtHoten.getText());
            pst.execute();
            
        }catch(Exception e){
            
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        col_id.setCellValueFactory(new PropertyValueFactory<>("maVe"));
        col_trip.setCellValueFactory(new PropertyValueFactory<>("chuyenXe"));
        col_time.setCellValueFactory(new PropertyValueFactory<>("gioKhoiHanh"));
        col_date.setCellValueFactory(new PropertyValueFactory<>("ngayKhoiHanh"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("hotenKH"));
        col_cost.setCellValueFactory(new PropertyValueFactory<>("giaVe"));
        col_license.setCellValueFactory(new PropertyValueFactory<>("bienSo"));
        
        try {
            listVeXe = DV_VeXe.getListVeXe();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLVeXeController.class.getName()).log(Level.SEVERE, null, ex);
        }
            table_ticket.setItems(listVeXe);
        
    }    

}
