public class Square extends Shape{
    private double firstSide;

    public Square(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        System.out.println("Square's perimeter is: " );
        System.out.println(perimeter = 4 * firstSide);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "firstSide=" + firstSide +
                '}';
    }
}
