/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlsv2;

/**
 *
 * @author pc
 */
public class Student {
    private String maSV;
    private String hoLot;
    private String tenSV;
    private String maLop;
    private String tenLop;
    private String soDienThoai;
    private String email;

    public Student() {
    }

    public Student(String maSV, String hoLot, String tenSV, String maLop, String tenLop, String soDienThoai, String email) {
        this.maSV = maSV;
        this.hoLot = hoLot;
        this.tenSV = tenSV;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoLot() {
        return hoLot;
    }

    public void setHoLot(String hoLot) {
        this.hoLot = hoLot;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
