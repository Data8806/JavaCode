package LinearList.Queue;

/**
 * @author Data
 * @Project
 * @Date 2021-02-22
 * @Version 1.0
 * @Description 队列的统一接口
 */
public interface Queue {
    /**
     * 添加元素到队列
     * @param element 队尾元素
     */
    void add(Object element);
    /**
     * 从列表获取元素
     * @return 队头元素
     */
    Object take();
    /**
     * 队列大小
     * @return 队列包含的元素个数
     */
    int size();
    /**
     * 队列是否为空
     * @return true：空 false:非空
     */
    boolean isEmpty();
}
