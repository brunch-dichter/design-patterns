package pattern.creational.abstractfactory.example.maze.bombedmaze;

import pattern.creational.abstractfactory.example.maze.mapsite.Direction;
import pattern.creational.abstractfactory.example.maze.mapsite.Room;
import pattern.creational.abstractfactory.example.maze.normalmaze.NormalWall;

public class BombedRoom extends Room {
    private boolean isBoomed;

    public BombedRoom(int roomNumber, boolean isBoomed) {
        super(roomNumber);
        this.isBoomed = isBoomed;
        this.setSide(Direction.North, new NormalWall());
        this.setSide(Direction.East, new NormalWall());
        this.setSide(Direction.South, new NormalWall());
        this.setSide(Direction.West, new NormalWall());
    }

    @Override
    public void enter() {
        if (isBoomed) {
            // TODO: Implement codes of Bombed Door's enter behavior.
        }
    }
}
