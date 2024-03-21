//package info.dvad.test;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import static org.testng.Assert.fail;
//
//public class DatabaseSteps {
//    static Connection connection;
//
//    final static String username = "root";
//    final static String password = "12345777";
//    final static String url = "jdbc:mysql://localhost:3306/newshop";
//
//    @Before
//    public void initDatabase() {
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//        } catch (SQLException e) {
//            fail("Not able to open MySQL connection for " + url + " using '" + username + "' account: " + e.getMessage());
//        }
//    }
//
//    @After
//    public void closeDatabase() {
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            fail("Not able to close MySQL connection for " + url + " using '" + username + "' account: " + e.getMessage());
//        }
//    }
//
//    @And("getting name of the user with id {string}")
//    public void gettingNameOfTheUserWithId(String userId) {
//        String q = String.format("SELECT username FROM users WHERE id=%s;", userId);
//        try ( Statement st = connection.createStatement() ) {
//            ResultSet rs = st.executeQuery(q);
//            while (rs.next()) {
//                System.out.println("***: " + rs.getString(1));
//            }
//        } catch (SQLException e) {
//            fail("SQL Error: " + e.getMessage());
//        }
//    }
//
//    @And("preparing name of the user with id {string}")
//    public void preparingNameOfTheUserWithId(String userId) {
//        String q = "SELECT username FROM users WHERE id=?";
//        try (PreparedStatement pst = connection.prepareStatement(q)) {
//            pst.setString(1, userId);
//            ResultSet rs = pst.executeQuery();
//            while (rs.next()) {
//                System.out.println("*****: " + rs.getString(1));
//            }
//        } catch (SQLException e) {
//            fail("SQL Error: " + e.getMessage());
//        }
//    }
//
//    @And("update nam of the user with id {string}")
//    public void updateNamOfTheUserWithId(String userId) {
//        String newName = String.valueOf(System.currentTimeMillis());
//        String q = String.format("UPDATE users SET username='%s' WHERE id=%s", newName, userId);
//        try (PreparedStatement pst = connection.prepareStatement(q)) {
//            int num = pst.executeUpdate(q);
//            System.out.println("Affected rows: " + num);
//        } catch (SQLException e) {
//            fail("SQL Error: " + e.getMessage());
//        }
//    }
//}
