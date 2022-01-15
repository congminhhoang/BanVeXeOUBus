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
    private String hotenKH;
    private String tenNV;
    private int maNV;

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
    public String getHotenKH() {
        return hotenKH;
    }

    /**
     * @param hotenKH the hotenKH to set
     */
    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    /**
     * @return the tenNV
     */
    public String getTenNV() {
        return tenNV;
    }

    /**
     * @param tenNV the tenNV to set
     */
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    /**
     * @return the maNV
     */
    public int getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }
    public VeXe(){
        
    }

    public VeXe(int maVe, String chuyenXe, Time gioKhoiHanh, Date ngayKhoiHanh, double giaVe, String hotenKH, String tenNV, int maNV) {
        this.maVe = maVe;
        this.chuyenXe = chuyenXe;
        this.gioKhoiHanh = gioKhoiHanh;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.giaVe = giaVe;
        this.hotenKH = hotenKH;
        this.tenNV = tenNV;
        this.maNV = maNV;
    }
    
}
