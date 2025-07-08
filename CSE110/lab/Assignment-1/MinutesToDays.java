public class MinutesToDays{
   public static void main(String [] args){
      int minutes = 3456789;
      int days = minutes/(60*24);
      System.out.println(minutes + " minutes is approximately " + days/365 + " years " + days%365 + " days.");
   }
}
