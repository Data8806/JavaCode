package LinearList.Queue;

/**
 * @author Data
 * @Project
 * @Date 2021-02-22
 * @Version 1.0
 * @Description :以出队方式为队头不动，队尾向前移动出队方式实现顺序队列
 */
public class SequenceQueue implements Queue{
    /**
     * 存储元素的数组
     */
    private Object[] array;
    /**
     * 队列的大小
     */
    private int size;
    /**
     * 有参构造方法
     * @param initialCapacity 队列的最大容量
     */
    public SequenceQueue(int initialCapacity){
        this.array = new Object[initialCapacity];
        this.size = 0;
    }
    /**
     * 添加元素到队列
     * @param element 队尾元素
     */
    @Override
    public void add(Object element){
        array[size++] = element;
    }
    /**
     * 出队操作
     * @return 队头元素
     */
    @Override
    public Object take(){
        Object element = array[0];
        for(int i = 0;i<size-1;i++){
            array[i] = array[i+1];
        }
        size--;
        return element;
    }
    /**
     * 队列的大小
     * @return 队列包含的元素个数
     */
    @Override
    public int size(){
        return size;
    }
    /**
     * 队列是否为空
     * @return true:空 false：非空
     */
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    /**
     * 队列是否已满
     * @return true 已满，false 不满
     */
    public boolean isFull(){
        return size>= array.length;
    }
}
