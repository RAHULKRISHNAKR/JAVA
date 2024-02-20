package hehe;


public class matmul {
    public static void main(String[] args) {
        int i,j,k;
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.println("Enter the number of rows for A:");
      int r1 = sc.nextInt();
      System.out.println("Enter the number of columns for a:");
      int c1 = sc.nextInt();
      System.out.println("Enter the number of rows for B:");
      int r2 = sc.nextInt();
      System.out.println("Enter no of cols of b");
      int c2 = sc.nextInt();
        if(r1!=c2 || r2!=c1){
        System.out.print("\nMatrix Multiplication is not possible.\n");
        }
        else{
            int[][] m1 = new int[10][10];
            int[][] m2 = new int[10][10];
            int[][] m3 = new int[10][10];
            System.out.println("\nEnter elements of matrix A : ");
            for (i=0;i<r1;i++){
                for (j=0;j<c1;j++){
                m1[i][j] = sc.nextInt();
                }
            }
            System.out.println("\nEnter elements of matrix b : ");
            for (i=0;i<r1;i++){
                for (j=0;j<c1;j++){
                    m2[i][j] = sc.nextInt();
                }
            }

            System.out.println("---MAtrix A---");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    System.out.print(m1[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("---MAtrix B---");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    System.out.print(m1[i][j]+"\t");
                }
                System.out.println();
            }
            //performing multiplication and storing in array m3
            for(i=0; i<r1; i++) {
                for(j=0, k=0; j<c2; j++,k++){
                    m3[i][j] = m1[i][k] * m2[k][j];
                }
            }
            System.out.println("\nMultiplication of matrices is as follows:\n");
            for(i=0; i<r1; i++) {
                for(j=0; j<c2; j++) {
                    System.out.print(m3[i][j] + "\t");
                }
                System.out.println();
            }        
        }
        sc.close();
    }
}
