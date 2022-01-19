/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbv.services;
//import com.hcm.conf.jdbcUtils;
import com.qlbv.pojo.Xe;
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
public class DV_Xe {
   Connection conn = null;
   public static Connection ConnectDbXe() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/quanlyvexe","Luong","");
            System.out.println("Connect DbXe Corect");
            return conn;
        } catch (ClassNotFoundException e){
            System.out.println("Connect DbXe InCorect ClassNotFoundException" + e.getMessage());
            return null;
        }catch (SQLException ex){
            System.out.println("Connect DbXe InCorect SQLException" + ex.getMessage());
            return null;
        }
   }
   
   public static ObservableList<Xe> getListXe(String info) throws SQLException {
       Connection conn = ConnectDbXe();
       ObservableList<Xe> list = FXCollections.observableArrayList();
       try{
           PreparedStatement ps = conn.prepareStatement("SELECT * FROM quanlyvexe.xe");
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               list.add(new Xe(rs.getString("MaChuyenXe"),
                       rs.getString("ChuyenXe"), rs.getString("NoiDi"),
                       rs.getString("NoiDen"), rs.getString("BienSoXe"), 
                       rs.getDouble("GiaVe")));
           }
       } catch (SQLException e) {
       System.out.println("Cannot connect" + e.getMessage() );
       }
       return list;
   }
   public Xe getXeByID(String MaChuyenXe) throws SQLException{
       Xe xe = null;
       try(Connection conn = ConnectDbXe()){
            PreparedStatement stm = conn.prepareCall("SELECT * FROM quanlyvexe.xe WHERE MaChuyenXe = ?");
                stm.setString(1, MaChuyenXe);
                
                ResultSet rs = stm.executeQuery();
                while(rs.next()){
                    xe = new Xe(rs.getString("MaChuyenXe"),
                       rs.getString("ChuyenXe"), rs.getString("NoiDi"),
                       rs.getString("NoiDen"), rs.getString("BienSoXe"), 
                       rs.getDouble("GiaVe"));
                }
       }
       return xe;
   } 
}
