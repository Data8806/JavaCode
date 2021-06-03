package LinearList.Queue;

import org.w3c.dom.Node;

import java.util.List;

/**
 * @Author Data
 * @Project
 * @Date 2021-02-23
 * @Version V1.0
 * @Description 链式队列的实现
 */

public class LinkQueue implements Queue{
    /**
     * 定义一个内部类Node，代表队列结点
     */
    class Node{
        /**
         * 保存结点数据
         */
        private Object data;
        /**
         * 指向下一结点的引用
         */
        private Node next;
        /**
         * 无参构造器
         */
        public Node(){};
        /**
         * 有参构造器
         * @param element 队列结点数据
         * @param next 下一结点的引用
         */
        public Node(Object element,Node next){
            this.data = element;
            this.next = next;
        }
    }
    /**
     * 队头元素的引用
     */
    private Node head;
    /**
     * 队尾元素的引用
     */
    private Node tail;
    /**
     * 队列的长度
     */
    private int size;
    /**
     * 队列的构造器
     */
    public LinkQueue(){
        this.head = null;
    }
    /**
     * 判空
     * @return true,false
     */
    @Override
    public boolean isEmpty(){
        return this.size ==0;
    }

    /**
     * 入队操作
     * @param element 入队的元素
     */
    @Override
    public void add(Object element){
        if (isEmpty()){
            this.head = new Node(element,null);
            this.tail = this.head;
        }
        else{
            tail.next = new Node(element,null);
            tail = tail.next;
        }
        size++;
    }
    /**
     * 出队操作
     * @return 出队的元素
     */
    @Override
    public Object take(){
        Object element = this.head.data;
        this.head = this.head.next;
        size--;
        return element;
    }
    /**
     * 队列的大小
     * @return 队列中元素的个数
     */
    @Override
    public int size(){
        return this.size;
    }
}
