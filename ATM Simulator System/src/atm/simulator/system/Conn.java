/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.simulator.system;

import java.sql.*;
import java.util.Properties;

public class Conn {
     Connection c;
     Statement s;
   
     public Conn(){
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             c= DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","avA#ni");
             s= c.createStatement();
             
         }catch(Exception e){
             System.out.println(e);
                  
         }
         
     }
}

