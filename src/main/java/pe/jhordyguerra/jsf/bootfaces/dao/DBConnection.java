package pe.jhordyguerra.jsf.bootfaces.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jhordycaceres
 */
public class DBConnection {

    private static final String USR_DB = "root";
    private static final String PWD_DB = "root";
    private static final String URL_DB = "jdbc:mysql://192.168.0.101:3306/test";

    public Connection connect() {
        Connection dbconn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbconn = DriverManager.getConnection(URL_DB, USR_DB, PWD_DB);
            System.out.println(dbconn);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se conecta perro");
            e.printStackTrace();
        }
        return dbconn;
    }

//    public static void main(String[] args) {
//        DaoPerson dao = new DaoPerson();
//        for (Person person : dao.list2()) {
//            System.out.println(person.getFirstName());
//        }
//    }
}
