package LinearList.Queue;

/**
 * @author Data
 * @Project
 * @Date 2021-02-22
 * @Version 1.0
 * @Description 顺序队列的测试
 */
public class SequenceQueueDemo {
    public static void main(String[] args) {
        int init = 10;
        SequenceQueue sequenceQueue = new SequenceQueue(init);
        // 入队
        for(int i = 0;i<init;i++){
            sequenceQueue.add(i);
        }
        System.out.println("队列是否为空");
        System.out.println(sequenceQueue.isEmpty());
        System.out.println("队列是否已满");
        System.out.println(sequenceQueue.isFull());
        System.out.println("队列中的元素个数");
        System.out.println(sequenceQueue.size());
        System.out.println("打印队列中的元素");
        for (int i = 0;i<init;i++){
            System.out.print(sequenceQueue.take() + " ");
        }
        System.out.println(sequenceQueue.size());
    }
}
