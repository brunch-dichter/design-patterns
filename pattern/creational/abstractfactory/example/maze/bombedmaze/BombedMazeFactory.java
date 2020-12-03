package pattern.creational.abstractfactory.example.maze.bombedmaze;

import pattern.creational.abstractfactory.example.maze.Maze;
import pattern.creational.abstractfactory.example.maze.MazeFactory;
import pattern.creational.abstractfactory.example.maze.mapsite.Door;
import pattern.creational.abstractfactory.example.maze.mapsite.Room;
import pattern.creational.abstractfactory.example.maze.mapsite.Wall;
import pattern.creational.abstractfactory.example.maze.normalmaze.NormalDoor;
import pattern.creational.abstractfactory.example.maze.normalmaze.NormalWall;

public class BombedMazeFactory extends MazeFactory {
    @Override
    public Maze makeMaze() {
        return new Maze("boomed");
    }

    @Override
    public Room makeRoom() {
        return new BombedRoom(this.count++, true);
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
