public class StringBuilderDemo {
   public static void main(String[] a){
      
      StringBuilder nameString = new StringBuilder("Barbara");
      System.out.print("\n(StringBuilder 1) nameString: " + nameString);
      System.out.print("\nCapacity of nameString is: " + nameString.capacity());
      
      StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");
      System.out.print("\n(StringBuilder 2) addressString: " + addressString);
      System.out.print("\nCapcity of addresstring is: " + addressString.capacity());
      
      nameString.setLength(20);
      System.out.print("\n(Length set to 20 for StringBuilder 1) The name is " + nameString + "                   end");
      
      addressString.setLength(20);
      System.out.print("\n(Length set to 20 for StringBuilder 2) The address is " + addressString);
      
      
   }
}