package LinearList.Queue;

import javafx.scene.shape.Circle;

/**
 * @author Data
 * @Project
 * @Date 2021-02-22
 * @Version v1.0
 * @Description 循环队列的实现
 */
public class CircleQueue implements Queue{
    /**
     * 队头
     */
    private int front;
    /**
     * 队尾
     */
    private int rear;
    /**
     * 统计元素的计数器
     */
    private int count;
    /**
     * 队列的最大长度
     */
    private int maxSize;
    /**
     * 存放元素的数组
     */
    private Object[] array;
    /**
     * 有参构造器
     * @param size 指定队列的容量
     */
    public CircleQueue(int size){
        this.maxSize =size;
        this.array = new Object[size];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }
    /**
     * 判断队列是否为空
     * @return true:空，false:非空
     */
    @Override
    public boolean isEmpty(){
        return count==0;
    }
    /**
     * 判断队列是否已满
     * @return true:队列已满，false:队列未满
     */
    public boolean isFull(){
        return count>=maxSize;
    }
    /**
     * 添加元素到队列
     * @param element 需添加在队列尾部的元素
     */
    @Override
    public void add(Object element){
        // 判满，如果队列已满，抛出异常
        if(isFull()){
            throw new RuntimeException("队列已满，无法进行入队操作");
        }
        array[rear] = element;
        rear = (rear+1)%maxSize;
        count++;
    }
    /**
     * 出队操作
     * @return 出队的元素
     */
    @Override
    public Object take(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，无法进行出队操作");
        }
        Object element = array[front];
        front = (front+1)%maxSize;
        count--;
        return element;
    }
    /**
     * 队列的长度
     * @return 队列中元素的个数
     */
    @Override
    public int size(){
        return count;
    }
}
