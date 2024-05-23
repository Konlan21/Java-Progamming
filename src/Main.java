
public class Main {
    public static void main(String[] args) {
        //  Cirlce
        Circle circle = new Circle(7);
        double circleArea = circle.area();
        System.out.println(circleArea);
        circle.display();

        // Rectangle

        Rectangle rectangle = new Rectangle(20, 40.5);
        double rectangleArea = rectangle.area();
        System.out.println(rectangleArea);
        rectangle.display();
    }

}
