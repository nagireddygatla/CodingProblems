package dataStructures;

import java.util.HashMap;


//  Definition for a point.
  class Point {
      int x;
      int y;
      Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
  }
 
public class MaxPointsonLine {
	
    public int maxPoints(Point[] points) {
        if(points==null || points.length==0)return 0;
        if(points.length<=2)return points.length;
        int result = 0;
        for(int i=0;i<points.length;i++){
            int samep = 0;
            int samex = 1;
            HashMap<Double,Integer> hmap = new HashMap<Double,Integer>();
            for(int j=0;j<points.length;j++){
            if(i!=j){
            if((points[i].x==points[j].x) && (points[i].y==points[j].y))samep++;
            if(points[i].x==points[j].x){
                samex++;
                continue;
            }
            double slope = (points[i].y-points[j].y)/(points[i].x-points[j].x);
            if(hmap.get(slope)!=null){
                hmap.put(slope,hmap.get(slope)+1);
            }
            else{
                hmap.put(slope,2);   
            }
            result = Math.max(result,hmap.get(slope)+samep);
            }
            }
            result = Math.max(result,samex); 
        }
        return result;
    }
    
    
}
