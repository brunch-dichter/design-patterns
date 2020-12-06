package pattern.creational.factorymethod.example.maze.mapsite;

public class Room extends MapSite {
    private int roomNumber;
    private MapSite[] sides;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        sides = new MapSite[4];
    }

    @Override
    public void enter() {
        // TODO: Implement codes of Room's enter behavior.
    }

    public void setSide(Direction direction, MapSite side) {
        sides[direction.getValue()] = side;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public MapSite getSide(Direction direction) {
        return sides[direction.getValue()];
    }
}
