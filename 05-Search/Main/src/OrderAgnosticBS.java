public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,45,76,98,104,322,543,767,876};
        int[] arr2 = {869,789,534,245,234,65,64,34,29,110,7,5,3,1};

        int target=534;
        int ans = orderAgnosticBinarySearch(arr2,target);
        System.out.println(ans);
    }

    public static int orderAgnosticBinarySearch(int[] arr , int target){
        int start=0,end=arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        while(start<end){
            if(isAsc){
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
            else {
                int mid=start+(end-start)/2;
                if(arr[mid]==target)
                    return mid;

                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }


        }

        return -1;
    }
}
