
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

    public void add(int num) {
        if (maxHeap.size() == 0 && minHeap.size() == 0) {
            minHeap.add(num);
            return;
        }

        double median = getMedian();

        if ((double) num < median) {
            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
            minHeap.add(num);
        } else {
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            }
            maxHeap.add(num);
        }
    }

    public double getMedian() {

        if (maxHeap.size() == minHeap.size()) {
            return ((double) maxHeap.peek() + (double) minHeap.peek()) / 2;
        }

        return maxHeap.size() > minHeap.size() ? (double) maxHeap.peek() : (double) minHeap.peek();
    }
}
