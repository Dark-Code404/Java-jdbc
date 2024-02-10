package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display_data {
    public void disD(){
        try {
            String url = "jdbc:mysql://localhost/";
            String uname = "";
            String pass = "";

            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement s = con.createStatement();

            String q = "select * from employee_table";
            ResultSet rs =s.executeQuery(q);

            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String occ = rs.getString(3);
                int age = rs.getInt(4);
                System.out.println("Employee id : "+id);
                System.out.println("Employee name  : "+name);
                System.out.println("Employee occupation : "+occ);
                System.out.println("Employee age : "+age);

                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        }
}
