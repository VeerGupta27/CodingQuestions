class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n1= nums1.length;
     int n2= nums2.length;
     int n= n1+n2;
     int[] arr = new int[n];
     
     for (int i=0; i<n; i++){
        if(i<n1){
            arr[i]=nums1[i];
        }
        else{
            arr[i]=nums2[i-n1];
        }
     }   

     Arrays.sort(arr);
     double median;

     if(n%2==0){
        median =(arr[n/2]+arr[n/2 -1])/2.0 ;
     }
     else{
        median = arr[(n-1)/2];
     }

     return median;
    }
}