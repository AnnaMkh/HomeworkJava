package constructors;

import copyConsrtuctor.Point;

public class Rectangle {
    private double weight,  hight;
    private copyConsrtuctor.Point corner;

    public Rectangle(double weight, double hight, copyConsrtuctor.Point corner) {
        this.weight = weight;
        this.hight = hight;
        this.corner = new Point(corner);
    }

    public Rectangle(Rectangle other) {
        this.weight = other.weight;
        this.hight = other.hight;
        this.corner = other.corner;
    }
}
