package LinearList.Stack;

/**
 * @Author Data
 * @Project
 * @Date 2021-02-21
 * @Version 1.0
 * @Description 链式栈实现
 */

public class LinkStack implements Stack{
    /**
     * 定义一个内部类Node，代表链式栈的结点
     */
    class Node{
        /**
         * 保存数据的data
         */
        private Object data;
        /**
         * 指向下一结点的引用next
         */
        private Node next;
        /**
         * Node类无参构造器
         */
        public Node(){}

        /**
         * Node类的有参构造器
         * @param element 元素
         * @param next 下一结点的指针
         */
        public  Node(Object element,Node next){
            this.data = element;
            this.next = next;
        }
    }
    /**
     * 栈顶元素
     */
    private Node top;
    /**
     * 链式栈的长度
     */
    private int size;
    /**
     * 链式栈的构造器
     */
    public LinkStack(){
        this.top = null;
    }
    /**
     * 栈是否为空
     * @return true 空 false 非空
     */
    @Override
    public boolean isEmpty(){
        return this.top ==null;
    }
    /**
     *  入栈操作
     * @param element 要入栈的元素
     * @return 入栈的结果
     */
    @Override
    public boolean push(Object element){
        if (element ==null){
            throw new RuntimeException("入栈元素为空");
        }
        this.top = new Node(element,this.top);
        size++;
        return true;
    }
    /**
     * 出栈操作
     * @return 出栈的元素
     */
    @Override
    public Object pop(){
        // 判断栈是否为空
        if (isEmpty()){
            throw new RuntimeException("栈为空，无法进行出栈操作");
        }
        Object element = this.top.data;
        this.top = this.top.next;
        size--;
        return element;
    }
    /**
     * 栈的大小
     * @return 返回栈的元素个数
     */
    @Override
    public int size(){
        return size;
    }
}
