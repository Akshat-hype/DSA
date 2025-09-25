// Last updated: 9/25/2025, 12:25:05 PM
import java.util.*;
class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        List<Integer> nums1=new ArrayList<>();
        List<Integer> nums2=new ArrayList<>();
        for(int i=0;i<num1.length;i++){
            nums1.add(num1[i]);
        }
        for(int i=0;i<num2.length;i++){
            nums2.add(num2[i]);
        }
        
        Set<Integer> ans=new HashSet<>();
        for(int x:nums2){
            if(nums1.contains(x)){
                ans.add(x);
            }
        }
        int[] a=new int[ans.size()];
        int i=0;
        for(int x:ans){
            a[i]=x;
            i++;
        }
        return a;
    }
}