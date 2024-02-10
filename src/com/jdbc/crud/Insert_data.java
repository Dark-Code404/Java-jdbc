package com.jdbc.crud;
import java.sql.*;
import java.util.*;

public class Insert_data {
    public void ID(){
        try {
            String url = "jdbc:mysql://localhost/Java";
            String uname = "root";
            String pass = "Yunish@2059";

            Connection con = DriverManager.getConnection(url,uname,pass);

            Scanner sc = new Scanner(System.in);
            String q="insert into employee_table(name,occupation,age,id) values (?,?,?,?)";
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
            ps.setInt(4 ,id);

            int i = ps.executeUpdate();
            if (i>0){
                System.out.println("Data is inserted. ");
            }
            else
                System.out.println("Data is not insearted.");
            System.out.println();

            ps.close();
            con.close();




        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
