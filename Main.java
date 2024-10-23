class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) 
    {
        int l=0,r=0,k=0;
        int n=num1.length;
        int m=num2.length;
        int arr[]=new int[n+m];
        while(l < n && r < m)
        {
            if(num1[l] <= num2[r])
            {
                arr[k++]=num1[l++];
            }
            else
            arr[k++]=num2[r++];
        }
        while( l < n)
        {
            arr[k++]=num1[l++];
        }
        while( r < m)
        {
            arr[k++]=num2[r++];
        }
        double len=n+m-1;
        int ceiling=(int)Math.ceil(len/2);
        int floor=(int)Math.floor(len/2);
        double res=(arr[ceiling]+(double)arr[floor])/2;
        return res;
    }
}
