package Gepnaplo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author Fabian Tamas 1.0
 */
public class DB {
    
    private String datumido() {
        String s = LocalDateTime.now().toString();
        return s.substring(0, 10) + " " + s.substring(11, 19);
    }
    
    private String felh() {
        java.net.InetAddress localMachine;
        try {
            localMachine = java.net.InetAddress.getLocalHost();
            return localMachine.getHostName();
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
            return "ismeretlen";
        }
    }
    
    private String IP() {
        try { System.out.println((InetAddress.getLocalHost()).getHostAddress());
            } catch(UnknownHostException e) {}
            return "IP";
        }
    
    public void beir(String iskola, String osztaly, String nev,String allapot) {
        final String dbUrl = "jdbc:mysql://localhost:3306/gepnaplo"
                + "?useUnicode=true&characterEncoding=UTF-8";
        final String user = "tanulo";
        final String pass = "tanulo";
        
        String s = "INSERT INTO gepek (felhasznalo, iskola, osztaly, nev, "
                + "ido, allapot) VALUES (?, ?, ?, ?, ?, ?);";
        
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass)) {
            PreparedStatement ekpar = kapcs.prepareStatement(s);
            ekpar.setString(1, felh());
            ekpar.setString(2, iskola);
            ekpar.setString(3, osztaly);
            ekpar.setString(4, nev);
            ekpar.setString(5, datumido());
            ekpar.setString(6, allapot);
            ekpar.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
   
    public static void main(String[] args) {
        DB ab = new DB();
        System.out.println(ab.datumido());
        System.out.println(ab.felh());
        System.out.println(ab.IP());
        ab.beir("Pofi", "9.D", "Próba Jenő", "Rendben");
        }
}
