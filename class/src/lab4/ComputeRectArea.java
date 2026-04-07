package lab4;

public class ComputeRectArea {
    public static void main(String[] args) {
        RectConstructor rect1 = new RectConstructor(20, 10);
        double ar;
        ar = rect1.area();
        System.out.println("面积是:" + ar);
    }
}
class  RectConstructor{
    private double length;
    private double width;
    double area(){
        return length * width;
    }
    RectConstructor(double length, double width){
        this.length = length;
        this.width = width;
    }
}
