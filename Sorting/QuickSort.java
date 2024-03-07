import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]){
        int arr[]={5,9,2,11,14,6,3,89};
        System.out.println("Unsorted Array: "+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted Array :"+Arrays.toString(arr));
    }

    public static void quickSort(int arr[],int start,int end){
        if(start<end){
            int pivotIndex=partition(arr,start,end);
            quickSort(arr,start,pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }
    }

    public static int partition(int []arr,int start,int end){
        int pivot=arr[start];
        int i=start;
        for(int j=start+1;j<=end;j++){
            if(arr[j]<pivot){
            i++;
            swap(arr,i,j);
            }
        }
        swap(arr,start,i);
        return i;
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
