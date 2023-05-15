public class ScaleneTriangle extends Shape{
    private double firstLine;
    private double secondLine;
    private double thirdLine;

    public ScaleneTriangle(double firstLine, double secondLine, double thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
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

    public double getThirdLine() {
        return thirdLine;
    }

    public void setThirdLine(double thirdLine) {
        this.thirdLine = thirdLine;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        if (firstLine != secondLine && firstLine != thirdLine && secondLine != thirdLine){
            System.out.println("Scalene triangles perimeter is: ");
            System.out.println(perimeter = firstLine + secondLine + thirdLine);
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return "ScaleneTriangle{" +
                "firstLine=" + firstLine +
                ", secondLine=" + secondLine +
                ", thirdLine=" + thirdLine +
                '}';
    }
}
