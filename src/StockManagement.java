import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StockManagement {

	public static int menuStock() {
            
		Scanner sc = new Scanner(System.in);
                System.out.println("menu stock");
		System.out.println("\n1. View stock\r\n" + "2. Add stock\r\n" + "3. Deduct stock\r\n"
				+ "4. Discontinue a product\r\n" + "0. Exit\r\n" + "Please enter a menu option:"); 
		int choice = sc.nextInt();
		return choice;
	}

	public static void viewStock(Product[] userProduct) {
            System.out.println("HAHAHAHAHA");
            for (int i = 0; i < userProduct.length; i++) {
			System.out.println("\nIndex of Array : " + i);
			System.out.println(userProduct[i]);
		}
	}

	public static void addStock(Product[] product) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Index to add?: ");
		int index = sc.nextInt();
		System.out.println("Current Quantity available :" + product[index].getQuantityAvailable());
		int num;
		do {
			System.out.println("How many add?(0 or above)");
			num = sc.nextInt();
		} while (num <= 0);
		product[index].addQuantityAvailable(num);
	}

	public static void deductStock(Product[] product) {
		Scanner sc = new Scanner(System.in);
		System.out.print("deduct stock");
		System.out.print("Index to deduct?: ");
		int index = sc.nextInt();
		System.out.println("Current Quantity available :" + product[index].getQuantityAvailable());
		int num;
		do {
			System.out.println("How many deduct?(0 or above)");
			num = sc.nextInt();
		} while (!(num >= 0 && num <= product[index].getQuantityAvailable()));
		product[index].deductQuantityAvailable(num);
	}

	public static void changeStatus(Product[] product) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Index to change status?: ");
		int index = sc.nextInt();
		System.out.println("What status to change?");
		System.out.println("1 = Active");
		System.out.println("2 = Discontinue");
		int choice = sc.nextInt();
		if (choice == 1) {
			product[index].setStatus(true);
		} else {
			product[index].setStatus(false);
		}
	}

	public static Product addProduct() {
		Scanner sc = new Scanner(System.in);
		int typeProduct;
		System.out.println("Which one?");
		do {
			System.out.println("1 = Refrigerators");
			System.out.println("2 = TV");
			typeProduct = sc.nextInt();
			sc.nextLine();
			if (!(typeProduct >= 1 && typeProduct <= 2)) {
				System.out.println("Only number 1 or 2 allowed!");
			}
		} while (!(typeProduct >= 1 && typeProduct <= 2));
		Product product;
		if (typeProduct == 1) {/// refri
			// String name, int quantityAvailable, double price, int itemNumber, String
			// doorDesign,String color, String capacity
			System.out.println("Product name : ");
			String name = sc.nextLine();
			System.out.println("Door design : ");
			String doorDesign = sc.nextLine();
			System.out.println("Color : ");
			String color = sc.nextLine();
			System.out.println("Capacity (volume) : ");
			String capacity = sc.nextLine();
			System.out.println("Quantity available : ");
			int quantityAvailable = sc.nextInt();
			System.out.println("Price (RM) : ");
			double price = sc.nextDouble();
			System.out.println("Item number : ");
			int itemNumber = sc.nextInt();
			product = new Refrigerator(name, quantityAvailable, price, itemNumber, doorDesign, color, capacity);
		} else {// tv
			System.out.println("Product name : ");
			String name = sc.nextLine();
			System.out.println("Type(Brand) : ");
			String type = sc.nextLine();
			System.out.println("Resolution (aXb): ");
			String resolution = sc.nextLine();
			System.out.println("Display Size (inch): ");
			String displaySize = sc.nextLine();
			System.out.println("Quantity available : ");
			int quantityAvailable = sc.nextInt();
			System.out.println("Price (RM) : ");
			double price = sc.nextDouble();
			System.out.println("Item number : ");
			int itemNumber = sc.nextInt();
			product = new TV(name, quantityAvailable, price, itemNumber, type, resolution, displaySize);
		}

		return product;
	}

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date)); // current date and time
		System.out.println("Welcome to the SMS"); // prompt welcome message

		StaffInfo user = new StaffInfo();// create user
		System.out.println(user);// display user info

		Scanner in = new Scanner(System.in);
		System.out.println("Max number of product: ");
		int maxProduct = in.nextInt();// get the max product
		Product[] userProduct = new Product[maxProduct];// array for product
		System.out.println("Add product? How many product to store?(0 above, 0 for not add) : ");
		int numProduct = in.nextInt();// num product to input
		if (numProduct == 0) {// 0 not start program
			System.out.println("Exit Program!");
			System.exit(0);
		}
		// menu for add any product
		System.out.println("Add your product");
		for (int i = 0; i < numProduct; i++) {
			userProduct[i] = addProduct();
		}
		int askMenu;
		// main menu
		do {
			askMenu = menuStock();
			switch (askMenu) {
			case 1:
				viewStock(userProduct);
				break;
			case 2:
				addStock(userProduct);
				break;
			case 3:
				deductStock(userProduct);
				break;
			case 4:
				changeStatus(userProduct);
				break;
			case 0:// exit
				askMenu = 0;
				break;
			default:
				System.out.println("Only enter value above only");
				break;
			}
		} while (askMenu != 0);

	}
}
