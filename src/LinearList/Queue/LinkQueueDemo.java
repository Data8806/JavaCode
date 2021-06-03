package LinearList.Queue;

/**
 * @author Data
 * @Project
 * @Date 2021-02-23
 * @version V 1.0
 * @Description 测试链式队列
 */
public class LinkQueueDemo {
    public static void main(String[] args) {
        int size = 10;
        LinkQueue linkQueue = new LinkQueue();
        // 入队操作
        for (int i = 0;i<size;i++){
            linkQueue.add(i);
        }
        System.out.println("队列是否为空");
        System.out.println(linkQueue.isEmpty());
        System.out.println("队列中的元素个数");
        System.out.println(linkQueue.size());
        System.out.println("打印出队列中的元素");
        // 出队
        for (int i = 0;i<size;i++){
            System.out.print(linkQueue.take()+" ");
        }
        System.out.println();
        System.out.println("队列中的元素个数");
        System.out.println(linkQueue.size());
    }
}
