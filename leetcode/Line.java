package leetcode;

import java.util.*;

/**
 * Created by vn0dht3 on 1/23/17.
 */
public class Line {
    public static void main(String[] args) {

        NewSolution solution= new NewSolution();
        Point point[]= {new Point(0,0),new Point(0,0)};

        solution.maxPoints(point);

    }

}
 class Point {
      int x;
      int y;
      Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
  }


 /**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */


 class NewSolution {

    // ----------------
    //
    // calcluate the slope of a point from the origin
    // Point reference;
    // reference.x=0
    // reference.y=0
    // SAVE slope-->(abs(Point.x)-0)/(abs(Point.y)-0)  // where x and y not 0
    // in a hashmap<slope,ListLinked<Points>
    // if the calculated value of the slope is already seen in a map
    // add the point's index to the result set
    // differently handle if a same point (maintain a set of points)
    // ---------------

    static  HashMap<Double,List<Point>> slopes= new HashMap<>();
    public int maxPoints(Point[] points) {
        Point reference= new Point(0,0);
        int max=0;
        for(int i=0;i<points.length;i++){
            int x=Math.abs(points[i].x)-reference.x;
            int y=Math.abs(points[i].y)-reference.y;
            int number_of_points=addSlopes(x,y,points[i]);
            System.out.println(number_of_points+" "+max);
            if (number_of_points>max){
                System.out.println(number_of_points);
                max=number_of_points;
            }
        }
        return max;

    }
    public static int addSlopes(int x, int y,Point point){
        double slope;
        if (y==0){
            slope=0;
        }
        else{
            slope=x/y;
        }

        if(slopes.containsKey(slope)){
            slopes.get(slope).add(point);
            // if(!slopes.get(slope).contains(point)){
            //     System.out.println("slope added"+slope);
            //     slopes.get(slope).add(point);
            // };
        }
        else{
            List<Point> hs= new LinkedList<>();
            hs.add(point);
            slopes.put(slope,hs);
        }
//        if(slopes.containsKey(slope)){
//            slopes.put(slope,slopes.add(point));
//        }else {
//
//        }
//        slopes.put(slope,slopes.get(slope).add(point));
        //if(slopes.size()==1) return 1;
        //System.out.println(slopes.get(slope).size());
        //hm.toString

        System.out.println( slope+ " size "+slopes.get(slope).size());
        if (slopes.get(slope).size()==1) return 1;
        return slopes.get(slope).size();
    }
}
