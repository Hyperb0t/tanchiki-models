package ru.kpfu.itis.rodsher.tanchiki.models;

public enum Direction {
    UP(0),
    DOWN(1),
    LEFT(2),
    RIGHT(3);

    public final Integer index;

    Direction(Integer index) {
        this.index = index;
    }

    public static Direction getFromIndex(Integer index) {
        for(Direction direction : Direction.values()) {
            if(direction.index.equals(index)) {
                return direction;
            }
        }
        return null;
    }
}
