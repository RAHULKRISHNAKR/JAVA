class ConstructorDemo{
    double width;
    double height;
    double breadth;

    ConstructorDemo(double w, double h, double b) {
        System.out.println("Hello");
        width = w;
        height = h;
        breadth = b;
    }

    double volume(){
        return width*height*breadth;
    }
   
}

public class Constructor {
    public static void main(String[] args){
        ConstructorDemo c = new ConstructorDemo(10,20,15);
        double x = c.volume();
        System.out.print("Volume is " + x);
        }
}
