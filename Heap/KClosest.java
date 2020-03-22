package heap;

/**
 * We have a list of points on the plane.  Find the K closest points to the origin (0, 0).
 *
 * (Here, the distance between two points on a plane is the Euclidean distance.)
 *
 * You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,3],[-2,2]], K = 1
 * Output: [[-2,2]]
 * Explanation:
 * The distance between (1, 3) and the origin is sqrt(10).
 * The distance between (-2, 2) and the origin is sqrt(8).
 * Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
 * We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
 */
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.HashSet;

public class KClosest {
    public int[][] kClosest(int[][] points, int k){
        HashMap<Integer,Double> map = new HashMap<>();
        PriorityQueue<Double> queue = new PriorityQueue<>();
        int i = 0;
        for (int[] pairs:points){
            map.put(i,Math.pow(pairs[0],2)+Math.pow(pairs[1],2));
            i++;
        }
        queue.addAll(map.values());
        int[][] res = new int[k][2];
        HashSet<Double> set = new HashSet<>();

        for (int j=0;j<k;j++){
             set.add(queue.peek());
             queue.poll();
        }
        int m = 0;
        for (Integer keys:map.keySet()){
            if (set.contains(map.get(keys))){
                res[m] = points[keys];
                m++;
            }
        }
        return res;
    }
}
