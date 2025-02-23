package game;

public class Key extends Item {
    public Key(String name, String description, String inspection) {
        super(name, description, inspection);
    }

    @Override
    public void use() {
        this.setUsed(true); // used!
        System.out.println("You use the key to unlock the door.");
    }
}
