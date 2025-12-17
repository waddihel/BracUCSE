public class BorrowerTester{
  public static void main(String args[]){
    Borrower.bookStatus();
    System.out.println("*********1*********");
    Borrower b1 = new Borrower("Nabila");
    b1.borrowBook("Pather Panchali");
    b1.borrowBook("Anandmath");
    b1.borrowerDetails();
    System.out.println("*********2*********");
    Borrower b2 = new Borrower("Sadia");
    b2.borrowBook("Anandmath");
    b2.borrowBook("Durgesh Nandini");
    b2.borrowBook("Pather Panchali");
    b2.borrowerDetails();
    System.out.println("*********3*********");
  System.out.println(Borrower.remainingBooks("Anandmath")+" copies of Anandmath is remaining.");
    System.out.println("*********4*********");
    Borrower b3 = new Borrower("Anika");
    b3.borrowBook("Anandmath");
    Borrower.bookStatus();
    System.out.println("*********5*********");
    Borrower b4 = new Borrower("Oishi");
    b4.borrowBook("Anandmath");
    b4.borrowBook("Durgesh Nandini");
    b4.borrowerDetails();
  }
}   

public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};

  // Your Code here
  public static void bookStatus(){
	  System.out.println("Available books:");
	  for(int i = 0;i<3;i++){
		  System.out.println(book_name[i]+": "+book_count[i]);
	  }
	  	
  }
}

