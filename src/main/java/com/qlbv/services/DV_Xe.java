/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbv.services;
//import com.hcm.conf.jdbcUtils;
import com.hcm.conf.jdbcUtils;
import com.qlbv.pojo.Xe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author USer
 */
public class DV_Xe {
//     <dependency>
//            <groupId>org.openjfx</groupId>
//            <artifactId>javafx-fxml</artifactId>
//            <version>18-ea+9</version>
//        </dependency>
//    public List<Xe>getXe() throws SQLException{
//        List<Xe> results = new ArrayList<>();
//        try(Connection conn = jdbcUtils.getConn()){
//            Statement stm = conn.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * FROM Xe");
//            }
//        
//        return results;
//    }
//    public static ObservableList<Xe> getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
  Connection conn = null;
   public static Connection ConnectDbXe(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/QuanLyVeXe","root","123456");
//            JOptionPane.showMessageDialog(null,"ket noi thanh cong");
            return conn;
        } catch (ClassNotFoundException | SQLException e){
//            JOptionPane.showMessageDialog(null,"e");
            return null;
        }
   }
   
   public static ObservableList<Xe> getListXe(){
       Connection conn = ConnectDbXe();
       ObservableList<Xe> list = FXCollections.observableArrayList();
       try{
           PreparedStatement ps = conn.prepareStatement("select * from Xe");
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               list.add(new Xe(Integer.parseInt(rs.getString("MaChuyenXe")),
                       rs.getString("ChuyenXe"), rs.getString("NoiDi"),
                       rs.getString("NoiDen"), rs.getString("BienSoXe"), 
                       rs.getDouble("GiaVe")));
           }
       } catch (NumberFormatException | SQLException e) {
       }
       return list;
   }
}
