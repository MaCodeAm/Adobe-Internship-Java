package week4.task2.part4;

import week4.task2.part1.AssertionUtils;
import week4.task2.part2.ImmutablePoint;
import week4.task2.part2.Point;
import week4.task2.part3.MutableTriangle;

public class Test {
    public static void main(String[] args) {


        Point point1 = new ImmutablePoint(15, 20);
        Point point2 = new ImmutablePoint(25, 30);
        Point point3 = new ImmutablePoint(35, 40);

        MutableTriangle mutableTriangle = new MutableTriangle(point1, point2, point3);
        ColoredTriangle coloredTriangle1 = new ColoredTriangle(point1, point2, point3, Colour.RED);
        ColoredTriangle coloredTriangle2 = new ColoredTriangle(point1, point2, point3, Colour.BLACK);

        System.out.println(coloredTriangle1.equals(coloredTriangle1));
        System.out.println(coloredTriangle1.equals(mutableTriangle));
        System.out.println(test1(coloredTriangle1, mutableTriangle));
        System.out.println(test2(coloredTriangle1, coloredTriangle2));

    }

    public static boolean test1(ColoredTriangle coloredTriangle, MutableTriangle mutableTriangle) {
        AssertionUtils.assertEquals(coloredTriangle.getPoint1().getX(), mutableTriangle.getPoint1().getX());
        AssertionUtils.assertEquals(coloredTriangle.getPoint2().getX(), mutableTriangle.getPoint2().getX());
        AssertionUtils.assertEquals(coloredTriangle.getPoint3().getX(), mutableTriangle.getPoint3().getX());
        AssertionUtils.assertEquals(coloredTriangle.getPoint1().getY(), mutableTriangle.getPoint1().getY());
        AssertionUtils.assertEquals(coloredTriangle.getPoint2().getY(), mutableTriangle.getPoint2().getY());
        AssertionUtils.assertEquals(coloredTriangle.getPoint3().getY(), mutableTriangle.getPoint3().getY());

        return true;
    }

    public static boolean test2(ColoredTriangle coloredTriangle1, ColoredTriangle coloredTriangle2) {
        AssertionUtils.assertEquals(coloredTriangle1.getPoint1().getX(), coloredTriangle2.getPoint1().getX());
        AssertionUtils.assertEquals(coloredTriangle1.getPoint2().getX(), coloredTriangle2.getPoint2().getX());
        AssertionUtils.assertEquals(coloredTriangle1.getPoint3().getX(), coloredTriangle2.getPoint3().getX());
        AssertionUtils.assertEquals(coloredTriangle1.getPoint1().getY(), coloredTriangle2.getPoint1().getY());
        AssertionUtils.assertEquals(coloredTriangle1.getPoint2().getY(), coloredTriangle2.getPoint2().getY());
        AssertionUtils.assertEquals(coloredTriangle1.getPoint3().getY(), coloredTriangle2.getPoint3().getY());

        return true;
    }
}
