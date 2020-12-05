package pattern.creational.builder.example.maze;

import pattern.creational.builder.example.maze.countingmaze.CountingMazeBuilder;
import pattern.creational.builder.example.maze.standardmaze.StandardMazeBuilder;

public class Main {
    public static void main(String[] args) {
        String mazeType = "standard";

        Maze maze;
        switch (mazeType) {
            case "complexity":
                maze = createComplexMaze(new StandardMazeBuilder());
                break;
            case "counting":
                maze = createMaze(new CountingMazeBuilder());
                break;
            case "standard":
            default:
                maze = createMaze(new StandardMazeBuilder());
                break;
        }

        System.out.println("Maze name : " + maze.getName());
    }

    private static Maze createMaze(MazeBuilder builder) {
        builder.BuildMaze();

        builder.BuildRoom(1);
        builder.BuildRoom(2);
        builder.BuildDoor(1, 2);

        return builder.getMaze();
    }

    private static Maze createComplexMaze(MazeBuilder builder) {
        for (int i = 0; i < 100; i++) {
            builder.BuildRoom(i);
        }

        return builder.getMaze();
    }
}
