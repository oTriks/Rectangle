public class Rectangle {

    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
    }


    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
    double area = this.width * this.height;
    return area;
    }



    public double calculatePerimeter() {
    double perimeter = 2 * (this.width + this.height);
    return perimeter;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }



}
