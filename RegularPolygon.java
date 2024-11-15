package progexec;

public class RegularPolygon {
    private int n = 3;               // Number of sides
    private double side = 1;         // Length of each side
    private double x = 0;            // X-coordinate of the center
    private double y = 0;            // Y-coordinate of the center

    // No-arg constructor
    public RegularPolygon() {
    }

    // Constructor with specified number of sides and side length
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // Constructor with specified number of sides, side length, and center coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor and mutator methods
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate area
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
