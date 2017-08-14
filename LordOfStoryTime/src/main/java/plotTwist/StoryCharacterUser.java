package plotTwist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class StoryCharacterUser extends StoryCharacter {
	private HashMap<InventoryItem, Integer> inventory;
	private int money;
	
	public StoryCharacterUser() {
		super("", CharacterRole.NONDETERMINED);
		this.inventory = new HashMap<InventoryItem, Integer>();
		this.money = 100;
	}
	
	public StoryCharacterUser(String name) {
		super(name, CharacterRole.NONDETERMINED);
		this.inventory = new HashMap<InventoryItem, Integer>();
		this.money = 100;
	}
	public StoryCharacterUser(String name, CharacterRole role) {
		super(name, role);
		this.inventory = new HashMap<InventoryItem, Integer>();
		this.money = 100;
	}
	
	public StoryCharacterUser(String name, CharacterRole role, Health health) {
		super(name, role, health);
		this.inventory = new HashMap<InventoryItem, Integer>();
		this.money = 100;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int amount) {
		this.money += amount;
	}
	
	public void removeMoney(int amount) throws StoryException{
		if(getMoney() >= amount) {
			this.money -= amount;
		} else {
			throw new StoryException("You do not have enough Money!");
		}
	}

	public HashMap<InventoryItem, Integer> getInventory() {
		return this.inventory;
	}

	public void addToInventory(InventoryItem item) {
		if (inventory.containsKey(item)) {
			int previousValue = inventory.get(item);
			inventory.replace(item, previousValue+1);
		} else {
			inventory.put(item, 1);
		}
	}
	
	public void addToInventory(InventoryItem item, int count) {
		if (inventory.containsKey(item)) {
			int previousValue = inventory.get(item);
			inventory.replace(item, previousValue+count);
		} else {
			inventory.put(item, count);
		}
	}

	public int getItemNumber(InventoryItem item) {
		int value = inventory.get(item);
		return value;
	}

	public String printInventory() {
		StringBuilder stringBuffer = new StringBuilder();
		Iterator<Entry<InventoryItem, Integer>> iterator = inventory.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<InventoryItem, Integer> entry = iterator.next();
			stringBuffer.append(entry.getKey());
			stringBuffer.append(": ");
			stringBuffer.append(entry.getValue());
			stringBuffer.append("\n");
		}
		
		
		return stringBuffer.toString();
	}

	public boolean removeFromInventory(InventoryItem item) throws InventoryException {
		if (inventory.containsKey(item)) {
			int previousValue = inventory.get(item);
			if(previousValue >= 1) {
				inventory.replace(item, previousValue-1);
			} else {
				throw new InventoryException(item, previousValue, 1);
			}
			return true;
		} else return false;
	}
	
	
	public boolean  removeFromInventory(InventoryItem item, int count)  throws InventoryException {
		if (inventory.containsKey(item)) {
			int previousValue = inventory.get(item);
			if(previousValue >= count) {
				inventory.replace(item, previousValue-count);
			} else {
				throw new InventoryException(item, previousValue, count);
			}
			return true;
		} else return false;
	}

	
	
}
