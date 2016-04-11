package dataStructures;

public class RainWaterTrap {
	    public int trap(int[] height) {
	        int result = 0;
	        int maxSeenRight [] = new int[height.length];
	        int maxSeenSoFar = 0;
	        int maxSeenLeft = 0;
	        for(int i =height.length-1;i>=0;i--){
	            if(maxSeenSoFar<height[i]){
	                maxSeenSoFar = height[i];
	                maxSeenRight[i] = maxSeenSoFar;
	            }
	            else{
	                maxSeenRight[i] = maxSeenSoFar;
	            }
	        }
	        for(int j=0;j<height.length;j++){
	            
	            result = result + Math.max(Math.min(maxSeenLeft,maxSeenRight[j])-height[j],0);
	            if(maxSeenLeft<height[j])
	            maxSeenLeft = height[j];
	        }
	        return result;
	    }
}