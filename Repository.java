import java.util.ArrayList;
import java.util.List;

public class Repository {
    public List<Shape> shapeList;

    public Repository() {
        this.shapeList = new ArrayList<>();
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
    public void addShape(Shape shape){
        shapeList.add(shape);
    }
}
