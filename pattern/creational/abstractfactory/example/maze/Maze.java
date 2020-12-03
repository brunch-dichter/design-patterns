package pattern.creational.abstractfactory.example.maze;

import java.util.ArrayList;
import java.util.List;

import pattern.creational.abstractfactory.example.maze.mapsite.Room;

public class Maze {
    private String name;
    private int roomCount;
    private List<Room> rooms;

    public Maze(String name) {
        this.name = name;
        roomCount = 0;
        rooms = new ArrayList<Room>();
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room) {
        roomCount++;
        rooms.add(room);
    }

    public int getRoomCount() {
        return roomCount;
    }
}
