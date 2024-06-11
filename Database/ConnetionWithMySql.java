/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Java database Connectivity: --------------------------- 1) Register the
 * Driver: ---------------------- By using Class.forName() we can registered the
 * drivers. The Driver class will be available in "com.mysql.jdbc.Driver".
 *
 * 2) Create the Connection: ------------------------- By using
 * DriverManager.getConnection() method, we can create the Connection.
 * getConnection() method accept three parameters.
 *
 * public static final String url="jdbc:mysql://localhost:3306/Vmart"; public
 * static final String user="root"; public static final String pwd="abc123";
 *
 * Connection con = DriverManager.getConnection(url,user,pwd);
 *
 * 3) Create the Statement, PreparedStatement class Object:
 * -------------------------------------------------------- By using
 * con.createStatement() we can create Statement class object. Statement smt =
 * con.createStatement();
 *
 * 4) Execute the SQL Query: ------------------------- From java to sql, we use
 * executeUpdate(). From SQL to java, we use executeQuery(). For both sides, we
 * use execute().
 *
 * smt.executeUpdate("create database Quantum");
 *
 * 5) Close the Connection: ------------------------ After completing the task
 * we need to close the Connection by using close(). con.close().
 *
 *
 *
 */
public class ConnetionWithMySql {

    public static final String url = "jdbc:mysql://localhost:3306/quantum";
    public static final String user = "root";
    public static final String pwd = "123412345";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Reg Successfully");

        } catch (Exception e) {
            System.out.println("Driver not Reg Successfully");
        }
    }

    public static void main(String[] args) {
        try {
//            I don't Have Mysql database, so it gives Exceptions
            Connection con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection created Successfully");

            Statement smt = con.createStatement();
            int i = smt.executeUpdate("create table student(qid int(5) primary key,sname varchar(20))");
//            int i=smt.executeUpdate("insert into student values('101','Amit')");

            if (i > 0) {
                System.out.println("Record created Successfully");
            } else {
                System.out.println("Record not created Successfully");
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Connection not created Successfully");
        }
    }
}
