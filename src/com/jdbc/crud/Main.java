
package com.jdbc.crud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice ;
        do {
            System.out.println("JDBC Operations \n");	
            System.out.println("1. Insert data");
            System.out.println("2. Update data");
            System.out.println("3. Delete data");
            System.out.println("4. Display data");
            System.out.println("5. Exit");
            System.out.println("\nEnter the operation :");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    Insert_data id = new Insert_data();
                    id.ID();
                break;

                case 2 :
                    Update_data ud = new Update_data();
                    ud.UD();
                    break;

                case 3:
                    Delete_data dd=new Delete_data();
                    dd.Dd();
                    break;

                case 4:
                    Display_data DD= new Display_data();
                    DD.disD();
                    break;
                default:
                    System.out.println("Exited\nBye bye");
                    break;






            }
        }while (choice !=5);



    }
}
