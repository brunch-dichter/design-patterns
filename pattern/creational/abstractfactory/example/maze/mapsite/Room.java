package pattern.creational.abstractfactory.example.maze.mapsite;

public abstract class Room extends MapSite {
    private int roomNumber;
    private MapSite[] sides;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        sides = new MapSite[4];
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
