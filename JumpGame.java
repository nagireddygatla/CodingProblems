package dataStructures;
public class JumpGame {
    public boolean canJump(int[] nums) {
        
        if(nums.length<2)return true;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]==0){
                int jumpsneed = 1;
                while(jumpsneed>nums[i]){
                    jumpsneed++;
                    i--;
                    if(i<0)return false;
                }
            }
        }
        return true;
    }
}
