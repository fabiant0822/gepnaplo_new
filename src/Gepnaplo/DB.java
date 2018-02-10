package Gepnaplo;

import java.net.InetAddress;
import java.net.UnknownHostException;
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
            return "ismeretlen";
        }
   
    public static void main(String[] args) {
        DB ab = new DB();
        System.out.println(ab.datumido());
        System.out.println(ab.felh());
        System.out.println(ab.IP());
        }
}
