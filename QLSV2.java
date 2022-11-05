/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.qlsv2;

/**
 *
 * @author pc
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author pc
 */
public class QLSV2 {
    public static void main(String[] args) {
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String connectionURL = "jdbc:sqlserver://localhost:1433;trustServerCertificate=true;database=QuanLiSinhVien";
           String username = "vantruong2k2";
           String password = "1";
           Connection con = DriverManager.getConnection(connectionURL, username, password);
           Statement stmt = con.createStatement();
           String sql = "SELECT * FROM SINHVIEN";
            ResultSet rs = stmt.executeQuery(sql);
           
           while(rs.next()) {
               System.out.printf("%10s %10s %10s", rs.getString("MASV"),rs.getString("HOLOT"),rs.getString("TEN"));
               System.out.println();
           }
           
       } catch(Exception e) {
           e.printStackTrace();
       }
    }
}