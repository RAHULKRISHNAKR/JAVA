class Test{
    int a,b;
    Test(int i,int j){
        a = i;
        b = j;
    }

    boolean equals(Test obj1){
        if((obj1.a == this.a) && (obj1.b == this.b)){
            return true;
        }
        else {
            return false;
        }
    }
}
public class ObjectAsParameter {
    public static void main(String[] args){
        Test obj1 = new Test(5,4);
        Test m = new Test(100,100);
        Test n = new Test(5,4);
        System.out.println(obj1.equals(m));
        System.out.println(obj1.equals(n));
    }
}
