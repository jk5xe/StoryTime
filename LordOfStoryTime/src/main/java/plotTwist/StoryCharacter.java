package plotTwist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class StoryCharacter {
	private String name;
	private CharacterRole role;
	private HashMap<String, Integer> inventory;
	private int money;
	
	public StoryCharacter() {
		this.name = "";
		this.role = CharacterRole.NPC;
		this.inventory = new HashMap<String, Integer>();
		this.money = 100;
	}
	
	public StoryCharacter(String name) {
		this.name = name;
		this.role = CharacterRole.NONDETERMINED;
		this.inventory = new HashMap<String, Integer>();
		this.money = 100;
	}
	public StoryCharacter(String name, CharacterRole role) {
		this.name = name;
		this.role = role;
		this.inventory = new HashMap<String, Integer>();
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

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CharacterRole getRole() {
		return role;
	}
	public void setRole(CharacterRole role) {
		this.role = role;
	}

	public HashMap<String, Integer> getInventory() {
		return this.inventory;
	}

	public void addToInventory(String item) {
		if (inventory.containsKey(item)) {
			int previousValue = inventory.get(item);
			inventory.replace(item, previousValue+1);
		} else {
			inventory.put(item, 1);
		}
	}
	
	public void addToInventory(String item, int count) {
		if (inventory.containsKey(item)) {
			int previousValue = inventory.get(item);
			inventory.replace(item, previousValue+count);
		} else {
			inventory.put(item, count);
		}
	}

	public int getItemNumber(String item) {
		int value = inventory.get(item);
		return value;
	}

	public String printInventory() {
		StringBuilder stringBuffer = new StringBuilder();
		Iterator<Entry<String, Integer>> iterator = inventory.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			stringBuffer.append(entry.getKey());
			stringBuffer.append(": ");
			stringBuffer.append(entry.getValue());
			stringBuffer.append("\n");
		}
		
		
		return stringBuffer.toString();
	}

	public boolean removeFromInventory(String item) throws InventoryException {
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
	
	
	public boolean  removeFromInventory(String item, int count)  throws InventoryException {
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
