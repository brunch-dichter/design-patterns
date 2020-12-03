package pattern.creational.abstractfactory.example.maze.enchantedmaze;

import pattern.creational.abstractfactory.example.maze.Maze;
import pattern.creational.abstractfactory.example.maze.MazeFactory;
import pattern.creational.abstractfactory.example.maze.mapsite.Door;
import pattern.creational.abstractfactory.example.maze.mapsite.Room;
import pattern.creational.abstractfactory.example.maze.mapsite.Wall;
import pattern.creational.abstractfactory.example.maze.normalmaze.NormalWall;

public class EnchantedMazeFactory extends MazeFactory {
    private String secretSpell;
    private String enchantedEffect;

    public EnchantedMazeFactory(String enchantedEffect) {
        secretSpell = "abracadabra";
        this.enchantedEffect = enchantedEffect;
    }

    @Override
    public Maze makeMaze() {
        return new Maze("enchanted");
    }

    @Override
    public Room makeRoom() {
        return new EnchantedRoom(this.count++, enchantedEffect);
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new EnchantedDoor(room1, room2, secretSpell);
    }

    @Override
    public Wall makeWall() {
        return new NormalWall();
    }
}
