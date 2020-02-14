/*
Author: Joungho Seo
ISTE-330
Professor Stephen Zilora
2/5/2020
*/
public class JounghoSeoPE02 {
/**
    * This converts boolean into string for success/failed
    * @param boolean of the test
    * @return the string successful or failure depending on boolean
    *
    */
   public static String test(boolean result){
      if (result==true) {
         return "successful";
      }
      else {
         return "failed";
      }
   }
/**
    *main method for testing
    */
   public static void main(String[] args) {
      SQLServerDatabase SQLTest = new SQLServerDatabase();
      MySQLDatabase MySQLTest = new MySQLDatabase();
      System.out.println("Connection Test for SQL "+test(SQLTest.getConnection()));
      System.out.println("Closing Connection for SQL "+test(SQLTest.terminateConnection()));
      System.out.println("Connection Test for MySQL "+test(MySQLTest.getConnection()));
      System.out.println("Closing Connection for MySQL "+test(MySQLTest.terminateConnection()));
   }
}