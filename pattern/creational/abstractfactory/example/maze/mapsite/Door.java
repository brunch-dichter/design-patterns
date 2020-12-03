package pattern.creational.abstractfactory.example.maze.mapsite;

public abstract class Door extends MapSite {
    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room otherSideRoom(Room room) {
        return room.equals(room1) ? room2 : room1;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean getIsOpen() {
        return isOpen;
    }
}
