/*
Author: Joungho Seo
ISTE-330
Professor Stephen Zilora
2/13/2020
*/
public class JounghoSeoPE03 {

/**
    *main method for testing
    */
   public static void main(String[] args) {
     //3.a
      Equipment testEquip = new Equipment();
      testEquip.setID(894); // bus 264
      testEquip.fetch();
      testEquip.printInfo();
      
      //3.b
      Equipment test2 = new Equipment(3141, "pi", "constant", 2);
      test2.put();
      //3.c
      test2.setCap(2);
      test2.put();
      //3.d 
      test2.fetch();
      //3.e
      test2.delete();
   }
}