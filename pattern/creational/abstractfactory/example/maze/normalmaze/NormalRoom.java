package pattern.creational.abstractfactory.example.maze.normalmaze;

import pattern.creational.abstractfactory.example.maze.mapsite.Direction;
import pattern.creational.abstractfactory.example.maze.mapsite.Room;

public class NormalRoom extends Room {
    public NormalRoom(int roomNumber) {
        super(roomNumber);
        this.setSide(Direction.North, new NormalWall());
        this.setSide(Direction.East, new NormalWall());
        this.setSide(Direction.South, new NormalWall());
        this.setSide(Direction.West, new NormalWall());
    }

    @Override
    public void enter() {
        // TODO: Implement codes of normal Room's enter behavior.
    }
}
