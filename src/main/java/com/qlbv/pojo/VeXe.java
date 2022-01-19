/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbv.pojo;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author USer
 */
public class VeXe {
    private int maVe;
    private String chuyenXe;
    private Time gioKhoiHanh;
    private Date ngayKhoiHanh;
    private double giaVe;
    private String hoTenKH;
    private String bienSoXe;

    /**
     * @return the maVe
     */
    public int getMaVe() {
        return maVe;
    }

    /**
     * @param maVe the maVe to set
     */
    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    /**
     * @return the chuyenXe
     */
    public String getChuyenXe() {
        return chuyenXe;
    }

    /**
     * @param chuyenXe the chuyenXe to set
     */
    public void setChuyenXe(String chuyenXe) {
        this.chuyenXe = chuyenXe;
    }

    /**
     * @return the gioKhoiHanh
     */
    public Time getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    /**
     * @param gioKhoiHanh the gioKhoiHanh to set
     */
    public void setGioKhoiHanh(Time gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }

    /**
     * @return the ngayKhoiHanh
     */
    public Date getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    /**
     * @param ngayKhoiHanh the ngayKhoiHanh to set
     */
    public void setNgayKhoiHanh(Date ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    /**
     * @return the giaVe
     */
    public double getGiaVe() {
        return giaVe;
    }

    /**
     * @param giaVe the giaVe to set
     */
    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    /**
     * @return the hotenKH
     */
    public String getHoTenKH() {
        return hoTenKH;
    }

    /**
     * @param hotenKH the hotenKH to set
     */
    public void setHoTenKH(String hotenKH) {
        this.hoTenKH = hotenKH;
    }

    public VeXe(){
        
    }

    public VeXe(int maVe, String chuyenXe, Time gioKhoiHanh, Date ngayKhoiHanh, double giaVe, String hotenKH, String bienSo) {
        this.maVe = maVe;
        this.chuyenXe = chuyenXe;
        this.gioKhoiHanh = gioKhoiHanh;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.giaVe = giaVe;
        this.hoTenKH = hotenKH;
        this.bienSoXe = bienSo;
    }

    /**
     * @return the bienSo
     */
    public String getBienSoXe() {
        return bienSoXe;
    }

    /**
     * @param bienSo the bienSo to set
     */
    public void setBienSoXe(String bienSo) {
        this.bienSoXe = bienSo;
    }
}
