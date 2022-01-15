/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbv.services;

import com.qlbv.pojo.VeXe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author USer
 */
public class DV_VeXe {
    Connection conn = null;
    public static Connection ConnectDbVeXe() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/quanlyvexe", "root", "123456789");
            return conn;
        } catch (Exception e) {
            return null;
        }
        
    }
    
       public static ObservableList<VeXe> getListVeXe() throws SQLException{
      Connection conn = ConnectDbVeXe();
      ObservableList<VeXe> listVX = FXCollections.observableArrayList();
      try{
          PreparedStatement ps = conn.prepareStatement("select * from quanlyvexe.vexe");
          ResultSet rs = ps.executeQuery();
          
          while(rs.next()){
              listVX.add(new VeXe(Integer.parseInt(rs.getString("maVe")), rs.getString("chuyenXe"), 
                      rs.getTime("GioKhoiHanh"), rs.getDate("NgayKhoiHanh"), rs.getDouble("Gia"), rs.getString("tenKH"),
                      rs.getString("bienSo")));
          }        
      }
      catch(Exception e){
          
      }
      return listVX;
      }
}
