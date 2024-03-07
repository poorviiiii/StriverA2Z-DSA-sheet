public class SelectionSort {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,1,2,3};
        System.out.print("Before sorting :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		selection(arr);
        System.out.print("After sorting :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

    }
}

