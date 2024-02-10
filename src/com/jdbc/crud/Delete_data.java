package com.jdbc.crud;
import java.sql.*;
import java.util.*;

public class Delete_data {
    public void Dd(){
        try{
            String url="jdbc:mysql://localhost/Java";
            String name = "";
            String password ="";

            Connection con = DriverManager.getConnection(url,name,password);
            String q ="delete from employee_table where id =?";
            PreparedStatement ps = con.prepareStatement(q);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Employee id ");
            int id = sc.nextInt();

            ps.setInt(1,id);
            ps.executeUpdate();
            ps.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
