//Task 2

public class Cart{
	public int cNum;
	public int maxItem = 3;
	public int itemCount = 0;
	public double discount = 0.0;
	public double totalPrice = 0;
	public String [] item = new String [maxItem];
	public double [] price= new double [maxItem];

	public void create_cart(int c){
		cNum = c;
	}

	public void addItem(String i, double p){
		if(itemCount==maxItem)
				System.out.println("You already have 3 items in your cart");
		else{
			item[itemCount] = i;
			price[itemCount] = p;
			totalPrice += p;
			itemCount++;
			System.out.printf("%s added to cart %d\n", i, cNum);
			System.out.printf("You have %d item(s) in your cart now.\n", itemCount);
		}
		
	}

	public void addItem(double p, String i){
		addItem(i,p);
	}

	public void giveDiscount(double d){
		discount = d;
		totalPrice *= ((100-d)/100);
	}

	public void cartDetails(){
		System.out.printf("Your cart(%d) :\n", cNum);

		for(int i = 0;i<itemCount;i++){
			System.out.println(item[i]+" - "+price[i]);
		}

		System.out.println("Discount applied: "+discount+"%");
		System.out.println("Total price: " + totalPrice);
	}
}
