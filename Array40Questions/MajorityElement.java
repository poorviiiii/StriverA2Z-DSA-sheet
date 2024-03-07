public class MajorityElement {
    //Brute force approach TIME-O(N^2) SPACE-O(1);
    public static int majorityElement(int arr[],int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>(n/2)){
                return arr[i];
            }
        }
        
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,2,3,3,1,2,2};
        System.out.println(majorityElement(arr,7));
       }
    
}
