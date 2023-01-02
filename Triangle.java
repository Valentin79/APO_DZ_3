public class Triangle extends Shape{
    public int edgeA;
    public int edgeB;
    public int edgeC;

    public Triangle(int edgeA, int edgeB, int edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }


    @Override
    public int perimetr() {
        return edgeA + edgeB + edgeC;
    }

    public boolean isPossible(){
        if (((edgeA + edgeB) < edgeC) || ((edgeA + edgeC) < edgeB) || ((edgeB + edgeC) <
                edgeA)){
            System.out.println("Треугольник с заданными параметрами невозможен");
            return false;
        }
        return true;
    }

    @Override
    public double area() {
        double p = (double) (edgeA + edgeB + edgeC)/2;
        return Math.sqrt((p * (p - edgeA) * (p - edgeB) * (p - edgeC)));
    }

    @Override
    public double circumferenceLength() {
        return 0;
    }

    @Override
    public void getInfo() {
        System.out.println("Сторона А = " + edgeA + ", Сторона B = " + edgeB + ", Сторона C = " + edgeC);
    }
}
