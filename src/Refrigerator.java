
public class Refrigerator extends Product {
	private String doorDesign;
	private String color;
	private String capacity;

	public Refrigerator(String name, int quantityAvailable, double price, int itemNumber, String doorDesign,
			String color, String capacity) {
		super(name, quantityAvailable, price, itemNumber);
		this.doorDesign = doorDesign;
		this.color = color;
		this.capacity = capacity;
	}

	@Override
	public void findStockValue() {
		setStockValue(getStockValue() * 1.25);
	}

	public String getDoorDesign() {
		return doorDesign;
	}

	public void setDoorDesign(String doorDesign) {
		this.doorDesign = doorDesign;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "\nItem Number : " + getItemNumber() + "\nProduct name :" + getName() + "\nQuantity available:"
				+ getQuantityAvailable() + "\nPrice (RM) :" + getPrice() + "\nStock value (RM) :" + getStockValue()
				+ "\nProduct status :" + getStatus() + "\ndoorDesign=" + doorDesign + "\ncolor=" + color + "\ncapacity="
				+ capacity;
	}

}
