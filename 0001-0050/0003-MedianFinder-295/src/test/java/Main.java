public class Main {
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        double param_2 = obj.findMedian();
        System.out.println(param_2);
    }
}
