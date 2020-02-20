/* Equipment class
 * ISTE 330
 * Part of PE03
 * Joungho Seo
 * */
import java.util.*;  
public class Equipment {
   private static int id;
   private static String name;
   private static String desc;
   private static int cap;

   Equipment() {
   
   }

   Equipment(int inputID){
      id = inputID;
   }

   Equipment(int inputID, String inputName, String inputDesc, int inputCap){
      id = inputID;
      name = inputName;
      desc = inputDesc;
      cap = inputCap;
   }

   public static int getID() {
      return id;
   }
   public static String getName() {
      return name;
   }
   public static String getDesc() {
      return desc;
   }
   public static int getCap() {
      return cap;
   }
   public static void setID(int input) {
      id=input;
   }
   public static void setName(String input) {
      name=input;
   }
   public static void setDesc(String input) {
      desc=input;
   }
   public static void setCap(int input) {
      cap=input;
   }
   
   public static void printInfo() {
      System.out.println("ID = "+getID());
      System.out.println("Name = "+getName());
      System.out.println("Description = "+getDesc());
      System.out.println("Capacity = "+getName());
   }
   
   public static void fetch() {
      try{
         MySQLDatabase MySQLdb = new MySQLDatabase();
         MySQLdb.getConnection();
         String query ="SELECT * FROM equipment WHERE EquipID ="+id;
         ArrayList<String> output =MySQLdb.getData(query,3).get(0);
         setName(output.get(1));
         setDesc(output.get(2));
         setCap(Integer.parseInt(output.get(3))); //converts string into int and then set it to cap
         MySQLdb.terminateConnection(); 
      } catch (Exception e) {
         System.out.println("No data is retrieved " + e.toString());
      }
   }
   
   public static void put() {
      MySQLDatabase MySQLdb = new MySQLDatabase();
      MySQLdb.getConnection();
      String query = "UPDATE equipment SET EquipmentName ="+getName()+", EquipmentDescription ="+getDesc()+", EquipmentCapacity ="+ getCap() +" WHERE EquipID ="+getID()+";";
      System.out.println(MySQLdb.setData(query)+" records were inserted");
      MySQLdb.terminateConnection();
   }
   
   public static void post() {
      MySQLDatabase MySQLdb = new MySQLDatabase();
      MySQLdb.getConnection();
      String query = "INSERT INTO equipment VALUES ("+getID()+","+getName()+","+getDesc()+","+getCap()+";";
      MySQLdb.setData(query);
      MySQLdb.terminateConnection();
   }
   
   public static void delete() {
      MySQLDatabase MySQLdb = new MySQLDatabase();
      MySQLdb.getConnection();
      String query = "DELETE FROM equipment WHERE equipmentID ="+getID();
      System.out.println(MySQLdb.setData(query)+" records were deleted");
      MySQLdb.terminateConnection();
   }
   
   public static void printSQL() {
      MySQLDatabase MySQLdb = new MySQLDatabase();
      MySQLdb.getConnection();
      String query ="SELECT * FROM equipment WHERE EquipID ="+id;
      ArrayList<ArrayList<String>> get
   
   
   }
}
