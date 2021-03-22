package kry.edu.module2.inheritance;

import kry.edu.module2.classdesign.Rectangle;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Wall
  @version  1.0.0 
  @since 3/19/2021 - 18.13
*/
public class Wall extends Rectangle {
    private String color;
    private boolean isInner;
    private boolean isWarmed;

    public Wall() {
    }

    public Wall(String color, boolean isInner, boolean isWarmed) {
        this.color = color;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    public Wall(double length, double width, String color, boolean isInner,
                boolean isWarmed) {
        super(length, width);
        this.color = color;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInner() {
        return isInner;
    }

    public void setInner(boolean inner) {
        isInner = inner;
    }

    public boolean isWarmed() {
        return isWarmed;
    }

    public void setWarmed(boolean warmed) {
        isWarmed = warmed;
    }

    public double getPrice() {
        return super.getArea()
                * (!getColor().equalsIgnoreCase("white") ? 2 : 1)
                * (!isInner ? 2 : 1)
                * (isWarmed ? 3 : 1);
    }

    @Override
    public String toString() {
        return "Wall{" +
                super.toString() +
                ", color='" + this.getColor() + '\'' +
                ", isInner=" + isInner +
                ", isWarmed=" + isWarmed +
                '}';
    }
}
