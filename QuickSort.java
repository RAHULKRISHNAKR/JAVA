package huhu;
public class QuickSort {
    
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int[] arr, int lb, int ub){
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while(start<end){
            while(arr[start]<=pivot){
                start++;
            }
        
            while(arr[end]>pivot){
                end--;
            }

            if(start<end){
                swap(arr,start,end);
            }
        }
        swap(arr,lb,end);
        return end;
    }

    static int[] quicksort(int[] arr, int lb,int ub){
        int loc;
        if(lb<ub){
            loc = partition(arr,lb,ub);
            quicksort(arr, lb, loc-1);
            quicksort(arr, loc+1, ub);
        }
        return arr;
    }

    public static void main(String[] args){
    int[] arr = new int[100];
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("ENter 10 elements");

    for(int i=0;i<10;i++){
        arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println("\nGiven array is: ");
    for(int i=0;i<10;i++) {
        System.out.print(arr[i] + " ");
    }

    arr = quicksort(arr,0,10);
    
        System.out.println("\nSorted array is: ");
    for(int i=0;i<10;i++) {
        System.out.print(arr[i] + " ");
    
    }

    
    }
}
