import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;

    public MedianFinder() {
        //降序，最大堆,最小堆维护<=中位数的部分，最小值就是中位数。
        queMin = new PriorityQueue<Integer>((a, b) -> (b - a));
        //升序，最小堆，最大堆维护>中位数的部分，如果最小堆size和最大堆相等时，最大堆的头也是中位数。
        queMax = new PriorityQueue<Integer>((a, b) -> (a - b));
    }

    public void addNum(int num) {
        //peek是返回堆顶的值，失败返回null，如果最大堆为空，或者最大堆头大于想要插入的数，则插入最大堆，因为最大堆维护的是小于中位数的部分.
       if (queMin.isEmpty() || num <= queMin.peek()) {
            //插入元素，失败返回false
            queMin.offer(num);
            //如果小顶堆的数量比大顶堆的数量多两个了。则小顶堆的头，移入大顶堆。poll弹出头。比如7-5 -> 6-6，此时中位数是两个头的平均数。
            if (queMax.size() + 1 < queMin.size()) {
                queMax.offer(queMin.poll());
            }
        } else {    //如果想要插入的数是大于最大堆的，因为最大堆的头肯定是中位数，所以他是大于中位数的，放到最小堆中去。
            queMax.offer(num);
            //如果原来是6-6这样的情况，插入后就变成了6-7，此时要进行移动，我们最终的结果是7-6或者7-7这样才可以。
            if (queMax.size() > queMin.size()) {
                queMin.offer(queMax.poll());    //将最小堆的头，放到了最大堆的中。6-7变成了7-6
            }
        }
    }

    public double findMedian() {
        if (queMin.size() > queMax.size()) {
            return queMin.peek();
        }
        return (queMin.peek() + queMax.peek()) / 2.0;
    }
}
