public class BubblSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
    }
    static void swap(int n1,int n2,int[] arr){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
              System.out.print(" ");
        }
    }
}
