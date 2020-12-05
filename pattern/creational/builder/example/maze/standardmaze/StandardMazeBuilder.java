package pattern.creational.builder.example.maze.standardmaze;

import pattern.creational.builder.example.maze.Maze;
import pattern.creational.builder.example.maze.MazeBuilder;
import pattern.creational.builder.example.maze.mapsite.Direction;
import pattern.creational.builder.example.maze.mapsite.Door;
import pattern.creational.builder.example.maze.mapsite.Room;
import pattern.creational.builder.example.maze.normalmaze.NormalDoor;
import pattern.creational.builder.example.maze.normalmaze.NormalRoom;
import pattern.creational.builder.example.maze.normalmaze.NormalWall;

public class StandardMazeBuilder implements MazeBuilder {
    private Maze currentMaze;

    @Override
    public void BuildMaze() {
        currentMaze = new Maze("standard");
    }

    @Override
    public void BuildRoom(int n) {
        if (currentMaze.getRoom(n) == null) {
            return;
        }
        Room room = new NormalRoom(n);
        currentMaze.addRoom(room);

        room.setSide(Direction.North, new NormalWall());
        room.setSide(Direction.South, new NormalWall());
        room.setSide(Direction.East, new NormalWall());
        room.setSide(Direction.West, new NormalWall());
    }

    @Override
    public void BuildDoor(int roomFrom, int roomTo) {
        Room room1 = currentMaze.getRoom(roomFrom);
        Room room2 = currentMaze.getRoom(roomTo);
        Door door = new NormalDoor(room1, room2);

        room1.setSide(commonWall(room1, room2), door);
        room2.setSide(commonWall(room2, room1), door);
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    private Direction commonWall(Room room1, Room room2) {

        return null;
    }
}
