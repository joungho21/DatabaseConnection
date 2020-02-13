/**
Author: Joungho Seo
ISTE-330
Professor Stephen Zilora
2/5/2020
*/
import java.sql.*;



public class SQLServerDatabase {
    private static String URL = "jdbc:sqlserver://theodore.ist.rit.edu;DatabaseName=jobs";
    private static String uID = "330User";
    private static String pass = "330Password";
    private static Connection connect;

    /**
     * This method attempts to connect to the database
     * @param none
     * @return boolean true if successful
     * @exception print out error when failed to connect
     *
     */
    public static boolean getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection(URL, uID, pass);
            return true; //Connection Successful 
        } catch (Exception e) {
            System.out.println(e.toString());
            return false; //Connection Failed
        }
    }
    /**
     * This method closes the connection
     * @param
     * @return whether connection is still alive or not in boolean
     *
     */
    public static boolean terminateConnection() {
        try {
            connect.close();
            return true; //Connection Terminated successfully
        } catch (SQLException e) {
            System.out.println("Termination failed " + e.toString());
            return false;
        }
    }






    public static void main(String[] args) {
        SQLServerDatabase test = new SQLServerDatabase();
        test.getConnection();
        test.terminateConnection();
    }
}