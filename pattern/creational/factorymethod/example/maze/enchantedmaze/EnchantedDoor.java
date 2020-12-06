package pattern.creational.factorymethod.example.maze.enchantedmaze;

import pattern.creational.factorymethod.example.maze.mapsite.Door;
import pattern.creational.factorymethod.example.maze.mapsite.Room;

public class EnchantedDoor extends Door {
    private String secretSpell;

    public EnchantedDoor(Room room1, Room room2, String secretSpell) {
        super(room1, room2);
        this.secretSpell = secretSpell;
    }

    @Override
    public void enter() {
        // TODO: Implement codes of Enchanted Door's enter behavior.
    }

    public boolean tryToOpen(String secretSpell) {
        if (this.secretSpell.equals(secretSpell)) {
            setIsOpen(true);
            return true;
        }
        setIsOpen(false);
        return false;
    }
}
