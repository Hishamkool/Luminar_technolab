package assignment5;

class triangle{
    int a = 3;
    int b = 4;
    int c= 5;
    int height = 4;


    void area(){
        double area = 0.5*b*height;
        System.out.println("Area = "+area+" cm square");
    }

    void perimeter(){
        int perimeter = a+b+b;
        System.out.println("perimeter = "+perimeter+" cm");
    }
}
public class Area_PerimeterOfTriangle {
    public static void main(String[] args) {
//        System.out.println("Enter sides :");
        triangle t1 = new triangle();
        t1.area();
        t1.perimeter();
    }
}
