package week4.task2.part3;

import week4.task2.part2.ImmutablePoint;
import week4.task2.part2.Point;
import week4.task2.part1.AssertionUtils;

import java.util.Objects;

public final class Triangle {
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);
        this.point1 = new ImmutablePoint((ImmutablePoint) point1);
        this.point2 = new ImmutablePoint((ImmutablePoint) point2);
        this.point3 = new ImmutablePoint((ImmutablePoint) point3);
    }

    public Triangle(Triangle triangle) {
        this(triangle.point1, triangle.point2, triangle.point3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null && !(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) (o);
        return this.point1.equals(triangle.point1)
                && this.point2.equals(triangle.point2)
                && this.point3.equals(triangle.point3);
    }

    @Override
    public String toString() {
        return "Triangle point1 is " + point1.toString() +
                ", point2 is " + point2.toString() + ", point3 is " + point3.toString();
    }
}
