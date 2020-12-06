package pattern.creational.factorymethod.example.maze.mapsite;

public enum Direction {
    North(0), South(1), East(2), West(3);

    private int value;

    Direction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
