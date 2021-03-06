package pattern.creational.factorymethod.example.maze.enchantedmaze;

import pattern.creational.factorymethod.example.maze.mapsite.Direction;
import pattern.creational.factorymethod.example.maze.mapsite.Room;
import pattern.creational.factorymethod.example.maze.normalmaze.NormalWall;

public class EnchantedRoom extends Room {
    private String enchantedEffect;

    public EnchantedRoom(int roomNumber, String enchantedEffect) {
        super(roomNumber);
        this.enchantedEffect = enchantedEffect;
        this.setSide(Direction.North, new NormalWall());
        this.setSide(Direction.East, new NormalWall());
        this.setSide(Direction.South, new NormalWall());
        this.setSide(Direction.West, new NormalWall());
    }

    @Override
    public void enter() {
        // TODO: Implement codes of Enchanted Room's enter behavior.
    }

    public String getEnchantedEffect() {
        return enchantedEffect;
    }
}
