//Task 1

public class Toy{
	public String name;
	public int price;

	Toy(String n, int p){
		name = n;
		price = p;
		System.out.println("A new toy has been made!");
	}

	public void showPrice(){
		System.out.printf("price: %d Taka\n",price);
	}

	public void updateName(String n){
		System.out.printf("Changing old name: %s\nnew name: %s\n",name,n);
		name = n;
	}

	public void updatePrice(int p){
		price = p;
	}
}
