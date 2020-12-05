package pattern.creational.builder.example.maze;

import java.util.HashMap;
import java.util.Map;

import pattern.creational.builder.example.maze.mapsite.Room;

public class Maze {
    private String name;
    private int roomCount;

    private Map<Integer, Room> rooms;

    public Maze(String name) {
        this.name = name;
        roomCount = 0;
        rooms = new HashMap<Integer, Room>();
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room) {
        roomCount++;
        rooms.put(room.getRoomNumber(), room);
    }

    public Room getRoom(int n) {
        if (rooms.containsKey(n)) {
            return rooms.get(n);
        }
        return null;
    }

    public int getRoomCount() {
        return roomCount;
    }
}
