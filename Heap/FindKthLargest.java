package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Example 1:
 *
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * Example 2:
 *
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                }
        );
        int N = nums.length;
        for (int i=0;i<N;i++){
            queue.add(nums[i]);
        }
        for (int i=0;i<k-1;i++){
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args){
        FindKthLargest sol = new FindKthLargest();
        int[] nums = new int[] {3,1,4,6,5,2};
        int k = 3;
        System.out.println(sol.findKthLargest(nums,k));
    }
}

//PriorityQueue<Integer> queue = new PriorityQueue<>(
// new Comparator<Integer>() {
// @Override
// public int compare(Integer o1, Integer o2){
// return o2-o1
// }})