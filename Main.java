public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(4);
        Rectangle rectangle1 = new Rectangle(2,4);
        Triangle triangle1 = new Triangle(33,3,3);
        Circle circle1 = new Circle(10);

        Repository repository1 = new Repository();
        repository1.addShape(square1);
        repository1.addShape(rectangle1);
        repository1.addShape(triangle1);
        repository1.addShape(circle1);

        for (Shape shape: repository1.getShapeList()) {
            System.out.println(shape.getClass().getName());
            shape.getInfo();
            if(shape.isPossible()) {
                if (shape.getClass().getName().equals("Circle")) {
                    System.out.println("Площадь фигуры: " + shape.area());
                    System.out.println("Длинна окружности: " + shape.circumferenceLength());
                }

                else {
                    System.out.println("Площадь фигуры: " + shape.area());
                    System.out.println("Периметр фигуры: " + shape.perimetr());
                }
            }
        }

    }
}
