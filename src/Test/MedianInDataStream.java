package Test;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianInDataStream {
    public static void main(String[] args) {
        String[]arr = {};
    }
    PriorityQueue<Integer>maxHeap;
    PriorityQueue<Integer>minHeap;
    public MedianInDataStream(){
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>num)
            maxHeap.add(num);
        else minHeap.add(num);
        if(maxHeap.size()>minHeap.size()+1)
            minHeap.add(maxHeap.poll());
        else if(minHeap.size()>maxHeap.size()+1)
            maxHeap.add(minHeap.poll());
    }

    public double findMedian() {
       if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
       else if(minHeap.size()>maxHeap.size()) return maxHeap.peek();
       else return (minHeap.peek()+maxHeap.peek())/2.0;
    }

}
