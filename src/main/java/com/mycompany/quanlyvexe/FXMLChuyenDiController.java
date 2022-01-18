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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

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
    private ComboBox<Xe> combo_bienSoXe;

    @FXML
    private TextField txt_IdXe;

    @FXML
    private TextField txt_den;

    @FXML
    private TextField txt_di;

    @FXML
    private TextField txt_giaVe;

    @FXML
    private TableView<Xe> table_InfoChuyenXe;

    TableColumn col_idXe;
    TableColumn col_Den;
    TableColumn col_Di;
    TableColumn col_bienSo;
    TableColumn col_giaVe;

    ObservableList<Xe> listXe;

    int index = -1;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    //tác động trong giao diện
    @FXML
    void getSelected(MouseEvent event) {
        index = table_InfoChuyenXe.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        txt_IdXe.setText(col_idXe.getCellData(index).toString());

        txt_den.setText(col_Den.getCellData(index).toString());
        txt_di.setText(col_Di.getCellData(index).toString());

        txt_giaVe.setText(col_giaVe.getCellData(index).toString());
    }

    //Them Chuyen Di
    public void add_data() throws SQLException {
        conn = DV_Xe.ConnectDbXe();
        String sql = "insert into xe (MaChuyenXe, NoiDi, NoiDen, GiaVe)values(?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_IdXe.getText());
            pst.setString(2, txt_den.getText());
            pst.setString(3, txt_di.getText());
//            this.combo_bienSoXe.getSelectionModel().getSelectedItem().getBienSoXe();
            pst.setString(4, txt_giaVe.getText());
            pst.execute();

            display();

        } catch (Exception e) {
            System.out.println("Cant ADD " + e.getMessage());
        }
    }

//    Sửa Chuyến đi
    public void edit_data() {
        try {
            conn = DV_Xe.ConnectDbXe();
            String MaChuyenXe = txt_IdXe.getText();
            String noiDi = txt_di.getText();
            String noiDen = txt_den.getText();
            String giaVe = txt_giaVe.getText();

            String sql1 = "update xe set MaChuyenXe = '" + MaChuyenXe + "',NoiDi = '" + noiDi + "',NoiDen = '"
                    + noiDen + "',GiaVe = '" + giaVe + "' where MaChuyenXe= '" + MaChuyenXe + "' ";
            pst = conn.prepareStatement(sql1);

            pst.execute();

            display();

        } catch (SQLException ex) {
            Logger.getLogger(FXMLVeXeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Xoa Chuyen di
    public void del_data() throws SQLException {
        try {
            conn = DV_Xe.ConnectDbXe();
            String sql = "DELETE FROM xe where MaChuyenXe = ? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_IdXe.getText());
//            pst.setString(2, txt_den.getText());
//            pst.setString(3, txt_di.getText());
//            pst.setString(4, txt_giaVe.getText());
            pst.execute();

            display();

        } catch (Exception e) {
            System.out.println("Can't delete " + e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
        display();
    }

    private void upChuyenXe() {
        TableColumn col_idXe = new TableColumn("Mã Chuyến Xe");
        col_idXe.setCellValueFactory(new PropertyValueFactory("MaChuyenXe"));
        col_idXe.setPrefWidth(180);

//        TableColumn col_chuyenXe = new TableColumn("Chuyến Xe");
//        col_chuyenXe.setCellValueFactory(new PropertyValueFactory("ChuyenXe"));
//        col_chuyenXe.setPrefWidth(150);
        TableColumn col_Di = new TableColumn("Nơi Đi");
        col_Di.setCellValueFactory(new PropertyValueFactory("NoiDi"));
        col_Di.setPrefWidth(150);

        TableColumn col_Den = new TableColumn("Nơi Đến");
        col_Den.setCellValueFactory(new PropertyValueFactory("NoiDen"));
        col_Den.setPrefWidth(150);

        TableColumn col_bienSo = new TableColumn("Biển Số Xe");
        col_bienSo.setCellValueFactory(new PropertyValueFactory("BienSoXe"));
        col_bienSo.setPrefWidth(150);

        TableColumn col_giaVe = new TableColumn("Giá Vé");
        col_giaVe.setCellValueFactory(new PropertyValueFactory("GiaVe"));
        col_giaVe.setPrefWidth(100);

        this.table_InfoChuyenXe.getColumns().addAll(col_idXe, col_Den, col_Di, col_bienSo, col_giaVe);
    }

    private void loadTableData(String info) throws SQLException {
        DV_Xe x = new DV_Xe();
        this.table_InfoChuyenXe.setItems(FXCollections.observableList(DV_Xe.getListXe(info)));
    }

    public void display() {
        this.upChuyenXe();
        try {
            this.loadTableData(null);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLChuyenDiController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
