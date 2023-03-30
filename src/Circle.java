public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
    @Override
    public String toString() {
        return "hình tròn có bán kính = "
                + getRadius()
                + " va co mau "
                + getColor();
    }
}
