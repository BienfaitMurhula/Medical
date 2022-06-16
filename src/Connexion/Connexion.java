/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author BIENFAIT
 */
public class Connexion {
    
    static Connection cx;
    public static String url;
    public static String user;
    public static String pass;
    public static String database;
    
    public static Connection con() {
        try {
            cx = DriverManager.getConnection("jdbc:sqlserver://BIENFAIT\\sa;databaseName=medicale", "SA", "b");
//            cx = DriverManager.getConnection(url,user,pass);
//            JOptionPane.showMessageDialog(null, "cool");
        } catch (SQLException e) {
            System.out.println("erreur" + e);
        }
        return cx;
    }
}
