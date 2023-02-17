package test.QueueTest;

import Queue.KLargest_PriorityQueue;
import junit.framework.TestCase;
import org.junit.Assert;


public class KLargest_PriorityQueueTest {
    KLargest_PriorityQueue kLargestPriorityQueue= new KLargest_PriorityQueue();
    public void testFirstKelements() {
        int arr[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int size = arr.length;

        // Size of Min Heap
        int k = 3;
        int[] expect={50,88,96};
       // Assert.assertArrayEquals(expect, kLargestPriorityQueue.FirstKelements(arr, size, k));
        ;
    }
}