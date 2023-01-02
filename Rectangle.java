public class Rectangle extends Shape{
    public int edgeA;
    public int edgeB;

    public Rectangle(int edgeA, int edgeB) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }


    @Override
    public int perimetr() {
        return 2*edgeA + 2*edgeB;
    }

    @Override
    public double area() {
        return edgeA * edgeB;
    }

    @Override
    public double circumferenceLength() {
        return 0;
    }

    @Override
    public boolean isPossible() {
        if(edgeA == 0 || edgeB == 0){
            System.out.println("Прямоугольник с заданными параметрами невозможен");
            return false;}
        return true;
    }

    @Override
    public void getInfo() {
        System.out.println("Сторона А = " + edgeA + ", сторона В = " + edgeB);
    }
}
