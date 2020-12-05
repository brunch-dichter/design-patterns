package pattern.creational.builder.example.maze;

public interface MazeBuilder {
    public void BuildMaze();

    public void BuildRoom(int room);

    public void BuildDoor(int roomFrom, int roomTo);

    public Maze getMaze();
}
