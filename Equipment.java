/* Equipment class
 *
 *
 *
 * */

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

  public int getID() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getDesc() {
    return desc;
  }
  public int getDesc() {
    return cap;
  }
  public void setID(int input) {
    id=input;
  }
  public void getName(String input) {
    name=input;
  }
  public void getDesc(String input) {
    desc=input;
  }
  public void getDesc(String input) {
    cap=input;
  }
  public static
}
