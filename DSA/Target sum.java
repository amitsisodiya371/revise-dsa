import java.util.*;

class Main {
    // public static void main(String[] args) {
    //     int n = 4;
    //     int arr[] = { 2, 7, 11, 15 };
    //     int s = 9;

    //     int sum = 0;
    //     boolean flag = false;
    //     int min = arr[0];
    //     int min2 = arr[0];
    //     for (int a = 0; a < n; a++) {
    //         for (int j = a + 1; j < n; j++) {
    //             sum = arr[a] + arr[j];
    //             if (sum == s) {
    //                 flag = true;
    //                 if (a < min || j > min2) {
    //                     min = a;
    //                     min2 = j;
    //                     // if (arr[a]>arr[a]){

    //                     System.out.println(min + " " + min2);

    //                 }

    //             }
    //         }
    //     }
    //     if (flag == false) {
    //         System.out.println("-1 -1 ");
    //     }
    // }

    // 2 APPROACH leet code O(n)
    
    // public static void main(String[] args) {
    //     int nums[] = { 2, 7, 11, 15 };
    //     int target = 9;
    //     // public int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     int ans[] = new int[2];
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         if (map.containsKey(target - nums[i])) {
    //             ans[1] = i;
    //             ans[0] = map.get(target - nums[i]);
    //             System.out.println(ans);
    //         }
    //         map.put(nums[i], i);
    //     }
    //     System.out.println(ans);

    // }

    // leet code o(n^2)

    // public static void main(String[] args) {
    //     int nums[] = { 2, 7, 11, 15 };
    //     int target = 9;
    //     boolean f = false;
    //     for (int i = 0; i < nums.length - 1; i++){
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target)
    //                 System.out.println(nums[i] + " " + nums[j]);
    //                 f= true;
    //         } 
    //     }
    //     if(f==false){
    //         System.out.println(-1 + " " + -1);
    //     }
    // }


    //two pointers o(n)

    public static void main(String[] args){
        int [] nums = {2, 17, 7, 12};
        int t = 9;
        int l =0;
        int r =nums.length-1;
        boolean f = false;
        Arrays.sort(nums);
        while(l<r){
            for(int i=0;i<nums.length;i++)
            if(nums[l]+nums[r]==t){
                // System.out.println("yes");
                f=true;
            }else if(nums[l]+nums[r]>t){
                r--;
            }else{
                l++;
            }
        }
        if(f==true){
            System.out.println("yes");  
        }
        else{
            System.out.println("NO");   
        }
        // 
        // System.out.println(nums[i]);
    }
}