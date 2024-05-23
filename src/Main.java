import javafx.scene.text.Text;

public class Main {
    public static void main(String[] args) {
        TextBox textBox = new TextBox(false);

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        System.out.println(point1.equals(point2));

}

}
