package pattern.creational.factorymethod.example.maze;

import pattern.creational.factorymethod.example.maze.mapsite.Door;
import pattern.creational.factorymethod.example.maze.mapsite.Room;
import pattern.creational.factorymethod.example.maze.mapsite.Wall;

public abstract class MazeFactory {
    public abstract Maze makeMaze();

    public abstract Room makeRoom(int n);

    public abstract Door makeDoor(Room room1, Room room2);

    public abstract Wall makeWall();
}
