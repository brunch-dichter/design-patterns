package pattern.creational.abstractfactory.example.maze;

import pattern.creational.abstractfactory.example.maze.bombedmaze.BombedMazeFactory;
import pattern.creational.abstractfactory.example.maze.enchantedmaze.EnchantedMazeFactory;
import pattern.creational.abstractfactory.example.maze.normalmaze.NormalMazeFactory;
import pattern.creational.abstractfactory.example.maze.mapsite.Direction;
import pattern.creational.abstractfactory.example.maze.mapsite.Door;
import pattern.creational.abstractfactory.example.maze.mapsite.Room;

public class Main {
    public static void main(String[] args) {
        String mazeType = "boomed";

        Maze maze;
        switch (mazeType) {
            case "enchanted":
                maze = createMaze(new EnchantedMazeFactory("glory"));
                break;
            case "boomed":
                maze = createMaze(new BombedMazeFactory());
                break;
            default:
                maze = createMaze(new NormalMazeFactory());
        }

        System.out.println("Maze name : " + maze.getName());
        System.out.println("Maze room count : " + maze.getRoomCount());
    }

    private static Maze createMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom();
        Room room2 = factory.makeRoom();
        Door door = factory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.East, door);
        room2.setSide(Direction.West, door);

        return maze;
    }
}
