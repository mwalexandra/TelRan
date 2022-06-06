
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMedian<Integer> {

    Queue<Integer> maxHeap;
    Queue<Integer> minHeap;

    public QueueMedian() {
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        this.minHeap = new PriorityQueue<>();
    }

    void add(Integer num) {
        if (maxHeap.size() <= minHeap.size())
            maxHeap.add(num);
        else
            minHeap.add(num);
    }

    double getMedian() {

        int peekOfMaxHeap = (int) maxHeap.peek();
        int peekOfMinHeap = (int) minHeap.peek();

        if (maxHeap.size() == minHeap.size()) {
            return ((double) peekOfMaxHeap + (double) peekOfMinHeap) / 2;
        }

        return maxHeap.size() > minHeap.size() ? (double) peekOfMaxHeap : (double) peekOfMinHeap;
    }
}
