/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlsv2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
public class DatabaseHelper {
     public static Connection openConnection() throws Exception {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String connectionURL = "jdbc:sqlserver://localhost:1433;trustServerCertificate=true;database=QuanLiSinhVien";
           String username = "vantruong2k2";
           String password = "1";
           Connection con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
}
