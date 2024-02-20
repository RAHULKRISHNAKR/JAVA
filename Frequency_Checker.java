package hehe;
class Frequency_Checker{
    public static void main(String[] args) {
        int i,j;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int[] freq = new int[arr.length];
        for(i =0;i<s.length();i++){
            freq[i] = 1;
            for(j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    freq[i]++;
                    arr[j] = 0;
                }
            }
            
        }
        for(i=0;i<freq.length;i++){
            if(arr[i]!='\0' && arr[i]!=0){
                System.out.print((char)arr[i]+" occurs " + freq[i]);
                System.out.println("\n");
            }
        }
            
    }
}
