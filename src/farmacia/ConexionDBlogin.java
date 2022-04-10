/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carlosLopezAmaztalli
 */
public class ConexionDBlogin {
    public String bd="login_bd";
    public String login="root";
    public String password="1234";
    Connection con=null;
    
    public ConexionDBlogin() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+bd,login,password);
            if(con!=null){
                
            }
        }catch(SQLException|ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public Connection getConnecction(){
        return con;
    }
    public void desconectar(){
        con=null;
    }
    
}
