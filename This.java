class Hello{
    int width;
    int length;
    int height;

    Hello(int width ,int length,int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    int sum(){
        return (width+length+height);
    }
}

public class This {
    public static void main(String[] args){
        Hello h1 = new Hello(10,10,10);
        Hello h2 = new Hello(40,20,0);
        System.out.print(h1.sum() + h2.sum());
    }
}