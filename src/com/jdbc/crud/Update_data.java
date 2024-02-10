package com.jdbc.crud;
import java.sql.*;
import java.util.*;

public class Update_data {
    public void UD(){
        try {
            String url = "jdbc:mysql://localhost/";
            String uname = "";
            String pass = "";

            Connection con = DriverManager.getConnection(url,uname,pass);

            Scanner sc = new Scanner(System.in);
            String q="update employee_table set name=?,occupation=?, age=? where id =?";
            PreparedStatement ps=con.prepareStatement(q);


            System.out.println("Enter the name");
            String name = sc.nextLine();


            System.out.println("Enter the occupation");
            String occupation = sc.nextLine();



            System.out.println("Enter the age ");
            int age = sc.nextInt();
            System.out.println("Enter the id ");
            int id = sc.nextInt();


            ps.setString(1,name);
            ps.setString(2,occupation);
            ps.setInt(3,age);
            ps.setInt(4,id);

            ps.executeUpdate();
            System.out.println();
            System.out.println("Data is updated");
            ps.close();
            con.close();




        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
