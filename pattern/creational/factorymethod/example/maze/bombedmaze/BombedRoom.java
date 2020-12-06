package pattern.creational.factorymethod.example.maze.bombedmaze;

import pattern.creational.factorymethod.example.maze.mapsite.Direction;
import pattern.creational.factorymethod.example.maze.mapsite.Room;
import pattern.creational.factorymethod.example.maze.normalmaze.NormalWall;

public class BombedRoom extends Room {
    private boolean isBombed;

    public BombedRoom(int roomNumber, boolean isBombed) {
        super(roomNumber);
        this.isBombed = isBombed;
        this.setSide(Direction.North, new NormalWall());
        this.setSide(Direction.East, new NormalWall());
        this.setSide(Direction.South, new NormalWall());
        this.setSide(Direction.West, new NormalWall());
    }

    public boolean isBombed() {
        return isBombed;
    }

    @Override
    public void enter() {
        // TODO: Implement codes of bombed Room's enter behavior.
    }
}
