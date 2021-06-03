package LinearList.Queue;

/**
 * @author Data
 * @Project
 * @Date 2021-02-22
 * @Version V1.0
 * @Description 测试循环队列
 */
public class CircleQueueDemo {
    public static void main(String[] args) {
        int size = 10;
        CircleQueue circleQueue = new CircleQueue(size);
        // 入队操作
        for(int i = 0;i<size;i++){
            circleQueue.add(i);
        }
        System.out.println("队列是否为空");
        System.out.println(circleQueue.isEmpty());
        System.out.println("队列是否已满");
        System.out.println(circleQueue.isFull());
        System.out.println("队列中的元素个数");
        System.out.println(circleQueue.size());
        // 依次出队
        for (int i = 0;i<size;i++){
            System.out.print(circleQueue.take()+ " ");
        }
        System.out.println();
        System.out.println(circleQueue.isFull());
        System.out.println(circleQueue.isEmpty());
        circleQueue.add(0);
        System.out.println(circleQueue.take());
    }
}
