
public class TV extends Product {
	private String type;
	private String resolution;
	private String displaySize;

	public TV(String name, int quantityAvailable, double price, int itemNumber, String type, String resolution,
			String displaySize) {
		super(name, quantityAvailable, price, itemNumber);
		this.type = type;
		this.resolution = resolution;
		this.displaySize = displaySize;
	}

	@Override
	public void findStockValue() {
		setStockValue(getStockValue() * 1.15);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public String toString() {
		return "\nItem Number : " + getItemNumber() + "\nProduct name :" + getName() + "\nQuantity available:"
				+ getQuantityAvailable() + "\nPrice (RM) :" + getPrice() + "\nStock value (RM) :" + getStockValue()
				+ "\nProduct status :" + getStatus() + "\ntype=" + type + "\nresolution=" + resolution
				+ "\ndisplaySize=" + displaySize;
	}

}
