
public abstract class Product {
	private String name;// name of the product
	private int quantityAvailable;// quantity in the stock
	private double price;// single product
	private int itemNumber;// to specific the item
	private double stockValue;// total price in stock
	private boolean status;// can add stock or not

	public Product(String name, int quantityAvailable, double price, int itemNumber) {
		this.name = name;
		this.quantityAvailable = quantityAvailable;
		this.price = price;
		this.itemNumber = itemNumber;
		findStockValue();
		status = true;
	}

	public Product() {
		name = null;
		quantityAvailable = 0;
		price = 0;
		itemNumber = 0;
		findStockValue();
		status = true;
	}

	public void findStockValue() {
		stockValue = price * quantityAvailable;
	}

	public void addQuantityAvailable(int num) {
		if (getStatus() == true) {
			quantityAvailable += num;
			findStockValue();
		} else {
			System.out.println("Not allow to add stock to a discontinued product");
		}
	}

	public void deductQuantityAvailable(int num) {
		quantityAvailable -= num;
		findStockValue();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
		findStockValue();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public double getStockValue() {
		return stockValue;
	}

	public void setStockValue(double stockValue) {
		this.stockValue = stockValue;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		return "\nItem Number : " + itemNumber + "\nProduct name :" + name + "\nQuantity available:" + quantityAvailable
				+ "\nPrice (RM) :" + price + "\nStock value (RM) :" + stockValue + "\nProduct status :" + status;
	}
}
