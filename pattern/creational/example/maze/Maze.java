package pattern.creational.example.maze;

import java.util.ArrayList;
import java.util.List;

import pattern.creational.example.maze.mapsite.Room;

public class Maze {
    private int roomCount;
    private List<Room> rooms;

    public Maze() {
        roomCount = 0;
        rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        roomCount++;
        rooms.add(room);
    }

    public int getRoomCount() {
        return roomCount;
    }
}
