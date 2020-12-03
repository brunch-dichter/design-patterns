package pattern.creational.abstractfactory.example.maze;

import pattern.creational.abstractfactory.example.maze.mapsite.Door;
import pattern.creational.abstractfactory.example.maze.mapsite.Room;
import pattern.creational.abstractfactory.example.maze.mapsite.Wall;

public abstract class MazeFactory {
    protected int count;

    public MazeFactory() {
        count++;
    }

    public abstract Maze makeMaze();

    public abstract Room makeRoom();

    public abstract Door makeDoor(Room room1, Room room2);

    public abstract Wall makeWall();
}
