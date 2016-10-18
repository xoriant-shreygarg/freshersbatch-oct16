import java.util.ArrayList;
import java.util.Scanner;
abstract class DessertItem{
	private String flavour;
	private String size;
	private int tax;
	private int stock;
	int cost;
	abstract int getCost();
	public void setFlavour(String flavour){
		this.flavour = flavour;
	}
	public void setSize(String size){
		this.size = size;
	}
	public String getFlavour(){
		return this.flavour;
	}
	public String getSize(){
		return this.size;
	}
	public int getTax(){
		return this.tax;
	}
	public void setTax(int tax){
		this.tax = tax;
	}
	public int getStock(){
		return this.stock;
	}
	public void setStock(int stock){
		this.stock = stock;
	}
}
class Candy extends DessertItem{
	public int getCost(){
		return this.cost*60+this.getTax();
	}
	public Candy(String flavour, String size, int cost, int tax, int stock){
		this.setFlavour(flavour);
		this.setSize(size);
		this.cost = cost;
		this.setTax(tax);
		this.setStock(stock);
	}
	public String toString(){
		return "Product : "+this.getClass().toString().split(" ")[1]+"\nFlavour : "+this.getFlavour()+", Size : "+this.getSize()+", Price : "+((this.cost*60)+this.getTax());
	}
}
class Cookie extends DessertItem{
	public int getCost(){
		return this.cost*70+this.getTax();
	}
	public Cookie(String flavour, String size, int cost, int tax, int stock){
		this.setFlavour(flavour);
		this.setSize(size);
		this.cost = cost;
		this.setTax(tax);
		this.setStock(stock);
	}
	public String toString(){
		return "Product : "+this.getClass().toString().split(" ")[1]+"\nFlavour : "+this.getFlavour()+", Size : "+this.getSize()+", Price : "+((this.cost*70)+this.getTax());
	}
}
class IceCream extends DessertItem{
	public int getCost(){
		return this.cost*1+this.getTax();
	}
	public IceCream(String flavour, String size, int cost, int tax, int stock){
		this.setFlavour(flavour);
		this.setSize(size);
		this.cost = cost;
		this.setTax(tax);
		this.setStock(stock);
	}
	public String toString(){
		return "Product : "+this.getClass().toString().split(" ")[1]+"\nFlavour : "+this.getFlavour()+", Size : "+this.getSize()+", Price : "+((this.cost*1)+this.getTax());
	}
}
class DessertShop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<DessertItem> customerOrder = new ArrayList<>();
		ArrayList<DessertItem> inventory = new ArrayList <>();
		
		inventory.add(new Candy("Mango","Small",2,20,3));
		inventory.add(new Candy("Banana","Medium",1,30,2));
		inventory.add(new Candy("Watermelon","Large",10,120,1));
		inventory.add(new Cookie("Mango","Small",2,20,5));
		inventory.add(new Cookie("Banana","Medium",1,20,10));
		inventory.add(new Cookie("Watermelon","Large",20,20,3));
		inventory.add(new IceCream("Mango","Small",200,20,4));
		inventory.add(new IceCream("Banana","Medium",25,25,1));
		inventory.add(new IceCream("Watermelon","Large",70,120,32));
		
		
		int choice = 1;
		while(choice==1||choice==2){
			System.out.println("\n1. Owner\n2.Customer\nEnter your choice : ");
			choice = Integer.parseInt(sc.next());
			if(choice==1){
				int ownerChoice = 1;
				while(ownerChoice!=4){
				System.out.println("\n1.Candy\n2.Cookie\n3.IceCream\n4.Done\n Enter your choice : ");
				ownerChoice = Integer.parseInt(sc.next());
					if(ownerChoice>=1&&ownerChoice<=3){
						System.out.println("\nEnter flavour : ");
						String flavour = sc.next();
						System.out.println("\nEnter size : ");
						String size = sc.next();
						System.out.println("\nEnter cost : ");
						int cost = Integer.parseInt(sc.next());
						System.out.println("\nEnter tax : ");
						int tax = Integer.parseInt(sc.next());
						System.out.println("\nEnter stock : ");
						int stock = Integer.parseInt(sc.next());
						switch(ownerChoice){
							case 1: inventory.add(new Candy(flavour,size,cost,tax,stock));
								break;
							case 2: inventory.add(new Cookie(flavour,size,cost,tax,stock));
								break;
							case 3: inventory.add(new IceCream(flavour,size,cost,tax,stock));
								break;
						}
					}
				}
			} else if(choice==2){
				int customerChoice = 1;
				while(customerChoice!=4){
					System.out.println("\n1. Candy\n2.Cookie\n3.IceCream\n4.Calculate bill\n Enter your choice : ");
					customerChoice = Integer.parseInt(sc.next());
					ArrayList<Integer> list = new ArrayList<>();
					switch(customerChoice){
						case 1: System.out.println("\n-------Menu-----");
								for(int i=0;i<inventory.size();i++){	
									if(inventory.get(i) instanceof Candy){
										System.out.println("");
										System.out.println(""+(i+1)+". "+inventory.get(i));
										System.out.println("");
										list.add(i);
									}
								}
								System.out.println("\n------------");
								System.out.println("Enter your choice : ");
								int customerChoice2 = Integer.parseInt(sc.next())-1;
								if(list.contains(customerChoice2)){
									if(inventory.get(customerChoice2) instanceof Candy&&inventory.get(customerChoice2).getStock()>0){
										customerOrder.add(inventory.get(customerChoice2));
										inventory.get(customerChoice2).setStock(inventory.get(customerChoice2).getStock()-1);
										System.out.println("\nProduct added.");
									} else {
										System.out.println("\nProduct out of stock.");
									}
								} else {
										System.out.println("\nInvalid input.");
								}
							break;
						case 2: System.out.println("\n-------Menu-----");
								for(int i=0;i<inventory.size();i++){
									if(inventory.get(i) instanceof Cookie){
										System.out.println("");
										System.out.println(""+(i+1)+". "+inventory.get(i));
										System.out.println("");
										list.add(i);
									}
								}
								System.out.println("\n------------");
								System.out.println("Enter your choice : ");
								customerChoice2 = Integer.parseInt(sc.next())-1;
								if(list.contains(customerChoice2)){
									if(inventory.get(customerChoice2) instanceof Cookie&&inventory.get(customerChoice2).getStock()>0){
										customerOrder.add(inventory.get(customerChoice2));
										inventory.get(customerChoice2).setStock(inventory.get(customerChoice2).getStock()-1);
										System.out.println("\nProduct added.");
									} else {
										System.out.println("\nProduct out of stock.");
									}
								} else {
										System.out.println("\nInvalid input.");
								}
							break;
						case 3: System.out.println("\n-------Menu-----");
								for(int i=0;i<inventory.size();i++){
									if(inventory.get(i) instanceof IceCream){
										System.out.println("");
										System.out.println(""+(i+1)+". "+inventory.get(i));
										System.out.println("");
										list.add(i);
									}
								}
								System.out.println("\n------------");
								System.out.println("Enter your choice : ");
								customerChoice2 = Integer.parseInt(sc.next())-1;
								if(list.contains(customerChoice2)){
									if(inventory.get(customerChoice2) instanceof IceCream&&inventory.get(customerChoice2).getStock()>0){
										customerOrder.add(inventory.get(customerChoice2));
										inventory.get(customerChoice2).setStock(inventory.get(customerChoice2).getStock()-1);
										System.out.println("\nProduct added.");
									} else {
										System.out.println("\nProduct out of stock.");
									}
								} else {
										System.out.println("\nInvalid input.");
								}
							break;
						case 4: System.out.println("\n\n\nTotal bill : "+getTotalBill(customerOrder)); 
						System.exit(0);break;
					}
				}
			}
		}
	}
	public static int getTotalBill(ArrayList<DessertItem> customerOrder){
			int totalBill = 0;
			System.out.println("\n\n******BILL******\n\n");
			for(int i=0;i<customerOrder.size();i++){
					System.out.println("\n\n"+customerOrder.get(i)+"\n\n");
					totalBill += customerOrder.get(i).getCost();
			}
			return totalBill;
		}
}