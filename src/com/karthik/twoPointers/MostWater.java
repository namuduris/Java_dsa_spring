import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int area = (right-left) * Math.min(height[right], height[left]);

        while(left<right){
            int currSum = (right-left) * Math.min(height[right], height[left]);
            if(currSum > area){
                area = currSum;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return area;
    }
}