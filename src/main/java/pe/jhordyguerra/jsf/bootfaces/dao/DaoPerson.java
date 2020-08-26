package pe.jhordyguerra.jsf.bootfaces.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import pe.jhordyguerra.jsf.bootfaces.model.Person;
//
///**
// *
// * @author jhordycaceres
// */
//public class DaoPerson extends DBConnection {
//
//    public void create(Person model) throws Exception {
//        final String sql = "INSERT INTO persona"
//                + " (firstName ,lastName ,idCard ,gender ,cellphone ,email ,country)"
//                + " VALUES (? ,? ,? ,? ,? ,? ,?)";
//        try (java.sql.Connection conn = this.connect()) {
//            try {
//                try (PreparedStatement ps = conn.prepareStatement(sql)) {
//                    ps.setString(1, model.getFirstName());
//                    ps.setString(2, model.getLastName());
//                    ps.setString(3, model.getIdCard());
//                    ps.setString(4, model.getGender());
//                    ps.setString(5, model.getCellphone());
//                    ps.setString(6, model.getEmail());
//                    ps.setString(7, model.getCountry());
//
//                    ps.executeUpdate();
//                    ps.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace(System.out);
//                conn.rollback();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        }
//    }
//
//    public void edit(Person model) throws Exception {
//        final String sql = "UPDATE persona SET "
//                + "firstName = ? ,lastName = ? ,idCard = ? ,gender = ? "
//                + ",cellphone = ? ,email = ? ,country = ? WHERE id = ?;";
//        try (java.sql.Connection conn = this.connect()) {
//            try {
//                try (PreparedStatement ps = conn.prepareStatement(sql)) {
//                    ps.setString(1, model.getLastName());
//                    ps.setString(2, model.getIdCard());
//                    ps.setString(3, model.getGender());
//                    ps.setString(4, model.getCellphone());
//                    ps.setString(5, model.getEmail());
//                    ps.setString(6, model.getCountry());
//                    ps.setString(7, model.getFirstName());
//                    ps.executeUpdate();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace(System.out);
//                conn.rollback();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        }
//    }
//
//    public void delete(Person model) throws Exception {
//        final String sql = "UPDATE PERSONAS.PERSONA SET ESTPER='I' WHERE IDPER=?";
//
//        try (java.sql.Connection conn = this.connect()) {
//            try {
//                try (PreparedStatement ps = conn.prepareStatement(sql)) {
//                    ps.setLong(1, model.getId());
//                    ps.executeUpdate();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace(System.out);
//                conn.rollback();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        }
//    }
//
//    public List<Person> list() {
//        final String sql = "SELECT * FROM persona;";
//        List<Person> list = new ArrayList<>();
//        Person model;
//        try (Connection conn = this.connect();) {
//            try {
//                System.out.println(conn);
//                try (ResultSet rs = conn.createStatement().executeQuery(sql);) {
//                    while (rs.next()) {
//                        model = new Person();
//                        model.setId(rs.getLong("id"));
//                        model.setIdCard(rs.getString("idCard"));
//                        model.setFirstName(rs.getString("firstName"));
//                        model.setLastName(rs.getString("lastName"));
//                        model.setGender(rs.getString("gender"));
//                        model.setCellphone(rs.getString("cellphone"));
//                        model.setEmail(rs.getString("email"));
//                        model.setCountry(rs.getString("country"));
//                        list.add(model);
//                    }
//                }
//            } catch (Exception e) {
//                conn.rollback();
//                e.getMessage();
//            }
//
//        } catch (SQLException e) {
//            System.out.println("aqui error");
//            e.getMessage();
//        }
//        return list;
//    }
//
//    public List<Person> list2() {
//        final String sql = "SELECT * FROM persona;";
//        List<Person> list = new ArrayList<>();
//        Person model;
//        try (ResultSet rs = connect().createStatement().executeQuery(sql);) {
//            while (rs.next()) {
//                model = new Person();
//                model.setId(rs.getLong("id"));
//                model.setIdCard(rs.getString("idCard"));
//                model.setFirstName(rs.getString("firstName"));
//                model.setLastName(rs.getString("lastName"));
//                model.setGender(rs.getString("gender"));
//                model.setCellphone(rs.getString("cellphone"));
//                model.setEmail(rs.getString("email"));
//                model.setCountry(rs.getString("country"));
//                list.add(model);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoPerson.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//}

public class DaoPerson {

}
