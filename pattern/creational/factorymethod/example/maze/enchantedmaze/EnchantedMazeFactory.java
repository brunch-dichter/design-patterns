package pattern.creational.factorymethod.example.maze.enchantedmaze;

import pattern.creational.factorymethod.example.maze.Maze;
import pattern.creational.factorymethod.example.maze.mapsite.Door;
import pattern.creational.factorymethod.example.maze.mapsite.Room;
import pattern.creational.factorymethod.example.maze.normalmaze.NormalMazeFactory;

public class EnchantedMazeFactory extends NormalMazeFactory {
    @Override
    public Maze makeMaze() {
        return new Maze("enchanted");
    }

    @Override
    public Room makeRoom(int n) {
        return new EnchantedRoom(n, "abracadabra");
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new EnchantedDoor(room1, room2, "abracadabra");
    }
}
