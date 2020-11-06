/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMSProjectForms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AmeerHamza
 */
public class Connections {
    
    static Connection cn;
    static Statement st;
    
   public static void Connections() throws SQLException
    {
        try{
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          String url = "jdbc:sqlserver://DESKTOP-Q9R5UBU\\awan;databaseName=IMSP";
          cn = DriverManager.getConnection(url,"sa","123");
          st=cn.createStatement();
        }catch(ClassNotFoundException ex){}
    }
    
}
