package plotTwist;

public class InventoryException extends Exception {

	private static final long serialVersionUID = 2L;
	private final InventoryItem item;
	private final int availableItems;
    private final int requiredItems;

	public InventoryException(InventoryItem item, int available, int required) {
		super("Not Enough " + item +" in Inventory. Available : "+available+" but required : "+required);
    	this.availableItems = available;
        this.requiredItems = required;
        this.item = item;
	}
	public int getAvailableItems() {
		return availableItems;
	}

	public int getRequiredItems() {
		return requiredItems;
	}
	public InventoryItem getItem() {
		return item;
	}
}
