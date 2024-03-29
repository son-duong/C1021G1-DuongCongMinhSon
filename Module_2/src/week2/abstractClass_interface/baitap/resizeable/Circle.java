package week2.abstractClass_interface.baitap.resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 2;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r adius=" + radius +
                " area: " + getArea()+
                '}';
    }
    public double getArea(){
        double area;
        area = getRadius()*Math.PI*2;
        return area;
    }
    @Override
    public void resize(double percent) {
        this.radius *= percent;
    }
}
