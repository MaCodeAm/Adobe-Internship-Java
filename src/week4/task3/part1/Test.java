package week4.task3.part1;

import week4.task1.User;
import week4.task1.UserGroup;
import week4.task2.part2.ImmutablePoint;
import week4.task2.part2.Point;
import week4.task2.part3.Triangle;
import week4.task2.part4.Colour;
import week4.task2.part4.ColoredTriangle;

public class Test {

    public static void main(String[] args) {

        User user1 = new User("firstName1", "lastName1", "userName1", "email1");
        User user2 = new User("firstName2", "lastName2", "userName2", "email2");
        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user1);
        userGroup.addUser(user2);

        ImmutablePoint immutablePoint1 = new ImmutablePoint(10, 15);
        ImmutablePoint immutablePoint2 = new ImmutablePoint(20, 25);
        ImmutablePoint immutablePoint3 = new ImmutablePoint(30, 35);
        Triangle triangle = new Triangle(immutablePoint1, immutablePoint2, immutablePoint3);
        ColoredTriangle coloredTriangle = new ColoredTriangle(immutablePoint1, immutablePoint2, immutablePoint3, Colour.RED);

        Printer.specialPrint(user1);
        Printer.specialPrint(userGroup);
        Printer.specialPrint(immutablePoint1);
        Printer.specialPrint(triangle);
        Printer.specialPrint(coloredTriangle);


    }
}
