public class Main {
    public static void main(String[] args) {


        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(7.9, 8.0);

        double rect1Area = rect1.calculateArea();
        System.out.println(rect1Area);

        double rect2Area = rect2.calculateArea();
        double rect2Parameter = rect2.calculatePerimeter();
        System.out.println(rect2Area);
        System.out.println(rect2Parameter);
        rect2.setWidth(15);
        System.out.println(rect2.calculateArea());


    }
}