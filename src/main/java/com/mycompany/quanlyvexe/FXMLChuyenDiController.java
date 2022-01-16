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
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
//    @FXML
//    private TableColumn<Xe, String> col_bienSo;
//
//    @FXML
//    private TableColumn<Xe, String> col_chuyenXe;
//
//    @FXML
//    private TableColumn<Xe, String> col_den;
//
//    @FXML
//    private TableColumn<Xe, String> col_di;
//
//    @FXML
//    private TableColumn<Xe, Double> col_giaVe;
//
//    @FXML
//    private TableColumn<Xe, String> col_idXe;
//
     @FXML
    private Button add;

    @FXML
    private ComboBox<?> combo_bienSoXe;
    
    @FXML
    private TextField txt_IdXe;

    @FXML
    private Label txt_den;

    @FXML
    private TextField txt_di;

    @FXML
    private TextField txt_giaVe;
    
    @FXML
    private TableView<Xe> table_InfoChuyenXe;

    ObservableList<Xe> listXe;

    int index = -1;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public void add_data() throws SQLException{
        conn = DV_Xe.ConnectDbXe();
        String sql = "insert into Database (MaChuyenXe, ChuyenXe, NoiDi, NoiDen, BienSoXe, GiaVe)values(?,?,?,?,?,?)";
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.upChuyenXe();
        
        try {
            this.loadTableData(null);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLChuyenDiController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //TODO
//        col_maChuyenXe.setCellValueFactory(new PropertyValueFactory<>("MaChuyenXe"));
//        col_chuyenXe.setCellValueFactory(new PropertyValueFactory<>("ChuyenXe"));
//        col_den.setCellValueFactory(new PropertyValueFactory<>("NoiDen"));
//        col_di.setCellValueFactory(new PropertyValueFactory<>("NoiDi"));
//        col_BienSo.setCellValueFactory(new PropertyValueFactory<>("BienSoXe"));
//        col_GiaVe.setCellValueFactory(new PropertyValueFactory<>("Giave"));
//    
//        listXe = DV_Xe.getListXe();
//        table_infoChuyenXe.setItems(listXe);

    private void upChuyenXe() {
        TableColumn col_idXe = new TableColumn("Mã Chuyến Xe");
        col_idXe.setCellValueFactory(new PropertyValueFactory("MaChuyenXe"));
        col_idXe.setPrefWidth(180);

        TableColumn col_chuyenXe = new TableColumn("Chuyến Xe");
        col_chuyenXe.setCellValueFactory(new PropertyValueFactory("ChuyenXe"));
        col_chuyenXe.setPrefWidth(150);

        TableColumn col_Di = new TableColumn("Nơi Đi");
        col_Di.setCellValueFactory(new PropertyValueFactory("NoiDi"));
        col_Di.setPrefWidth(100);

        TableColumn col_Den = new TableColumn("Nơi Đến");
        col_Den.setCellValueFactory(new PropertyValueFactory("NoiDen"));
        col_Den.setPrefWidth(100);

        TableColumn col_bienSo = new TableColumn("Biển Số Xe");
        col_bienSo.setCellValueFactory(new PropertyValueFactory("BienSoXe"));
        col_bienSo.setPrefWidth(120);

        TableColumn col_giaVe = new TableColumn("Giá Vé");
        col_giaVe.setCellValueFactory(new PropertyValueFactory("GiaVe"));
        col_giaVe.setPrefWidth(100);

        this.table_InfoChuyenXe.getColumns().addAll(col_idXe, col_chuyenXe, col_Den, col_Di, col_bienSo, col_giaVe);
    }
     private void loadTableData(String info ) throws SQLException{
         DV_Xe x = new DV_Xe();
         this.table_InfoChuyenXe.setItems(FXCollections.observableList(DV_Xe.getListXe(info)));
     }  
}


