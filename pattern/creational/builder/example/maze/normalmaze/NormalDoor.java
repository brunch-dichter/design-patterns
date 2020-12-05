package pattern.creational.builder.example.maze.normalmaze;

import pattern.creational.builder.example.maze.mapsite.Door;
import pattern.creational.builder.example.maze.mapsite.Room;

public class NormalDoor extends Door {
    public NormalDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    public void enter() {
        // TODO: Implement codes of normal Door's enter behavior.
    }
}
