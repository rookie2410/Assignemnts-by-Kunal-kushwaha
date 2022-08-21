public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,45,76,98,104,322,543,767,876};
        int[] arr2 = {4,6,7,9,432,54,23,54,71,323,543,6578,86,43};
        int target=43;
        int ans = linearSearch(arr2,target);
        System.out.println(ans);
    }

    private static int linearSearch(int[] arr, int target) {
//        for (int item:arr) {
//            if(item==target)
//                return item;
//
//        }
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i])
                return i;
        }

        return -1;
    }
}
