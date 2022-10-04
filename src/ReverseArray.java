public class ReverseArray {
    static void reverseArray(int arr[],int start,int end){
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public void main(String [] args){
        int arr[]={1,3,5,6,8,7};
        int size=arr.length;
        printArray(arr,size);
        reverseArray(arr,0,size-1);
        printArray(arr,size);

    }
}
