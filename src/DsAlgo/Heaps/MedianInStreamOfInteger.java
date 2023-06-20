package DsAlgo.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if(minHeap.isEmpty() && maxHeap.isEmpty()){
            maxHeap.add(num);
        }
        else if( maxHeap.size()>minHeap.size()){
            if( num > maxHeap.peek()){
                minHeap.add(num);
            }else{
                int n = maxHeap.remove();
                minHeap.add(n);
                maxHeap.add(num);
            }
        }
        else if (maxHeap.size() == minHeap.size()){
            if(num>maxHeap.peek() && num>minHeap.peek()){
                int n = minHeap.remove();
                maxHeap.add(n);
                minHeap.add(num);
            }else if(num>maxHeap.peek() && num<minHeap.peek()) {
                maxHeap.add(num);
            }else{
                maxHeap.add(num);
            }
        }
    }

    public double findMedian() {
        if((minHeap.size() == 0) && (maxHeap.size() == 0)){
            return 0;
        }
        if(maxHeap.size() == minHeap.size()){
            return ((double)(maxHeap.peek()+minHeap.peek())/2);
        }
        else{
            return (double) maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
public class MedianInStreamOfInteger {
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(40);
        mf.addNum(12);
        System.out.println(mf.findMedian());
        mf.addNum(16);
        mf.addNum(14);
        mf.addNum(35);
        System.out.println(mf.findMedian());
    }

}
