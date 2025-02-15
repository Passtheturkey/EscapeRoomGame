package game;

import java.util.*;

public class Room {
    // this is the logical representation of the "walls" of each room
    private EnumMap<Main.Direction, List<Item>> walls; // map of directions to items. syntax: <key, value>

    // Keeps track of items in separate map not associated with direction
    // This way player can inspect item without specifying direction
    // TODO: Are we adding items to this map after player "discovers" them via look?
    private Map<String, Item> items = new HashMap<>();

    private String name = "Undefined Room Name";

    public Room() {
        walls = new EnumMap<>(Main.Direction.class); // initializes map

        for (Main.Direction direction : Main.Direction.values()) {
            walls.put(direction, new ArrayList<>());
        }
    }

    public void setItem(Main.Direction direction, Item item) {

        List<Item> itemList = walls.get(direction);
        itemList.add(item);
        items.put(item.getName(), item); // adds item to item list
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public List<Item> getItemsAtDirection(Main.Direction direction) {
        return walls.get(direction); // gets items at the specified direction
    }

    public String describeItemsToPlayer(List<Item> items) {
        StringBuilder desc = new StringBuilder();

        // Add each item's description to string.
        for (int i =0; i<items.size(); i++) {
            desc.append(items.get(i).getDescription()).append(" ");
        }
        return desc.toString();
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.put(item.getName().toLowerCase(), item);
    }
}

