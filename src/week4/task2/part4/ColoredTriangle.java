package week4.task2.part4;

import week4.task2.part2.Point;
import week4.task2.part3.MutableTriangle;

import java.util.Objects;

public class ColoredTriangle extends MutableTriangle {
    private final Colour colour;


    public ColoredTriangle(Point point1, Point point2, Point point3, Colour colour) {
        super(point1, point2, point3);
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Colored triangle point1 is " + getPoint1().toString() +
                ", point2 is " + getPoint2().toString() + ", point3 is "
                + getPoint3().toString() + ", colour is " + this.colour;
    }

}
