public class Square extends Shape{
   public int edge;

   public Square(int edge) {
      this.edge = edge;
   }

   public int getEdge() {
      return edge;
   }



   @Override
   public int perimetr() {
      return edge*4;
   }

   @Override
   public double area() {
      return edge*edge;
   }

   @Override
   public double circumferenceLength() {
      return 0;
   }

   @Override
   public boolean isPossible() {
      if(edge == 0){
         System.out.println("Квадрат с заданными параметрами невозможен");
         return false;}
      return true;
   }

   @Override
   public void getInfo() {
      System.out.println("Сторона квадрата = " + edge);
   }
}
