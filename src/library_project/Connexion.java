package library_project;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {
    
    private static String url = "jdbc:sqlite:ProjetJava.db";
    private static Connection connect = null;

    public static Connection Connect() throws ClassNotFoundException, SQLException {

        connect = DriverManager.getConnection(url);

        System.out.println("La connexion à " + url + " a été réalisée avec succès");
        JOptionPane.showMessageDialog(null, "La connexion à " + url + " a été réalisée avec succès");
        return connect;
    }

    public void close() {
        try {
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}