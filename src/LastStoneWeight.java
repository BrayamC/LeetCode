
import java.util.PriorityQueue;

public class LastStoneWeight {
    
    public static void main(String[] args){
        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }

    public static int lastStoneWeight(int[] stones) {
     
        // Create priority queue with max size and way to compare
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, (a, b) -> b - a);

        // Add each value into pq
        for(int  i = 0; i < stones.length; i++){
            pq.add(stones[i]);
        }
            
        // Pop largest values and subtract them
        // Add subtracted value back to pq
        while (pq.size() > 1){
            
            pq.add(pq.poll() - pq.poll());
        }
            
        return pq.poll();
        
    }
}
