/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbv.pojo;

/**
 *
 * @author USer
 */
public class Xe {
    private String MaChuyenXe;
    private String ChuyenXe;
    private String NoiDi;
    private String NoiDen;
    private String BienSoXe;
    private double GiaVe;

    public Xe() {}

    public Xe(String MaChuyenXe, String ChuyenXe, String NoiDi, String NoiDen, String BienSoXe, double GiaVe) {
        this.MaChuyenXe = MaChuyenXe;
        this.ChuyenXe = ChuyenXe;
        this.NoiDi = NoiDi;
        this.NoiDen = NoiDen;
        this.BienSoXe = BienSoXe;
        this.GiaVe = GiaVe;
    }

    public Xe(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the MaChuyenXe
     */
    public String getMaChuyenXe() {
        return MaChuyenXe;
    }

    /**
     * @param MaChuyenXe the MaChuyenXe to set
     */
    public void setMaChuyenXe(String MaChuyenXe) {
        this.MaChuyenXe = MaChuyenXe;
    }

    /**
     * @return the ChuyenXe
     */
    public String getChuyenXe() {
        return ChuyenXe;
    }

    /**
     * @param ChuyenXe the ChuyenXe to set
     */
    public void setChuyenXe(String ChuyenXe) {
        this.ChuyenXe = ChuyenXe;
    }

    /**
     * @return the NoiDi
     */
    public String getNoiDi() {
        return NoiDi;
    }

    /**
     * @param NoiDi the NoiDi to set
     */
    public void setNoiDi(String NoiDi) {
        this.NoiDi = NoiDi;
    }

    /**
     * @return the NoiDen
     */
    public String getNoiDen() {
        return NoiDen;
    }

    /**
     * @param NoiDen the NoiDen to set
     */
    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    /**
     * @return the BienSoXe
     */
    public String getBienSoXe() {
        return BienSoXe;
    }

    /**
     * @param BienSoXe the BienSoXe to set
     */
    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    /**
     * @return the GiaVe
     */
    public double getGiaVe() {
        return GiaVe;
    }

    /**
     * @param GiaVe the GiaVe to set
     */
    public void setGiaVe(double GiaVe) {
        this.GiaVe = GiaVe;
    }
}
