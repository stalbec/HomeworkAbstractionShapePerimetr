public class Rectangle extends Shape{
    private double firstLine;
    private double secondLine;

    public Rectangle(double firstLine, double secondLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    public double getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(double firstLine) {
        this.firstLine = firstLine;
    }

    public double getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(double secondLine) {
        this.secondLine = secondLine;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        System.out.println("Rectangle's perimeter is: ");
        System.out.println(perimeter = 2 * (firstLine + secondLine));
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstLine=" + firstLine +
                ", secondLine=" + secondLine +
                '}';
    }
}
