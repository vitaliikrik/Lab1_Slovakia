package kry.edu.module2.classdesign;

import java.util.Objects;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Rectangle
  @version  1.0.0 
  @since 3/19/2021 - 18.13
*/
public class Rectangle {

    private static final String MUST_BE_POSITIVE_MESSAGE =
            "Field %s must have positive value";

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(String.format(MUST_BE_POSITIVE_MESSAGE,
                    "length"));
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(String.format(MUST_BE_POSITIVE_MESSAGE,
                    "width"));
        }
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                '}';
    }

    public double getArea() {
        return this.getWidth() * this.getLength();
    }
}
