package pattern.creational.factorymethod.example.maze;

import pattern.creational.factorymethod.example.maze.bombedmaze.BombedMazeFactory;
import pattern.creational.factorymethod.example.maze.mapsite.Direction;
import pattern.creational.factorymethod.example.maze.mapsite.Door;
import pattern.creational.factorymethod.example.maze.mapsite.Room;
import pattern.creational.factorymethod.example.maze.normalmaze.NormalMazeFactory;

public class Main {
    public static void main(String[] args) {
        Maze maze = createMaze();

        System.out.println("Maze name : " + maze.getName());
        System.out.println("Maze room count : " + maze.getRoomCount());
    }

    private static Maze createMaze() {
        NormalMazeFactory normalMazeFactory = new NormalMazeFactory();
        BombedMazeFactory bombedMazeFactory = new BombedMazeFactory();

        Maze maze = normalMazeFactory.makeMaze();

        Room room1 = normalMazeFactory.makeRoom(1);
        Room room2 = bombedMazeFactory.makeRoom(2);
        Door door = normalMazeFactory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.East, door);
        room2.setSide(Direction.West, door);

        return maze;
    }
}
