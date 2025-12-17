public class Account{
	public static String bankName = "Badda Bank";
	public static int count;
	public static double totalBalance;
	public String name;
	public String location;
	private double balance;

	Account(String n,String l){
		name = n;
		location = l;
		count++;
	}
	public void printInfo(){
		System.out.println("Name: "+name+", address: "+location);
		System.out.println("Balance: "+balance+" Taka");
	}
	public void setBalance(double b){
		balance +=b;
		totalBalance+=b;
	}
	public double getBalance(){
		return balance;
	}

}
