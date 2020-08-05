 
public class BubbleSort{
    public int[] sort(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
            if(arr[j-1]>arr[j])
            {
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }  
        }
    }
     return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,2,8,6,7,3};
        int n = arr.length;
        int arr1[] = new int[n];
        
        BubbleSort gc = new BubbleSort();
        arr1 = gc.sort(arr);
        for(int i=0;i<arr1.length;i++)
        {
        System.out.print(arr1[i]+" ");
        }
    }
}
