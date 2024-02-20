package huhu;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[][] arr = new int[100][100];
        int[][] arrt = new int[100][100];
        System.out.println("Enter row and solumn of matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println("\n");
        }

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
               arrt[i][j]=arr[j][i];

            }
        }
        System.out.println("--------------Transpose---------");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                System.out.print(arrt[i][j] + " ");

            }
            System.out.println("\n");
        }
        sc.close();

    }
}
