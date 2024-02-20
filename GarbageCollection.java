package hehe;

public class GarbageCollection{
    public void finalize() {
        System.out.println("The object is garbage collected");
        
    }
    public static void main(String[] args) {
        GarbageCollection l1 = new GarbageCollection();
        GarbageCollection l2 = new GarbageCollection();
        l1 =l2;
        l2 =l1;
        l2 = null;
        l1 = null;
        System.gc();


    }
}