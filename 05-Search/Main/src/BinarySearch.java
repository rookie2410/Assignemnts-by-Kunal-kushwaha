public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,45,76,98,104,322,543,767,876};
        int target=98;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr , int target){

        int start=0,end=arr.length-1;

        while(start<end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;

            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }



        return -1;
    }
}
