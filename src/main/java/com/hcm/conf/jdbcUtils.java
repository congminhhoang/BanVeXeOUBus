/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcm.conf;

import com.qlbv.pojo.VeXe;
import com.qlbv.pojo.Xe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;



/**
 *
 * @author congm
 */
//public class jdbcUtils {
//   private static Connection conn;
//    static{
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    /**
//     * @return the conn
//     */
//    public static Connection getConn() throws SQLException {
//        return DriverManager.getConnection("jdbc:mysql://localhost/quanlyvexe","root","123456789");
//}
public class jdbcUtils {
   private static Connection conn;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @return the conn
     */
    
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/quanlyvexe","root","123456789");
    }

}