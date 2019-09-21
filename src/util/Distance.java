/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author josef
 */
public class Distance {

    private static Distance distance = null;

    private Distance() {
    }
    public static final boolean X = true;
    public static final boolean Y = false;

    public static Distance getDistance() {

        if (distance == null) {
            distance = new Distance();
        }
        return distance;
    }

    private double calculateDistance(Point pointA, Point pointB, boolean type) {
        return Math.pow(
                type == X
                        ? pointB.getX() - pointA.getX()
                        : pointB.getY() - pointA.getY(),
                2
        );
    }

    public double getPythagoras(Point pointA, Point pointB) {
        return Math.sqrt(
                calculateDistance(pointA, pointB, X) + calculateDistance(pointA, pointB, Y)
        );
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);

        System.out.println(Distance.getDistance().getPythagoras(a, b));
    }
}
