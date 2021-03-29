package kry.edu.factory.implementations;

import kry.edu.module2.classdesign.Round;
import kry.edu.module2.polymorphism.interfaces.IGeometry;

import java.util.Objects;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  RoundImpl
  @version  1.0.0 
  @since 3/26/2021 - 18.41
*/
public class RoundImpl implements IGeometry {

    public static final String INCORRECT_RADIUS_MESSAGE =
            "Radius must be a positive number";
    public static final String INCORRECT_ARC_ANGLE =
            "Arc angle must be in range [0, 2 * PI]";
    public static final String INCORRECT_ARC_ANGLE_RESULT =
            "Arc angle result is not in range [0, 2 * PI]";

    private double radius;

    public RoundImpl() {
    }

    public RoundImpl(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(INCORRECT_RADIUS_MESSAGE);
        }
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoundImpl round = (RoundImpl) o;
        return Double.compare(round.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    @Override
    public String toString() {
        return "Round{" +
                "radius=" + radius +
                '}';
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getSectorArea(double arcAngle) {
        checkAngle(arcAngle, INCORRECT_ARC_ANGLE);
        return (arcAngle * Math.pow(radius, 2)) / 2;
    }

    public double getArcAngle(double sectorArea) {
        double arcAngle = (2 * sectorArea) / Math.pow(radius, 2);
        checkAngle(arcAngle, INCORRECT_ARC_ANGLE_RESULT);
        if (radius == 0) {
            throw new IllegalStateException(INCORRECT_RADIUS_MESSAGE);
        }
        return (2 * sectorArea) / Math.pow(radius, 2);
    }

    private void checkAngle(double arcAngle, String errorMessage) {
        if ((arcAngle < 0) || (arcAngle > 2 * Math.PI)) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
