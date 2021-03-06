/**
Author: Joungho Seo
ISTE-330
Professor Stephen Zilora
2/13/2020
*/
import java.sql.*;
import java.util.*;


public class MySQLDatabase {
   private static String URL = "jdbc:mysql://simon.ist.rit.edu/networx_ser";
   private static String uID = "330User";
   private static String pass = "330Password";
   private static Connection connect;

    /**
     * This method attempts to connect to the database
     * @param none
     * @return the connection class
     * @exception print out any exception encountered
     *
     */
   public static boolean getConnection() {
      try {
         Class.forName("com.mysql.jdbc.Driver");
         connect = DriverManager.getConnection(URL, uID, pass);
         return true; //Connection Successful
      } catch (SQLException se) {
         System.out.println(se.toString());
         return false; //Connection Failed
      } catch (ClassNotFoundException ce) {
         System.out.println(ce.toString());
         return false; //Connection Failed
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
/**
     * This method gets the data from the db
     * @param sql statement and int for number of fields
     * @return Arraylist of an arraylist of strings
     *
     */
   public static ArrayList<ArrayList<String>> getData(String sqlCommand, int numFields) {
      ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();
      try{
         Statement st = connect.createStatement();
         ResultSet result = st.executeQuery (sqlCommand);
        
         while (result.next()) {
            ArrayList<String> inner = new ArrayList<String>();
            for (int i=0;i<numFields;i++){
               inner.add(result.getString(i));
               System.out.println(result.getString(i));
            }
            outer.add(inner);
            
         }
      } catch (SQLException se) {
         System.out.println(se.toString());
      } catch(Exception e) {
         System.out.println(e.toString());
      }
      return outer;
   }
/**
     * This method runs sql statement that sets/update/delete data
     * @param sql command in string
     * @return how many records were updated/deleted/selected
     *
     */
   public static int setData(String sqlCommand){
      try {
         Statement st = connect.createStatement();
         return st.executeUpdate(sqlCommand);
      } catch (SQLException se) {
         System.out.println(se.toString());
         return -1;
      } catch(Exception e) {
         System.out.println(e.toString());
         return -1;
      }
   
   
   }






}
