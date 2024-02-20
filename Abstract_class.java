package hehe;
abstract class Shape{
    abstract void numberOfSides();
}

class Triangle extends Shape{
    int sides =3;
    void numberOfSides(){
        System.out.println("Number of sodes = 3");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.numberOfSides();
    }
}
