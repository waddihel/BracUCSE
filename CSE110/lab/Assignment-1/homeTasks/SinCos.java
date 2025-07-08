public class SinCos{
   public static void main(String [] args){
      double a = 4.5;
      double b = 9.5;
      double c = Math.sqrt(a*a+b*b);

      double sinA = a/c;
      double cosA = b/c;

      double sinB = b/c;
      double cosB = a/c;

      System.out.println("SinA = " + sinA +"; CosA = " + cosA);
      System.out.println("SinB = " + sinB +"; CosB = " + cosB);
   }
}
