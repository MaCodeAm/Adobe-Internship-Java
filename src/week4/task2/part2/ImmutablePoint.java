package week4.task2.part2;

import java.util.Objects;

public class ImmutablePoint implements Point {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint immutablePoint) {
        this(immutablePoint.getX(), immutablePoint.getY());
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    public Point shiftLeft(ImmutablePoint immutablePoint) {
        return new ImmutablePoint(immutablePoint.getX() - 1, immutablePoint.getY());
    }

    public Point shiftRight(ImmutablePoint immutablePoint) {
        return new ImmutablePoint(immutablePoint.getX() + 1, immutablePoint.getY());
    }

    public Point shiftUp(ImmutablePoint immutablePoint) {
        return new ImmutablePoint(immutablePoint.getX(), immutablePoint.getY() + 1);
    }

    public Point shiftDown(ImmutablePoint immutablePoint) {
        return new ImmutablePoint(immutablePoint.getX(), immutablePoint.getY() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        ImmutablePoint point = (ImmutablePoint) o;
        return this.getX() == point.getX() && this.getY() == point.getY();
    }

    @Override
    public String toString() {
        return "Point x is " + this.getX() + " y is " + this.getY();
    }
}
