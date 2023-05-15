public class Triangle extends Shape{
    private double firstLine;
    private double secondtLine;
    private double thirdLine;

    public Triangle(double firstLine, double secondtLine, double thirdLine) {
        this.firstLine = firstLine;
        this.secondtLine = secondtLine;
        this.thirdLine = thirdLine;
    }

    public double getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(double firstLine) {
        this.firstLine = firstLine;
    }

    public double getSecondtLine() {
        return secondtLine;
    }

    public void setSecondtLine(double secondtLine) {
        this.secondtLine = secondtLine;
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
      if (firstLine == secondtLine && thirdLine == secondtLine){
          System.out.println("Triangle's perimeter is: ");
          System.out.println( perimeter = (firstLine + secondtLine + thirdLine));
      }
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstLine=" + firstLine +
                ", secondtLine=" + secondtLine +
                ", thirdLine=" + thirdLine +
                '}';
    }
}
