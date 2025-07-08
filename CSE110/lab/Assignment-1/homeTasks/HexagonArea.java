public class HexagonArea{
   public static void main(String [] args){
      int a = 8;
      int b = 3;

      double side = Math.sqrt((a*a)/4+b*b);

      double area = (3*Math.sqrt(3)*side*side)/2;

      double circumference = side*6;

      System.out.println("The area of the hexagon is: " + area);
      System.out.println("The circumference of the hexagon is: " + circumference);

   }
}
