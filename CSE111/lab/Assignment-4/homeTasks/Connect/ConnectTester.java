public class ConnectTester {
  public static void main(String[] args) {
    Student rakib = new Student("Rakib", 12301455, "CSE");
    Student roy = new Student("Roy", 12501345, "CS");
    System.out.println("1*************");
    Connect connectObj = new Connect();
    System.out.println("2*************");
    connectObj.login(rakib);
    System.out.println("3*************");
    connectObj.advising(rakib);
    System.out.println("4*************");
    rakib.email = "rakib@hotmail.com";
    rakib.password = "1234";
    System.out.println("5*************");
    connectObj.login(rakib);
    System.out.println("6*************");
    connectObj.advising(rakib);
    System.out.println("7*************");
    connectObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
    System.out.println("8*************");
    connectObj.advising(rakib, "CSE110", "PHY111", "MAT110");
    System.out.println("9*************");
    connectObj.allAdviseeInfo();
    System.out.println("10*************");
    roy.email = "roy@hotmail.com";
    roy.password = "abcd";
    connectObj.login(roy);
    System.out.println("11*************");
    connectObj.advising(roy, "CSE110", "ENG101", "PHY112");
    System.out.println("12*************");
    connectObj.allAdviseeInfo();
  }
}
