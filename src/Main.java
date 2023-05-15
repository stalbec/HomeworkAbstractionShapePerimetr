public class Main {
    public static void main(String[] args) {
      /*  public abstract double getPerimeter()

        деген абстракт методун  Shape деген класска кошунуз.

        Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.*/

        Shape triangle = new Triangle(3, 3, 3);
        Shape scaleneTriangle = new ScaleneTriangle(3, 4, 5);
        Shape rectangle = new Rectangle(5,7);
        Shape circle = new Circle(3.4);
        Shape square = new Square(2.4);

        triangle.getPerimeter();
        scaleneTriangle.getPerimeter();
        rectangle.getPerimeter();
        circle.getPerimeter();
        square.getPerimeter();

    }
}