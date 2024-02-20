class Fctorial {
    int fact(int n)
    {
    if(n==1)
        return 1;
    else if(n == 0){
        return 1;
    }
    else {
        return (n* fact(n-1)) ;
    }
}
}
class Factorial {
    public static void main(String args[]) {
        Fctorial f = new Fctorial();
        int s= f.fact(3);
        System.out.println("Factorial of 3 is " + s);
    }
}
