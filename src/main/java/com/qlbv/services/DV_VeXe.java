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
import java.util.ArrayList;
import java.util.List;
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
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/quanlyvexe", "Luong", "");
            return conn;
            
        } catch (ClassNotFoundException e) {
            System.out.println("Connect DbXe InCorect ClassNotFoundException" + e.getMessage());
            return null;
        } catch (SQLException ex) {
            System.out.println("Connect DbXe InCorect SQLException" + ex.getMessage());
            return null;
        }
    }

    public static ObservableList<VeXe> getListVeXe() throws SQLException {
        Connection conn = ConnectDbVeXe();
        ObservableList<VeXe> listVX = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from quanlyvexe.vexe");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listVX.add(new VeXe(Integer.parseInt(rs.getString("MaVe")),
                        rs.getString("ChuyenXe"), rs.getTime("GioKhoiHanh"), rs.getDate("NgayKhoiHanh"),
                        rs.getDouble("GiaVe"), rs.getString("HoTenKH"), rs.getString("BienSoXe")));
            }
        } catch (Exception e) {
            System.out.println("Cannot Connect" + e.getMessage());
        }
        return listVX;
    }
//       public List<VeXe> getVeXe(String kw) throws SQLException{
//           List<VeXe> veXe= new ArrayList<>();
//           try(Connection conn = ConnectDbVeXe()){
//               String sql = "SELECT * FROM quanlyvexe.vexe";
//               if(kw != null && !kw.isEmpty())
//                   sql += "WHERE maVe like concat('%', ?, '%')";
//               PreparedStatement stm = conn.prepareStatement(sql);
//               if(kw != null && !kw.isEmpty())
//                   stm.setString(1, kw);
//               
//               ResultSet rs = stm.executeQuery();
//               while(rs.next()){
//                   VeXe q = new VeXe(Integer.parseInt(rs.getString("MaVe")), rs.getString("ChuyenXe"), 
//                      rs.getTime("GioKhoiHanh"), rs.getDate("NgayKhoiHanh"), rs.getDouble("GiaVe"), rs.getString("HoTenKH"),
//                      rs.getString("BienSoXe"));
//                   veXe.add(q);}
//           }
//           return veXe;
//       }
    
       public List<VeXe> getVeXe(String kw) throws SQLException{
           List<VeXe> veXe= new ArrayList<>();
           try(Connection conn = ConnectDbVeXe()){
               String sql = "SELECT * FROM quanlyvexe.vexe";
               if(kw != null && !kw.isEmpty())
                   sql += "WHERE ChuyenXe like concat('%',?,'%')";
               PreparedStatement stm = conn.prepareStatement(sql);
               if(kw != null && !kw.isEmpty())
                   stm.setString(1, kw);
               
               ResultSet rs = stm.executeQuery();
               while(rs.next()){
                   VeXe q = new VeXe(Integer.parseInt(rs.getString("MaVe")), rs.getString("ChuyenXe"), 
                      rs.getTime("GioKhoiHanh"), rs.getDate("NgayKhoiHanh"), rs.getDouble("GiaVe"), rs.getString("HoTenKH"),
                      rs.getString("BienSoXe"));
                   veXe.add(q);}
           }
           return veXe;
       }
       public VeXe GetVeXeByID(String MaVe) throws SQLException{
            VeXe vx = null;
            try(Connection conn = ConnectDbVeXe()){
                PreparedStatement stm = conn.prepareCall("SELECT * FROM quanlyvexe.vexe WHERE MaVe = ?");
                stm.setString(1, MaVe);
                
                ResultSet rs = stm.executeQuery();
                
                while(rs.next()){
                    vx = new VeXe(Integer.parseInt(rs.getString("MaVe")), rs.getString("ChuyenXe"), 
                      rs.getTime("GioKhoiHanh"), rs.getDate("NgayKhoiHanh"), rs.getDouble("GiaVe"), rs.getString("HoTenKH"),
                      rs.getString("BienSoXe"));
                    break;
                }
            }
            return vx;
       }
}
