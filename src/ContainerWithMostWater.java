/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
 * 
 * https://leetcode.com/problems/container-with-most-water/
 * 
 */

public class ContainerWithMostWater {
    
    public static void main(String[] args) throws Exception {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    // Time: O(n) Space: O(1)
    // Two pointers, move pointer that is smaller than the other pointer
    public static int maxArea(int[] height) {
          
        int area = 0;
        int p = 0;
        int q = height.length - 1;
        int heightBox, baseBox, newArea;

        while(p < q){

            heightBox = (height[p] > height[q]) ? height[q] : height[p];
            baseBox = q - p;
            newArea = baseBox * heightBox; 

            if(height[p] > height[q]){
                q--;
            }else{
                p++;
            }

            if(newArea > area){
                area = newArea;
            }
        }

        return area;
    }
}
