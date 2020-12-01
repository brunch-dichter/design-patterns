package pattern.creational.example.maze;

import pattern.creational.example.maze.mapsite.Room;
import pattern.creational.example.maze.mapsite.Door;
import pattern.creational.example.maze.mapsite.Direction;
import pattern.creational.example.maze.mapsite.Wall;

public class Main {
    public static void main(String[] args) {
        Maze maze = createMaze();
        System.out.println("Maze room count : " + maze.getRoomCount());
    }

    private static Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door door = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.North, new Wall());
        room1.setSide(Direction.East, door);
        room1.setSide(Direction.South, new Wall());
        room1.setSide(Direction.West, new Wall());

        room2.setSide(Direction.North, new Wall());
        room2.setSide(Direction.East, new Wall());
        room2.setSide(Direction.South, new Wall());
        room2.setSide(Direction.West, door);

        return maze;
    }
}
