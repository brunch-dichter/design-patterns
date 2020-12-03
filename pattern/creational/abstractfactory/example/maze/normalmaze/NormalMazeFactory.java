package pattern.creational.abstractfactory.example.maze.normalmaze;

import pattern.creational.abstractfactory.example.maze.Maze;
import pattern.creational.abstractfactory.example.maze.MazeFactory;
import pattern.creational.abstractfactory.example.maze.mapsite.Door;
import pattern.creational.abstractfactory.example.maze.mapsite.Room;
import pattern.creational.abstractfactory.example.maze.mapsite.Wall;

public class NormalMazeFactory extends MazeFactory {
    @Override
    public Maze makeMaze() {
        return new Maze("normal");
    }

    @Override
    public Room makeRoom() {
        return new NormalRoom(this.count++);
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
