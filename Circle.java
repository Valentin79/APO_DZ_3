public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public double circumferenceLength() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double area() {
        return 3.14 * (radius*radius);
    }

    @Override
    public int perimetr() {
        System.out.println("У круга длинна окружности, а не периметр");
        return 0;
    }

    @Override
    public boolean isPossible() {
        if(radius == 0){
            System.out.println("Круг с заданными параметрами невозможен");
            return false;}
        return true;
    }

    @Override
    public void getInfo() {
        System.out.println("Радиус круга: " + radius);
    }
}
