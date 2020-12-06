package pattern.creational.factorymethod.example.maze.normalmaze;

import pattern.creational.factorymethod.example.maze.Maze;
import pattern.creational.factorymethod.example.maze.MazeFactory;
import pattern.creational.factorymethod.example.maze.mapsite.Door;
import pattern.creational.factorymethod.example.maze.mapsite.Room;
import pattern.creational.factorymethod.example.maze.mapsite.Wall;

public class NormalMazeFactory extends MazeFactory {
    @Override
    public Maze makeMaze() {
        return new Maze("normal");
    }

    @Override
    public Room makeRoom(int n) {
        return new NormalRoom(n);
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new NormalDoor(room1, room2);
    }

    @Override
    public Wall makeWall() {
        return new NormalWall();
    }
}
