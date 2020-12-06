package pattern.creational.factorymethod.example.maze.bombedmaze;

import pattern.creational.factorymethod.example.maze.Maze;
import pattern.creational.factorymethod.example.maze.mapsite.Room;
import pattern.creational.factorymethod.example.maze.normalmaze.NormalMazeFactory;

public class BombedMazeFactory extends NormalMazeFactory {
    @Override
    public Maze makeMaze() {
        return new Maze("bombed");
    }

    @Override
    public Room makeRoom(int n) {
        return new BombedRoom(n, true);
    }
}
