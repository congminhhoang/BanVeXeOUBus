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
import javafx.collections.FXCollections;
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

//    @FXML
//    private ComboBox<Xe> cbTuyen;
    
    
//    @FXML
//    private TableColumn<VeXe, Double> col_cost;
//
//    @FXML
//    private TableColumn<VeXe, Date> col_date;
//
//    @FXML
//    private TableColumn<VeXe, Integer> col_id;
//
//    @FXML
//    private TableColumn<VeXe, String> col_license;
//
//    @FXML
//    private TableColumn<VeXe, String> col_name;
//
//    @FXML
//    private TableColumn<VeXe, Time> col_time;
//
//    @FXML
//    private TableColumn<VeXe, String> col_trip;
    
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
            this.loadTableView();
        try {
            this.loadTableDate(null);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLVeXeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    //        col_id.setCellValueFactory(new PropertyValueFactory<VeXe,Integer>("maVe"));
//        col_trip.setCellValueFactory(new PropertyValueFactory<VeXe,String>("chuyenXe"));
//        col_time.setCellValueFactory(new PropertyValueFactory<VeXe, Time>("gioKhoiHanh"));
//        col_date.setCellValueFactory(new PropertyValueFactory<VeXe, Date>("ngayKhoiHanh"));
//        col_name.setCellValueFactory(new PropertyValueFactory<VeXe, String>("hotenKH"));
//        col_cost.setCellValueFactory(new PropertyValueFactory<VeXe, Double>("giaVe"));
//        col_license.setCellValueFactory(new PropertyValueFactory<VeXe, String>("bienSo"));
//        
//        try {
//            listVeXe = DV_VeXe.getListVeXe();
//        } catch (SQLException ex) {
//            Logger.getLogger(FXMLVeXeController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            table_ticket.setItems(listVeXe);
//        try {
//            this.loadTableDate(null);
//        } catch (SQLException ex) {
//            Logger.getLogger(FXMLVeXeController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    private void loadTableView(){
        TableColumn colID = new TableColumn("Mã Vé");
        colID.setCellValueFactory(new PropertyValueFactory("MaVe"));
        
        TableColumn colChuyenXe = new TableColumn("Chuyến Xe");
        colChuyenXe.setCellValueFactory(new PropertyValueFactory("ChuyenXe"));
        
        TableColumn colTime = new TableColumn("Giờ");
        colTime.setCellValueFactory(new PropertyValueFactory("GioKhoiHanh"));
        
        TableColumn colDate = new TableColumn("Ngày");
        colDate.setCellValueFactory(new PropertyValueFactory("NgayKhoiHanh"));
        
        TableColumn colName = new TableColumn("Tên KH");
        colName.setCellValueFactory(new PropertyValueFactory("HoTenKH"));
        
        TableColumn colbienSo = new TableColumn("Biển Số");
        colbienSo.setCellValueFactory(new PropertyValueFactory("BienSoXe"));
        
        this.table_ticket.getColumns().addAll(colID,colChuyenXe,colTime,colDate,colName,colbienSo);
    }
     private void loadTableDate(String kw) throws SQLException{
         DV_VeXe vx = new DV_VeXe();
         this.table_ticket.setItems(FXCollections.observableList(vx.getListVeXe()));
     }  
}
