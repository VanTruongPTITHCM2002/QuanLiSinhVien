/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlsv2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class StudentDAO {
     public List<Student> getAll() throws Exception {
        List<Student> lstSinhvien = new ArrayList<>();
        String sql = "SELECT * FROM SINHVIEN";
        try (
            Connection con = DatabaseHelper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            

            while (rs.next()) {
                Student sv = new Student();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoLot(rs.getString("Holot"));
                sv.setTenSV(rs.getString("Ten"));
                sv.setMaLop(rs.getString("Malop"));
                sv.setTenLop(rs.getString("Tenlop"));
                String s = rs.getString(6);
                sv.setSoDienThoai(s);
                sv.setEmail(rs.getString("Email"));
                lstSinhvien.add(sv);
            }
            return lstSinhvien;
        }

    }

    public boolean insert(Student stud) throws Exception {
        String sql = "insert into SINHVIEN(MASV,HOLOT,TEN,MALOP,TENLOP,SDT,EMAIL) values (?,?,?,?,?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, stud.getMaSV());
            pstm.setString(2, stud.getHoLot());
            pstm.setString(3, stud.getTenSV());
            pstm.setString(4, stud.getMaLop());
            pstm.setString(5, stud.getTenLop());
            pstm.setString(6, stud.getSoDienThoai());
            pstm.setString(7, stud.getEmail());
            
            return pstm.executeUpdate() > 0;
        }

    }
    
    public boolean update(Student stud) throws Exception {
        String sql = "Update SINHVIEN set HOLOT = ? ,TEN =? ,MALOP =?,TENLOP=?,SDT=?,EMAIL=? where MASV=?";
        try (
                Connection con = DatabaseHelper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(7, stud.getMaSV());
            pstm.setString(1, stud.getHoLot());
            pstm.setString(2, stud.getTenSV());
            pstm.setString(3, stud.getMaLop());
            pstm.setString(4, stud.getTenLop());
            pstm.setString(5, stud.getSoDienThoai());
            pstm.setString(6, stud.getEmail());
            
            return pstm.executeUpdate() > 0;
        }

    }

    public Student findByMaSV(String maSV) throws Exception {
        String sql = "SELECT * FROM SINHVIEN WHERE MASV = ?";
        try (
                Connection con = DatabaseHelper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, maSV);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                Student sv = new Student();
                sv.setMaSV(rs.getString(1));
                sv.setHoLot(rs.getString(2));
                sv.setTenSV(rs.getString(3));
                sv.setMaLop(rs.getString(4));
                sv.setTenLop(rs.getString(5));
                sv.setSoDienThoai(rs.getString(6));
                sv.setEmail(rs.getString(7));
                return sv;
            }
            
            return null;
            
        }

    }

    public boolean delete(String maSV) throws Exception {
        String sql = "delete from SINHVIEN where MASV= ?";
        try (
            Connection con = DatabaseHelper.openConnection();  
            PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, maSV);
            return pstm.executeUpdate() > 0;
            
        }

    }
}
