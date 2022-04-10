/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author carlosLopezAmaztalli
 */
public class Metodos_sql {
    public static ConexionDBlogin conexion=new ConexionDBlogin();
    
    public static PreparedStatement setencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero =0;
    
    public int guardar(String nombre ,String apellidos,String correo,String contraseña){
        int resultado=0;
        Connection Conexion=null;
        
        String setencia_guardar =("INSERT INTO usuarios (nombre,apellidos,correo,contraseña) VALUES(?,?,?,?)");
        try{
            Connection cn=conexion.getConnecction(); 
            setencia_Preparada=cn.prepareStatement(setencia_guardar);
            setencia_Preparada.setString(1, nombre);
            setencia_Preparada.setString(2, apellidos);
            setencia_Preparada.setString(3, correo);
            setencia_Preparada.setString(4, contraseña);
            resultado=setencia_Preparada.executeUpdate();
            setencia_Preparada.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return resultado;
        }
        public static String BuscarNombre(String correo){
            String busqueda_nombre=null;
            Connection Conexion=null;
            try{
                Connection cn=conexion.getConnecction(); 
               String sentencia_buscar = ("SELECT nombre,apellidos FROM usuarios WHERE correo = '" + correo + "'");
               setencia_Preparada =cn.prepareStatement(sentencia_buscar);
               resultado= setencia_Preparada.executeQuery();
               if(resultado.next()){
                   String nombre=resultado.getString("nombre");
                   String apellidos=resultado.getString("apellidos");
                   busqueda_nombre=(nombre+" "+apellidos);
                   
                   }
              
               
            }catch(Exception e){
                 System.out.println(e);
            }
            return busqueda_nombre;
        }
        public static String BuscarUsuarioRegistrado(String correo,String contraseña){
            String busqueda_usuario=null;
             Connection Conexion=null;
        try{
            Connection cn=conexion.getConnecction(); 
            String sentencia_buscar_usuario=("SELECT nombre,correo,contraseña FROM usuarios WHERE correo = '" + correo + "' && contraseña = '" + contraseña+ "'");
            setencia_Preparada=cn.prepareStatement(sentencia_buscar_usuario);
            resultado=setencia_Preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario="Usuario encontrado";
            }else{
                busqueda_usuario="Usuario no encontrado";
            }
           
        }catch(Exception e){
                 System.out.println(e);
            }
        return busqueda_usuario;
    }
    
    
}
