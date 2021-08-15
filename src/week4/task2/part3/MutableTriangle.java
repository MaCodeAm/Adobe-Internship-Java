package week4.task2.part3;

import week4.task2.part2.ImmutablePoint;
import week4.task2.part2.Point;
import week4.task2.part1.AssertionUtils;

import java.util.Objects;

public class MutableTriangle {
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public MutableTriangle(Point point1, Point point2, Point point3) {
        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }


    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null && !(o instanceof Triangle)) return false;
        MutableTriangle mutableTriangle = (MutableTriangle) (o);
        return this.point1.equals(mutableTriangle.point1)
                && this.point2.equals(mutableTriangle.point2)
                && this.point3.equals(mutableTriangle.point3);
    }

    @Override
    public String toString() {
        return "Mutable triangle point1 is " + getPoint1().toString() +
                ", point2 is " + getPoint2().toString() + ", point3 is " + getPoint3().toString();
    }
}
