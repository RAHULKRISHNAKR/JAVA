package hehe;
class Palindrome{
    public static void main(String[] args){
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a string:");
            String s = sc.nextLine();
            System.out.println("The string you enterred:" + s);
            int i;
            boolean flag = true;
            int n = s.length();
            for(i =0;i<n/2;i++){
                if(s.charAt(i) != s.charAt(n-1-i)){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                    System.out.println("Its palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
            sc.close();
        }
    }
}
